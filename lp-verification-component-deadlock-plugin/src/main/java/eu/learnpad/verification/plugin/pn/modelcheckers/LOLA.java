package eu.learnpad.verification.plugin.pn.modelcheckers;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;

import eu.learnpad.verification.plugin.pn.PetriNet;
import eu.learnpad.verification.plugin.pn.PetriNet.PL;
import eu.learnpad.verification.plugin.utils.IOUtils;

public class LOLA {
	
	public static String sync_getVerificationOutput(String lolaBinPath, String modelToVerify, String propertyToVerify) throws Exception{
		final int timeoutInMinutes = 5;
		String filePath = System.getProperty("java.io.tmpdir") + java.util.UUID.randomUUID() + ".lola";
		IOUtils.writeFile(modelToVerify.getBytes(), filePath, false);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		final Process proc = Runtime.getRuntime().exec(lolaBinPath + " --formula=\""+propertyToVerify+"\" -p -s -q --threads=4 --search=cover " + filePath); // params: -p -s -q --json --threads=2 --search=cover
		IOUtils.inheritIO(proc.getInputStream(), ps);
		IOUtils.inheritIO(proc.getErrorStream(), ps);
		Thread timerThread = new Thread() {
	        public void run() {
	            try {
	            	Thread.sleep(1000*60*timeoutInMinutes);
	                proc.destroy();
	            } catch (InterruptedException e) {}
	        };
	    };
	    timerThread.start();
		proc.waitFor();
		timerThread.interrupt();
		new File(filePath).delete();
		return baos.toString();
	}

	public static boolean isPropertyVerified(String lolaOutput){
		if(lolaOutput.isEmpty())
			return false;
		
		if(lolaOutput.contains("NOSTATE"))
			return false;
		else
			return true;
	}
	
	public static String[] getCounterExample(String lolaOutput, PetriNet pn) throws Exception{
		if(!isPropertyVerified(lolaOutput))
			throw new Exception("ERROR: The property is not verified so a counter example can not exist.");
		
		if(lolaOutput.isEmpty())
			return new String[0];
		
		String newLineChar = "\r\n";
		if(!lolaOutput.contains("\r\n"))
			newLineChar = "\n";
		
		ArrayList<String> transitionTraceList = new ArrayList<String>();
		String[] traceRowList = lolaOutput.split(newLineChar);
		for(String traceRow:traceRowList)
			if(!traceRow.contains(":"))
				transitionTraceList.add(traceRow);
		
		ArrayList<String> placeTraceList = new ArrayList<String>();
		PetriNet pnc = pn.clonePN();
		ArrayList<PL> placeList = pnc.getPlaceList_safe();
		
		for(String transitionTrace:transitionTraceList){
			int[] currentMark = pnc.getCurrentMark();
			String places = "";
			for(int i=0;i<currentMark.length;i++)
				if(currentMark[i]!=0)
					places += placeList.get(i).name+" ";
			placeTraceList.add(places);

			pnc.fireTransition(pnc.getTransition(transitionTrace));
		}
		{
			int[] currentMark = pnc.getCurrentMark();
			String places = "";
			for(int i=0;i<currentMark.length;i++)
				if(currentMark[i]!=0)
					places += placeList.get(i).name+" ";
			placeTraceList.add(places);
		}
		
		//pn = originalNet;
		
		String[] ret = new String[placeTraceList.size()];
		placeTraceList.toArray(ret);
		return ret;
	}
	
	/*
	public static void main(String[] args) {
		try{
			//TODO: con test_1 e 7 lola esplode in stati! Fare piu test con il parametro --search=cover 
			String bpmnUrl = "D:\\LAVORO\\PROGETTI\\PNToolkit\\testModels\\test_9.bpmn";
			PetriNet pn = PNImport.generateFromBPMN(XMLUtils.getXmlDocFromURI(bpmnUrl));
			//pn.getPlace("pTask1").excludeFromDeadlockCheck=true;
			//pn.getPlace("pSequenceFlow17").excludeFromDeadlockCheck=true;
			//pn.getPlace("pStartEvent1").excludeFromDeadlockCheck=true;
			
			//pn = it.unicam.cs.pn.algorithms.Algorithms.generateReducedNet(pn);
			
			String modelToVerify = PNExport.exportTo_LOLA(pn);
			String propertyToVerify = PNExport.exportTo_LOLA_property_DeadlockPresence(pn);
			//System.out.println(modelToVerify);
			//System.out.println(propertyToVerify);
			
			String out = LOLA.sync_getVerificationOutput("D:\\LAVORO\\PROGETTI\\PNToolkit\\verifier\\lola-2.0-cygwin.exe", modelToVerify, propertyToVerify);
			System.out.println(out);
			System.out.println("Is property verified? " + LOLA.isPropertyVerified(out));
			if(!LOLA.isPropertyVerified(out))
				return;
			String[] traceList = LOLA.getCounterExample(out, pn);
			for(String trace:traceList)
				System.out.println(trace);
				
		}catch(Exception ex){ex.printStackTrace();}
	}
	*/
}