package com.ex5;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		  
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter a number between 1 to 6");
		int x = scan.nextInt();
		
		switch(x) {
		case 1: {
			System.out.println("sunday");
		}
		break ;
		
		
		case 2: {
			System.out.println("monday");
		}
		break ;
		
		case 3: {
			System.out.println("tuesday");
		}
		break ;
		
		case 4: {
			System.out.println("wednesday");
		}
		break ;
		
		case 5: {
			System.out.println("thursday");
		}
		break ;
		
		default : {
			
			System.out.println(" print soumya");
		}
		break ;
		
		}scan.close();
		}
		}
		

	

		

	
		
		
		
	




