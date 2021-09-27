package com.ex3;

public class NewMethodAddition { 
	
	int FirstNumber;
	int SecondNumber;
	
	
	public void add() {
		 
		int sum = FirstNumber + SecondNumber;
		
		System.out.println("addition = " + sum);
	}
	
	    public static void main(String[] args) {
	    	NewMethodAddition xyz = new NewMethodAddition();
	    	
	    	xyz.FirstNumber = 74 ;
	    	xyz.SecondNumber = 56;
	    	   xyz.add();
		}

}
