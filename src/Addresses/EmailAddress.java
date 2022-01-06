//----------------------------------------------------
// Assignment 2, Part: 1
// Written by: Reuven Ostrofsky
// -----------------------------------------------------
package Addresses;
/**
 * Clinic's email address extending domainAddress
 * @author Reuven Ostrofsky
 *
 */
public class EmailAddress extends domainAddress {
	/**
	 * Clinic's email user name
	 */
	private String userName;
	
	/**
	 * Parametrized constructor
	 * @param userName Holds email user name
	 * @param d domainAddress object
	 */
	public EmailAddress(String userName,domainAddress d) {
		super(d);
		this.userName = userName;
	}
	
	/**
	 * default constructor
	 */
	public EmailAddress() {
		super();
	}
	/**
	 * Copy constructor
	 * @param e EmailAddress object in which the constructor copies
	 */
	public EmailAddress(EmailAddress e) {
		super(e);
		this.userName = e.userName;
	}
	
	
	
	
	
	
	/**
	 * Getter method that accesses the email's user name
	 * @return String holding email's user name
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * Setter method that sets email's user name
	 * @param userName String holding the setted user name
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	/**
	 * Ovveriden toString() method
	 */
	public String toString() {
		return "Email:"+this.userName + "@" + super.toString();
	}

	/**
	 * Overridden equals method that tests the equality of two objects of type EmailAddress
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
		EmailAddress c = (EmailAddress) o;
		return this.toString().equals(c.toString()) ;
	}
    
}
