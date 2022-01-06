//----------------------------------------------------
// Assignment 2, Part: 1
// Written by: Reuven Ostrofsky
// -----------------------------------------------------
package Addresses;
/**
 * domainAddress class holds the website domain attributes of the clinic
 * @author Reuven Ostrofsky
 *
 */

public class domainAddress extends Address {
	/**
	 * Clinic's website domain name
	 */
	private String domain;
	/**
	 * Clinic's website TLD
	 */
	private String tld;
	
	/**
	 * Parametrized constructor
	 * @param domain Holds clinic's domain name
	 * @param tld Holds clinic's tld
	 */
	public domainAddress(String domain,String tld) {
		this.domain = domain.replaceAll(" ", "");
		this.tld = tld;
		
	}
	/**
	 * Default constructor
	 */
	public domainAddress() {
		this.domain = "ClinicName";
		this.tld = "com";
	}
	/**
	 * Copy constructor
	 * @param d domainAddress object in which the constructor copies
	 */
	public domainAddress(domainAddress d) {
		this.domain = d.domain;
		this.tld = d.tld;
	}
	/**
	 * Getter method that accesses clinic's domain
	 * @return String holding the domain name
	 */
	public String getDomain() {
		return domain;
	}
	/**
	 * Setter method that sets clinic's domain name
	 * @param domain String holding the clinic's changed domain name
	 */
	public void setDomain(String domain) {
		this.domain = domain;
	}
	/**
	 * Getter method that accesses clinic's domain TLD
	 * @return String holding domain's TLD
	 */
	public String getTld() {
		return tld;
	}
	/**
	 * Setter method that sets clinic's domain TLD
	 * @param tld String holding the domain's changed TLD
	 */
	public void setTld(String tld) {
		this.tld = tld;
	}
	/**
	 * Overriden String method that returns the clinic's domain
	 * @return String holding all domain attributes
	 */
	public String toString() {
		return domain + "." + tld;
	}
	/**
	 * Overridden equals method that tests the equality of two objects of type domainAddress
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
		domainAddress c = (domainAddress) o;
		return this.toString().equals(c.toString()) ;
	}
	
	
	
	

}
