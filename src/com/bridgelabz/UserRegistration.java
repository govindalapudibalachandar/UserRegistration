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
	}



