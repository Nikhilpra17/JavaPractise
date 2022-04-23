package com.company;

import java.util.*;

public class Test1 {
	
	 public static boolean isValid(String s) {
		 
		 boolean valid = false;
		 
	     for (int i = 0; i<s.length(); i++) {
	    	 for (int k = 0; k<s.length(); k++) {
	    	 if (s.charAt(i)== '(' &&  s.charAt(k)== ')') {	 
	    		 valid = true;
	    	 }
	    	 if (s.charAt(i)== '{' &&  s.charAt(k)== '}') {	 
	    		 valid = true;
	    	 }
	    	 if (s.charAt(i)== '[' &&  s.charAt(k)== ']') {	 
	    		 valid = true;
	    	 }
	     }
	     }
	     return valid;
	    }
	 
		public static void main(String[] args) {
		   
			String pop = "[ ]";
			
			Boolean ss = isValid(pop);
			System.out.println(ss);
			
		}
	}
