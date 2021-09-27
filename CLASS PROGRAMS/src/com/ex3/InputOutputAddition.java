package com.ex3;

import java.util.Scanner;

public class InputOutputAddition {
	
	int FirstNumber;
	int SecondNumber;
	
	
	public void add() {
		 
		int sum = FirstNumber + SecondNumber;
		
		System.out.println("addition = " + sum);
	}
	
	    public static void main(String[] args) {
	    	
	    	InputOutputAddition xyz = new InputOutputAddition();
	    
	    Scanner scan = new Scanner(System.in);
	    
	    System.out.println("first number");
		xyz.FirstNumber = scan.nextInt();
	    System.out.println("second number");
	    xyz.SecondNumber = scan.nextInt();
	    
	    	   xyz.add();
	    	   scan.close();
		}

}
