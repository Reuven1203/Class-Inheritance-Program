package Clinic;

import Addresses.*;
/**
 * Driver class has the main method testing out class inheritance and new implemented methods
 */
import Addresses.CivicAddress.province;
import Clinic.Vaccine.vaxType;

public class Driver {
	
	public static void tracePatients(Patient patients[]) {
		System.out.println("The following patient(s) are not fully vaccinated:");
		for(int i = 0; i < patients.length; i++ ) {
			if (patients[i].getDose2() == null || patients[i].getDose1() == null) {
				System.out.println(patients[i].toString());
				System.out.println("\n\n");
			}else if (patients[i].getDose2().getYear() >patients[i].getDose1().getYear())
				if(Integer.valueOf(patients[i].getDose2().getMonth()) >= Integer.valueOf(patients[i].getDose1().getMonth())) {
					if(Integer.valueOf(patients[i].getDose2().getDay()) >= Integer.valueOf(patients[i].getDose1().getDay())){
						System.out.println(patients[i].toString());
						System.out.println("\n\n");
					}
				}
				
			}
		}
	public static Address[] copyAddresses(Address[] a) {
		Address[] b = new Address[a.length];
		for (int i = 0; i < a.length; i++) {
			if (a[i] instanceof CivicAddress) 
				b[i] = new CivicAddress((CivicAddress)a[i]);
			else if (a[i] instanceof EmailAddress)
			b[i] = new EmailAddress((EmailAddress)a[i]);
			else if (a[i] instanceof TelecomAddress)
			b[i] = new TelecomAddress((TelecomAddress)a[i]);
			else if (a[i] instanceof WebPageAddress)
			b[i]= new WebPageAddress((WebPageAddress)a[i]);
			}
		return b;
		
	}
	
	
	

	public static void main(String[] args) {
		//--------
		
		domainAddress decarieDomain = new domainAddress("decariesquare","net");
		Address Decarie[] = {new CivicAddress("Elna","1234", "Decarie","h4w2r2",province.QC),
				new WebPageAddress(decarieDomain,"elnaclinic"),
				new EmailAddress("Decarie_square",decarieDomain),
				new TelecomAddress("5144589785"),decarieDomain};
		
		
		domainAddress glennDomain= new domainAddress("glennhospital","org");
		Address Glenn[] = {new CivicAddress("McGill Health","485", "Sainte-Catherine","r6t2e3",province.QC),
				new WebPageAddress(glennDomain,"mcGill"),
				new EmailAddress("Glennhotpital1234",glennDomain),
				new TelecomAddress("5148975887")};
		
		domainAddress JGdomain = new domainAddress("jewishgeneralhospital","ca");
		Address JewishGeneral[] = {new CivicAddress("Jewish General","3675", "Queen-Mary","H6r3e5",province.QC),
				new WebPageAddress(JGdomain,"patiens"),
				new EmailAddress("JewishGeneral",JGdomain),
				new TelecomAddress("18009754587")
				
		};
		
		domainAddress albertaDomain  =new domainAddress("Albertahospital","ca");
		Address AlbertaHospital[] = {new CivicAddress("Alberta Genral Hospital","158", "Alberta street","y6t5r4",province.AB),
				new WebPageAddress(albertaDomain,"bestHospital"),
				new EmailAddress("AbGeneralHospital",JGdomain),
				new TelecomAddress("18009754587")
				
		};
		Address[][] addresses = {Decarie,Glenn,JewishGeneral,AlbertaHospital};
		System.out.println("Printing all address objects");
		for (int i = 0; i < addresses.length; i++) {
			for (int j = 0; j < addresses[i].length;j++) {
				System.out.println(addresses[i][j]);
			}
			System.out.println("\n");
		}

		System.out.println("Testing equality of objects:\n\n");
		System.out.println("The civic Address of Decarie and Glenn equality is:"+Decarie[0].equals(Glenn[0]));
		
		
		//---------
		
	
		
		
		Patient Reuven = new Patient("Reuven","12489","Reuven1203@gmail.com","5145617388",new Vaccine(2,12,2021,vaxType.PFIZER,Decarie),null); 
		Patient Mark = new Patient("Mark","06457","Mark_p123@mail.concordia.ca","4387648905",new Vaccine(2,12,2021,vaxType.PFIZER,Decarie),new Vaccine(30,12,2021,vaxType.ASTRAZENICA,Glenn));
		Patient Chris = new Patient("Chris","7125","Chris123@yahoo.ca","5146794623",new Vaccine(30,12,2021,vaxType.ASTRAZENICA,JewishGeneral),new Vaccine(31,12,2022,vaxType.ASTRAZENICA,Glenn));
		Patient Steve = new Patient("Steve","789248","Steve123@yahoo.ca","5146789723",new Vaccine(29,10,2021,vaxType.OTHER,AlbertaHospital),new Vaccine(31,12,2021,vaxType.ASTRAZENICA,Glenn));
		Patient Jerry = new Patient("Jerry","48952","JerryLikesPizza@outlook.com","5148965235",new Vaccine(29,10,2021,vaxType.PFIZER,Decarie),new Vaccine(31,12,2021,vaxType.PFIZER,Decarie));
		Patient Jerry2 = new Patient("Jerry","48952","JerryLikesPizza@outlook.com","5148965235",new Vaccine(29,10,2021,vaxType.PFIZER,Decarie),new Vaccine(31,12,2021,vaxType.PFIZER,JewishGeneral));
		Patient Gilbert = new Patient("Gilbert","458956","GilbertLikesPizza@outlook.com","5148965235",new Vaccine(29,10,2021,vaxType.PFIZER,Decarie),new Vaccine(31,12,2021,vaxType.PFIZER,JewishGeneral));
		Patient Paul = new Patient ("Paul","568478","_Paul23@gmail.com","4358965784",new Vaccine(29,10,2021,vaxType.PFIZER,Decarie),new Vaccine(31,12,2021,vaxType.PFIZER,Decarie));
		Patient Stephanie = new Patient("Stephanie","4589568741","Stephanie789@yahoo.ca","5149987755",new Vaccine(29,10,2021,vaxType.PFIZER,Decarie),new Vaccine(31,12,2021,vaxType.PFIZER,JewishGeneral));
		Patient Jonathan = new Patient("Jonathan","45895699741","Stephanie789@yahoo.ca","5149987755",new Vaccine(29,10,2021,vaxType.PFIZER,Decarie),new Vaccine(31,12,2021,vaxType.PFIZER,JewishGeneral));
		Patient Albert = new Patient("Albert","4589566641","Albert55@yahoo.ca","5149987755",new Vaccine(29,10,2021,vaxType.PFIZER,Decarie),new Vaccine(31,12,1,vaxType.PFIZER,JewishGeneral));
		Patient Vanessa = new Patient("Vanessa","4544568741","Vanessa66@yahoo.ca","5142587755",new Vaccine(29,10,2021,vaxType.PFIZER,Decarie),new Vaccine(31,12,2021,vaxType.PFIZER,JewishGeneral));
		Patient Natalie = new Patient("Natalie","4533568741","Natalie77@yahoo.ca","5149988755",new Vaccine(29,10,2021,vaxType.PFIZER,Decarie),new Vaccine(31,12,2021,vaxType.PFIZER,JewishGeneral));
		Patient Karen = new Patient("Karen","4589511741","Karen88@yahoo.ca","5149987965",new Vaccine(29,10,2021,vaxType.PFIZER,Decarie),new Vaccine(31,12,2021,vaxType.PFIZER,JewishGeneral));
		Patient Gerald = new Patient("Gerald","4522568741","Gerald99@yahoo.ca","4387987755",new Vaccine(29,10,2021,vaxType.PFIZER,Decarie),new Vaccine(31,12,2021,vaxType.PFIZER,JewishGeneral));

		Patient[] patients = {Reuven,Mark,Chris,Steve,Jerry,Jerry2,Gilbert,Paul,Stephanie,Jonathan,Albert,Vanessa,Natalie,Karen,Gerald};
		
		
		for (int i = 0; i < patients.length;i++) {
			System.out.println(patients[i]);
		}
		
		
		System.out.println("Testing the tracePatients() nethod");
		tracePatients(patients);
		System.out.println("Testing the copyAddresses() method");
		Address[] AlbertaHospitalCopy = Driver.copyAddresses(AlbertaHospital);
		System.out.println("Displaying the original Address of Alberta Hospital:");
		for (int i = 0; i < AlbertaHospitalCopy.length;i++) {
			System.out.println(AlbertaHospital[i]);
		}

		System.out.println("\nThis is the copied address of Alberta Hospital");
		for (int i = 0; i < AlbertaHospitalCopy.length;i++) {
			System.out.println(AlbertaHospitalCopy[i]);
		}

		
		
		System.out.println("\n\nProgram terminated");
		
	}

}

