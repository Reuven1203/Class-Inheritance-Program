
// Assignment 2, Part: 1
// Written by: Reuven Ostrofsky
// -----------------------------------------------------
package Clinic;

import Addresses.*;
/**
 * Vaccine class handle all attributes of a vaccine, and its date it has been injected
 * @author Reuven Ostrofsky
 *
 */
public class Vaccine  {
	//Attributes
	/**
	 * Type of commercial vaccine patient has gotten
	 */
	public enum vaxType {
		PFIZER,
		MODERNA,
		ASTRAZENICA,
		OTHER;
	}
	/**
	 * vaxType object holding the vaccine's type
	 */
	private vaxType type;
	/**
	 * Date of Patient's 1st dose 
	 */
	/**
	 * Integer holding the day the vaccine has been given 
	 */
	private int day;
	/**
	 * Integer holding the month the vaccine has been given 
	 */
	private int month;
	/**
	 * Integer holding the year the vaccine has been given 
	 */
	private int year;
	/**
	 * Integer holding the year the vaccine has been given 
	 */
	/**
	 * String holding the full date the vaccine has been given
	 */
	public String date;
	/**
	 * Address array holding all descendant objects of Address of a clinic
	 */
	Address[] address;
	
	
	//Constructors
	/**
	 * Parametrized constructor
	 * @param day String holding vaccine's day
	 * @param month String holding vaccine's month
	 * @param year String holding vaccine's month
	 * @param type enum of tyoe vaxType holding the vaccine's type
	 * @param address array of Address type from where the vaccine has been given
	 */
	public Vaccine(int day,int month,int year, vaxType type, Address[] address) {
		this.day = day;
		this.month = month;
		this.year = year;
		this.date = year + "-" + getMonth() + "-" + getDay();
		this.type = type;
		this.address = address;
		}
	/**
	 * Default constructor
	 */
	public Vaccine() {
		this.date = "YYYY-MM-DD";
		this.type = null;
		this.address = null;
	}
	
	
	/**
	 * Copy constructor
	 * @param v Vaccine Object that is copied
	 */
	public Vaccine(Vaccine v) {
		this.date = v.date;
		this.type = v.type;
		this.address = v.address;
		
	}

	
	/**
	 * Getter method accessing the vaccine's type
	 * @return vaxType holding the vaccine's type
	 */
	public vaxType getType() {
		return type;
	}
	/**
	 * Setter method that sets the vaccine type
	 * @param type vaxType holding the vaccine type
	 */
	public void setType(vaxType type) {
		this.type = type;
		
	}
	/**
	 *  Setter method that sets the vaccine type
	 * @param type Stirng holding the vaccine type
	 */
	public void setType(String type) {
		this.type = vaxType.valueOf(type.toUpperCase());
	}
	/**
	 * Getter method accessing the day the vaccine has been given 
	 * @return String holding the date's day
	 */
	public String getDay() {
		if(day <10) {
			return "0" + day;
		}
		else
			return day + "";
	}
	/**
	 * Setter method setting the vaccine's date day
	 * @param day integer holding the date's day
	 */
	public void setDay(int day) {
		this.day = day;
	}
	/**
	 * Getter method accessing the vaccine's month 
	 * @return String holding the date's month 
	 */
	public String getMonth() {
		if (month < 10) {
			return "0" + month;
		}
		else
			return month + "";
	}
	/**
	 * Setter method that sets the  month when the vaccine is given
	 * @param month Integer holding the date's month
	 */
	public void setMonth(int month) {
		this.month = month;
	}
	/**
	 * Getter method that accesses the year when the vaccine was given 
	 * @return integer holding the date's year
	 */
	public int getYear() {
		return year;
	}
	/**
	 * Setter method that sets the year the vaccine has been given 
	 * @param year
	 */
	public void setYear(int year) {
		this.year = year;
	}
	
	/**
	 * Overriden toString()
	 */
	public String toString() {
		return type + ", " + date + "\n" + printClinicInfo();
		
		
	}
	
	/**
	 * Overidden equals method
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
		
		Vaccine v = (Vaccine) o;
		return this.type == v.type && this.date == v.date;
	}
	/**
	 * Getter method that accesses the full date the vaccine has been given 
	 * @return String holding the full date
	 */
	public String getDate() {
		return date = year + "-" + getMonth() + "-" + getDay();
	}

	
	/**
	 * Method that takes all the objects in the address array and prints all of the Clinic's infp
	 * @return String holding all the clinic's info
	 */
	public String printClinicInfo() {
		String info = "";
		for (int i = 0; i<address.length;i++) {
		info += address[i] + "\n";
		}
		return info;
		
	}
	
	
	

	

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
