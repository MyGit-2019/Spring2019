package ReplAssignments;

import java.util.Scanner;

public class CarInsuranceQuote {

	private static int count;

	public static void main(String[] args) {

	    double premium = 0;
					int accidentsAmount = 0;
					int daysDrivenToWorkOrSchool = 0;
					int milesToWorkOrSchool = 0;
					int zipCode=0;
					int age=37;
					
					 
					String vehicleOwnership = "";
					String vehicleUsage = "";
					String continuousInsurance = "";
					String education = "";
					String name = "";
					String referenceNumber = "";
					Scanner scan = new Scanner(System.in);
					System.out.println("Welcome to the CountyFarm car insurance!");
			    //WRITE YOUR CODE HERE
			    
			    // car ownership mehmet abi
			    System.out.println("Enter your name");
			    name=scan.nextLine();
			    System.out.println("Do you have a US driver license?");
			    String haveUsDriverLicense=scan.nextLine();
			    if (haveUsDriverLicense.equalsIgnoreCase("No")){
			      System.out.println("Invalid data!");
			      System.exit(0);
			    }
			    System.out.println("Enter your zip code");
			    zipCode=scan.nextInt();
			    if (zipCode==20910||zipCode==20740) premium+=60;
			    else if (zipCode==22102||zipCode==22103) premium+=30;
			    else premium+=50;
			    
			    System.out.println("Is this vehicle Owned, Financed, or Leased?");
			    vehicleOwnership=scan.next();
			    premium=(vehicleOwnership.equalsIgnoreCase("Owned"))?premium+10:premium+20;
			    
			    
			    
			    
			    
			    // car usage and if/else  tuba abla 
			    
			    System.out.println("How is this vehicle primarily used?");
			    vehicleUsage=scan.next();
			    
			    if(vehicleUsage.equalsIgnoreCase("Business")){
			        premium +=50;
			        //System.out.println("Days Driven To Work And/Or  School");
				      //daysDrivenToWorkOrSchool=scan.nextInt();
				      //premium+=5*daysDrivenToWorkOrSchool;
				    //System.out.println("Miles Driven To Work And/Or School");
				      //milesToWorkOrSchool=scan.nextInt();
				      //premium +=1*milesToWorkOrSchool;
			    }else if(vehicleUsage.equals("Pleasure")){
			    	
			        premium +=10;
			    }else if(vehicleUsage.equals("Commute")){
			        premium +=20;
			        System.out.println("Days Driven To Work And/Or School");
				      daysDrivenToWorkOrSchool=scan.nextInt();
				      premium+=5*daysDrivenToWorkOrSchool;
				    System.out.println("Miles Driven To Work And/Or School");
				      milesToWorkOrSchool=scan.nextInt();
				      premium +=1*milesToWorkOrSchool;
			    }
			  
			     
			    
			    
			    
			    // Fran Driving experience  write under
			    
			      System.out.println("How old are you?");
			       age = scan.nextInt();
			       if (age<16) {System.out.println("Invalid data!");System.exit(0);}
			      
			      
			      
			      System.out.println("How many years you've been driving?");
			      int yrsExperience = scan.nextInt();
			      premium-=5*yrsExperience;
			      if (yrsExperience > 0 && (age-yrsExperience  > 16)) {
			        System.out.println("Have you had any accidents in the last 5 years?");
			        String isAccident = scan.next();
			        if(isAccident.equalsIgnoreCase("Yes")) {
			          System.out.println("How many?");
			          accidentsAmount = scan.nextInt();
			          premium = premium + (premium * 20 / 100) * accidentsAmount;
			        }
			      } //else {
			        //System.out.println("Invalid data!");
			        //System.exit(0);
			      //}
			    
			    
			    // insuarance  Adem abi
			   System.out.println("Have you had continuous insurance for the past 12 months?");
			   continuousInsurance = scan.next();
			   if(continuousInsurance.equalsIgnoreCase("no")){
			    premium *=2;}
			    else if (continuousInsurance.equalsIgnoreCase("yes")){
					  premium = premium;}
			    
			    
			    // Education Goksel 
			    
			        System.out.println("What is the highest level of education you have completed?");
			        //System.out.println();
			        //scan.nextLine();
			        education = scan.next();
			        
			        if (education.equalsIgnoreCase("phd") || education.equalsIgnoreCase("Bachelors")
			                || education.equalsIgnoreCase("Masters")) {
			            premium *= 0.95;
			        } else if (education.equalsIgnoreCase("Doctors")) {
			            premium*=0.90;
			        }else if (education.equalsIgnoreCase("Less")) {
			            premium*=1.05;
			        }
			        //System.out.println(education);
			        System.out.println(name + ", here's your quote!");
			    
			    //  Rozi  Staring from "Start Your Policy Today For: $premium" ""

			    System.out.println("Start Your Policy Today For: $" + premium);
			    
			        int countName = name.length();
			        if (education.equalsIgnoreCase("less"))
			        education="lessthanhighschool";
			        referenceNumber = name.substring(0,2) +""+ age 
			        +""+ name.substring(countName-2,countName) +""+ zipCode +""+ education;
			    System.out.println("Reference number: " + referenceNumber.toUpperCase());
			    
	  }
	}