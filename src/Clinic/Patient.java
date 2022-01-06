//----------------------------------------------------
// Assignment 2, Part: 1
// Written by: Reuven Ostrofsky
// -----------------------------------------------------
package Clinic;

/**
 * Patient class holds all attributes of the patient 
 * @author Reuven Ostrofsky
 *
 */
public class Patient {
	/**
	 * Patient's name
	 */
	private String name;
	/**
	 * Patient's health card number
	 */
	private String cardNum;
	/**
	 * Patient's email address
	 */
	private String email;
	/**
	 * Patient's phone number
	 */
	private String phone;
	/**
	 * Patient's 1st vaccine dose
	 */
	private Vaccine dose1;
	/**
	 * Patiens's 2nd vaccine dose
	 */
	private Vaccine dose2;
	
	
	//Contructors
	/**
	 * Parametrized constructor
	 * @param name String holding patient's name
	 * @param cardNum String holding patient's card number
	 * @param email String holding Patient's email
	 * @param phone String holding patient's phone number
	 * @param d1 Vaccine Object holding 1st dose information
	 * @param d2 Vaccine Object holding 2nd dose information
	 */
	public Patient(String name, String cardNum, String email, String phone, Vaccine d1,Vaccine d2) {
		this.name = name;
		this.cardNum = cardNum;
		this.email = email;
		this.phone = phone;
		this.dose1 = d1;
		this.dose2 = d2;
	}
	/**
	 * Default constructor
	 */
	public Patient() {
		this.name = "Unknown";
		this.cardNum = "Undefined";
		this.email = "Unknown@domaiName.tld";
		this.phone = "XXXXXXXXXX";
		this.dose1 = null;
		this.dose2 = null;
	}
	/**
	 * Copy constructor
	 * @param p Patient object that is being copied
	 */
	public Patient(Patient p) {
		this.name = p.name;
		this.cardNum = p.cardNum;
		this.email = p.email;
		this.phone = p.phone;
		this.dose1 = p.dose1;
		this.dose2 = p.dose1;

	}

	/**
	 * Getter method that accesses patient's name
	 * @return String holding patient's name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter method that sets patient's name
	 * @param name holds patient's set name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter method that accesses patient's card number
	 * @return String that holds  patient's card number
	 */
	public String getCardNum() {
		return cardNum;
	}

	/**
	 * Setter method that sets  patient's card number
	 * @param cardNum String holding  patient's card number
	 */
	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}

	/**
	 * Getter method that accesses patient's email address
	 * @return String holding  patient's email address
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Setter method that sets 
	 * @param email String holding patient's set email address
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Getter method accessing patient's phone number
	 * @return String holding patient;s phone number
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * Setter method that sets patients phone number
	 * @param phone String that holds patient's set phone number
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * Getter method that accesses patient's first dose
	 * @return toString() of Vaccine class
	 */
	public Vaccine getDose1() {
		return dose1;
	}

	/**
	 * Setter method that sets patient's 1st dose
	 * @param dose1 Vaccine type object
	 */
	public void setDose1(Vaccine dose1) {
		this.dose1 = dose1;
	}

	/**
	 * Getter method that accesses patient's second dose
	 * @return toString() of Vaccine class
	 */
	public Vaccine getDose2() {
		return dose2;
	}

	/**
	 * Setter method that sets patient's 2nd dose
	 * @param dose2 Vaccine type object
	 */
	public void setDose2(Vaccine dose2) {
		this.dose2 = dose2;
	}
	/**
	 * Overidden toString() method
	 */
	public String toString() {
		if (dose1 == null && dose2 == null) {
		return"Name:" + name + "\nCard number:" + cardNum + "\nE-mail:" + email + "\nPhone:" + phone + "\nDose 1:Not taken" + "\nDose 2 valid date: 4 weeks after dose 1 has been taken ";
		}else if (dose2 == null) {
			secDoseValid();
			return"Name:" + name + "\nCard number:" + cardNum + "\nE-mail:" + email + "\nPhone:" + phone + "\nDose 1: " + dose1 + "\nDose 2:" + secDoseValid();
		}else
			return"Name:" + name + "\nCard number:" + cardNum + "\nE-mail:" + email + "\nPhone:" + phone + "\nDose 1: " + dose1 + "\nDose 2:" + dose2;
				
			
		
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
		Patient p = (Patient) o;
		return this.name == p.name && this.phone == p.phone && this.cardNum == p.cardNum && this.email == p.email && this.dose1 == p.dose1 && this.dose2 == p.dose2;
		
	}
	/**
	 * Method that calculates when patient is valid for second dose
	 * @return String holding second dose valid date
	 */
	private String secDoseValid() {
		int monthDays = 0;
		int[] month = {0,1,2,3,4,5,6,7,8,9,10,11};
		int dose2year;
		int dose2month;
		int dose2day;
		String dayString;
		String monthString;
		switch(month[Integer.valueOf(dose1.getMonth())-1]) {
		case 0 ,2,4,6,7,11:
			monthDays = 31;
			break;
		case 3,5,8,10:
			monthDays = 30;
			break;
			
		case 1:
			monthDays = 28;
			break;
			
		}
		
		if (Integer.valueOf(dose1.getDay()) +28 > monthDays) {
			if (!dose1.getMonth().equals("12")) {
			dose2year = (dose1.getYear());
			dose2month = (Integer.valueOf(dose1.getMonth())+1);
			}else {
			dose2year = (dose1.getYear()+1);
			dose2month = 1;
			}
			
			dose2day = (Integer.valueOf(28-(monthDays-Integer.valueOf(dose1.getDay()))));
			
		}else
			dose2day = (Integer.valueOf(dose1.getDay())+28);
			dose2month = (Integer.valueOf(dose1.getMonth()));
			dose2year = (Integer.valueOf(dose1.getYear()));
		
		if (dose2day < 10) 
			dayString = "0" + dose2day;
		else
			dayString = dose2day + "";
		
		if (dose2month < 10)
			monthString = "0"+dose2month;
		else
			monthString = dose2month +"";
		
		return dose2year + "-" + monthString + "-" + dayString;
		
	}
	/**
	 * method to change patient's vaccine dose date
	 * @param month integer holding the month
	 * @param day integer holding the day
	 * @param year integer holding the year
	 */
	public void changeDoseDate(int month,int day,int year) {
		dose1.setMonth(month);
		dose1.setDay(day);
		dose1.setYear(year);
		dose1.date = dose1.getDate();


	} 
	/**
	 * Method that sends the patient a reminder through sms and email the vaccination date
	 */
	public void sendReminder() {
			if (dose1 != null){
			System.out.println("Send to" + phone + " and " + email + ":Your appointment for your first vaccination dose is " + dose1.getDate());
			System.out.println("Send to: " + phone + " and " + email + ":Your appointment for your second vaccination dose is " + secDoseValid());
			}
		
	}
	
	
	
	
}
