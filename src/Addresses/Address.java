// -----------------------------------------------------
// Assignment 2, Part: 1
// Written by: Reuven Ostrofsky
// -----------------------------------------------------
package Addresses;
/**
 * Base abtract class of all Address type classes
 * @author reuvenostrofsky
 *
 */
abstract public class Address {
	
	
	/**
	 * All classes to have a toString() method overidden
	 */
	public abstract String toString();
	
	/**
	 * All classes to have a equals() method overridden
	 */
	public abstract  boolean equals(Object o);
	
	
}
