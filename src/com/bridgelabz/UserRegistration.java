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
	}



