//----------------------------------------------------
// Assignment 2, Part: 1
// Written by: Reuven Ostrofsky
// -----------------------------------------------------
package Addresses;
/**
 * WebPageAddress class holds all attributes og the clinic's WebPage address
 * @author Reuven Ostrofsky
 *
 */
public class WebPageAddress extends domainAddress  {
	/**
	 * Webpage's resource name
	 */
	private String resource;
	
	/**
	 * Parametrized constructor
	 * @param d domainAddress object
	 */
	public WebPageAddress(domainAddress d) {
		super(d);
		
	}
	/**
	 * Second parametrized constructor
	 * @param d domainAddress object
	 * @param resource resource name
	 */
	public WebPageAddress(domainAddress d,String resource) {
		super(d);
		this.resource = resource;
	}
	
	/**
	 * Copy constructor
	 * @param w - WebPageAddress object
	 */
	public WebPageAddress(WebPageAddress w) {
		super(w);
		this.resource = w.resource;
	}
	
	/**
	 * Default constructor
	 */
	public WebPageAddress() {
		super();
	}


	
	/**
	 * Getter method that accesses website's resource name
	 * @return String holding website's resource name
	 */
	public String getResource() {
		return resource;
	}
	/**
	 * Setter method that sets website's resource name
	 * @param resource String holding website's set Resource
	 */
	public void setResource(String resource) {
		this.resource = resource;
	}
	/**
	 * Overridden String method
	 */
	public String toString() {
		if (resource != null)
			return "Website:" + "www." + super.toString() + "/" + resource;
		else 
			return "Website:" + "www." + super.toString();
			
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
		WebPageAddress c = (WebPageAddress) o;
		return this.toString().equals(c.toString()) ;
	}
	
	
	
}