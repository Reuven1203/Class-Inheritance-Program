//----------------------------------------------------
// Assignment 2, Part: 1
// Written by: Reuven Ostrofsky
// -----------------------------------------------------
package Addresses;


/**
 * The CivicAddress class holds all attributes of the Clinic's civic information along with its name
 * @author reuvenostrofsky
 *
 */
public class CivicAddress extends Address{
	/**
	 * Clinic's name
	 */
	private String clinicName;
	/**
	 * city where the clinic is located
	 */
	private String city;
	/**
	 * clinic's street address
	 */
	private String streetAdd;
	/**
	 * Province where the clinic is located
	 * @author reuvenostrofsky
	 *
	 */
	public enum province {
		AB,BC, MB, NB, NL, NT, NS, NU, ON,
		PE, QC, SK, YT
	};
	/**
	 * province where clinic is located
	 */
	private province province;
	/**
	 * clinic's postal code
	 */
	private String postalCode;
	
	/**
	 * Parametrized constructor
	 * @param clinicName Holds the clinic's name
	 * @param streetAdd Holds the clinics street address
	 * @param city holds the clinic's city location
	 * @param postalCode holds the clinic's postal code
	 * @param province holds the clinic's province
	 */
	public CivicAddress(String clinicName,String streetAdd, String city, String postalCode, province province) {
		this.clinicName = clinicName.toUpperCase();
		this.city = city.toUpperCase();
		this.streetAdd = streetAdd.toUpperCase();
		this.province = province;
		this.postalCode = postalCode.toUpperCase();
		
	}
	/**
	 * Default constructor
	 */
	public CivicAddress() {
		this.clinicName = "Unknown";
		this.city = "Unknown";
		this.streetAdd = "XXX";
		this.province = null;
		this.postalCode = "XXXXXX";
	}
	/**
	 * Copy construcor
	 * @param c CivicAddress object in which the constructor copies
	 */
	public CivicAddress(CivicAddress c) {
		this.clinicName = c.clinicName;
		this.streetAdd = c.streetAdd;
		this.city = c.city;
		this.province = c.province;
		this.postalCode = c.postalCode;
	}

	/**
	 * Getter method that accesses clinic's province
	 * @return  An enum object that returns province's abbrevation
	 */
	public province getProvince() {
		return province;
	}
	/**
	 * Setter method that sets clinic's province
	 * @param province enum object of type province
	 */
	public void setProvince(province province) {
		this.province = province;
	}
	/**
	 * Getter method that accesses clinic's postal code
	 * @return String containing clininc's postal code
	 */
	public String getPostalCode() {
		return postalCode;
	}
	/**
	 * Setter method that sets clinic's postal code
	 * @param postalCode String that sets clinic's postal code
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	/**
	 * Getter method that accesses clinic's street address
	 * @return string containing clinic's street address
	 */
	public String getstreetAdd() {
		return streetAdd;
	}
	/**
	 * Setter method that sets clinic's street address
	 * @param streetAdd string containing clinic's street address
	 */
	public void setstreetAdd(String streetAdd) {
		this.streetAdd = streetAdd;
	}
	/**
	 * Overriden String method that returns the clinic's civic address information
	 * @return All civic address attributes
	 */
	public String toString() {
		return "Clinic: " + clinicName + "\n" + streetAdd + "," + city + ", " + province + ", " + postalCode;
	}
	/**
	 * Overridden equals method that tests the equality of two objects of type CivicAddress
	 */
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null) {
			return false;
		}
		if (this.getClass() != o.getClass()) {
			return false;
		}
		CivicAddress c = (CivicAddress) o;
		return this.toString().equals(c.toString()) ;
		
	}

	
	
	
    
}