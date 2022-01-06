//----------------------------------------------------
// Assignment 2, Part: 1
// Written by: Reuven Ostrofsky
// -----------------------------------------------------
package Addresses;
/**
 * TelecomAddress class holds all attributes of the clinic's telecom address
 * @author Reuven Ostrofsky
 *
 */
public class TelecomAddress extends Address {
	/**
	 * Clinic's telecom number
	 */
	String number;
	/**
	 * Area code of the phone number
	 */
	String areaCode;
	/**
	 * Parametrized constructor
	 * @param number Holds clinic's phone number 
	 */
	public TelecomAddress(String number) {
		this.number = number;
		this.areaCode = number.substring(0, 3);
	}
	/**
	 * Default constructor
	 */
	public TelecomAddress() {
		this.number = "NNNXXXXXXX";
		this.areaCode = number.substring(0, 3);
	}
	/**
	 * Copy constructor
	 * @param t TelecomAddress object in which the constructor copies
	 */
	public TelecomAddress(TelecomAddress t) {
		this.number = t.number;
		this.areaCode = t.areaCode;
	}
	/**
	 * Overriden toStringMethod
	 */
	public String toString() {
		
			return "1" + "-" + areaCode + "-" + number.substring(3, 6) + "-" + number.substring(6,10);
		
	}
	/**
	 * Overriden equals method
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
		TelecomAddress t = (TelecomAddress) o;
		return this.number == t.number;
	}
	/**
	 * Getter method that accesses clinic's telecom number
	 * @return String holding clinic's telecom number 
	 */
	public String getNumber() {
		return number;
	}
	/**
	 * Setter method setting clinic's telecom number
	 * @param number String holding the clinic's set number
	 */
	public void setNumber(String number) {
		this.areaCode = number.substring(0, 3);
		this.number = number;
	}
	/**
	 * Getter method Accessing the clinic's area code
	 * @return String holding clinic's area code
	 */
	public String getAreaCode() {
		return areaCode;
	}
	/**
	 * Setter method setting Clinic's area code
	 * @param areaCode String holding clinic's set area code
	 */
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	

    
}