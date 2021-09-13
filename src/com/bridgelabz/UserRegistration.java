package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

 public class UserRegistration {
	
	Scanner reader = new Scanner (System.in);
	
	//firstname method
	    public void Firstname() {
	    System.out.println("Enter A Firstname");
	    String Firstname = reader.next();
	    
	     Pattern pattern=Pattern.compile("[A-Z][a-z]"); //delcaration of pattern
	    Matcher matcher =pattern.matcher(Firstname);     //delcaration of matcher
	 //   if (matcher.equals(Firstname))
	    if(matcher.find()) {
	    	System.out.println("Name Is Valid");
	    }
	    	else {
	    		System.out.println("Name Is Not Valid");
	    	}	
	    	}
	    //lastname method
	    public void Lastname() {
		    System.out.println("Enter A Lastname");
		    String Lastname = reader.next();
		    
		     Pattern pattern=Pattern.compile("[A-Z][a-z]"); //delcaration of pattern
		    Matcher matcher =pattern.matcher(Lastname);     //delcaration of matcher
		 //   if (matcher.equals(Lastname))
		    if(matcher.find()) {
		    	System.out.println("Name Is Valid");
		    }
		    	else {
		    		System.out.println("Name Is Not Valid");
		    		
		    	}
	    }

		    //Email method
		    public void Email() {
			    System.out.println("Enter A Email");
			    String Email = reader.next();
			    
                Pattern pattern=Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"); //delcaration of pattern
			    Matcher matcher =pattern.matcher(Email);     //delcaration of matcher
			 //   if (matcher.equals(Email))
			    if(matcher.find()) {
			    	System.out.println("Email Is Valid");
			    }
			    	else {
			    		System.out.println("Email Is Not Valid");
			    		
			    	}
		    }
		    
		    //mobile Format method
		    public void Mobilenumber() {
			    System.out.println("Enter A MobileNumber");
			    String Mobilenumber = reader.next();
			    
			     Pattern pattern=Pattern.compile("[91][0-9]{9}"); //delcaration of pattern
			    Matcher matcher =pattern.matcher(Mobilenumber);     //delcaration of matcher
			 //   if (matcher.equals(Mobilenumber))
			    if(matcher.find()) {
			    	System.out.println("Mobilenumber Is Valid");
			    }
			    	else {
			    		System.out.println("Mobilenumber Is Not Valid");
			    		
			    	}
		    }

			    //Password method
			    public void Password() {
				    System.out.println("Enter A Password");
				    String Password = reader.next();
				    
				    //Ruel– minimum 8 Characters &&Atleast one upper case&&one special character
  
				    Pattern pattern=Pattern.compile("^(?=.[A-Za-z0-9])(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,}$"); //delcaration of pattern
				    Matcher matcher =pattern.matcher(Password);     //delcaration of matcher
				 //   if (matcher.equals(Password))
				    if(matcher.find()) {
				    	    System.out.println("Password Is Valid");
				    }
				    	else {
				    		System.out.println("Password Is Not Valid");
				    		
				    	}
	    }
	}