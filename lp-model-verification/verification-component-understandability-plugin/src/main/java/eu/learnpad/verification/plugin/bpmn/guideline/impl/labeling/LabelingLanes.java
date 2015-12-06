package eu.learnpad.verification.plugin.bpmn.guideline.impl.labeling;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.bpmn2.Definitions;
import org.eclipse.bpmn2.FlowElement;
import org.eclipse.bpmn2.LaneSet;
import org.eclipse.bpmn2.Process;
import org.eclipse.bpmn2.RootElement;

import eu.learnpad.verification.plugin.bpmn.guideline.impl.abstractGuideline;
import eu.learnpad.verification.plugin.utils.ElementID;

public class LabelingLanes extends abstractGuideline{


	public LabelingLanes(Definitions diagram) {
		super(diagram);
		this.id = "29";
		this.Description = "Lanes must always have a label. The label should identify the responsi- ble entity for the process. Lanes are often used for representing things as internal roles (e.g., manager, associate), systems (e.g., an enterprise application), or internal departments (e.g., shipping, finance).";
		this.Name = "Labeling Lanes";


	}

	@Override
	protected void findGL(Definitions diagram) {
		StringBuilder temp = new StringBuilder();
		Collection<FlowElement> elementsBPMNtemp = new ArrayList<FlowElement>();
		Collection<ElementID> Elementstemp = new ArrayList<ElementID>();
		int num = 0;
	
		
		for (RootElement rootElement : diagram.getRootElements()) {
			if (rootElement instanceof Process) {
				Process process = (Process) rootElement;
				//System.out.format("Found a process: %s\n", process.getName());
				
				IDProcess = process.getId();
				List<LaneSet> lanes = process.getLaneSets();
				for (LaneSet laneSet : lanes) {
					if(laneSet.getName()==null){
						//elementsBPMNtemp.add(laneSet);
						Elementstemp.add(new ElementID(laneSet.getId(),IDProcess));
						String name = laneSet.getName()!=null? laneSet.getName() : "Unlabeled"; 
						temp.append("* name=" + name + " ID=" + laneSet.getId()
								+ "\n");
					}
				}
				
			}
		}
		if (num>1) {
			elementsBPMN.addAll(elementsBPMNtemp);
			setAllElements(Elementstemp);
			this.Suggestion += "\nLabeling Lanes:" + temp;
			this.status = false;
		}else{
			this.status = true;
			this.Suggestion += "Well done!";
		}
	}

	

}