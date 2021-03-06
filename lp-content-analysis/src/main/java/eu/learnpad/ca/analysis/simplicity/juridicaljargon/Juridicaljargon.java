package eu.learnpad.ca.analysis.simplicity.juridicaljargon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
		"Description"
})
public  class Juridicaljargon {

	@XmlElement(name="description", required = true)
	protected String Description;
	@XmlAttribute(name = "jj")
	protected String jj;
	@XmlAttribute(name = "ref")
	protected String ref;

	public Juridicaljargon(){

	}

	public Juridicaljargon(String j){
		this.jj=j;
	}

	/**
	 * Recupera il valore della proprietà description.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	public String getDescription() {
		return Description;
	}

	/**
	 * Imposta il valore della proprietà description.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	public void setDescription(String value) {
		this.Description = value;
	}

	/**
	 * Recupera il valore della proprietà jj.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	public String getJj() {
		return jj;
	}

	/**
	 * Imposta il valore della proprietà jj.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	public void setJj(String value) {
		this.jj = value;
	}

	/**
	 * Recupera il valore della proprietà ref.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	public String getRef() {
		return ref;
	}

	/**
	 * Imposta il valore della proprietà ref.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	public void setRef(String value) {
		this.ref = value;
	}

	@Override
	public String toString() {
		return "Juridicaljargon=" + jj + ", description=" + Description
				+ ", ref=" + ref + "\n";
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Juridicaljargon){
			Juridicaljargon objj = (Juridicaljargon) obj;
			return	this.getJj().toLowerCase().equals(objj.getJj().toLowerCase());
		}
		return super.equals(obj);
	}





}

