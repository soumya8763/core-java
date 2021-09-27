package com.userinputoutputexamples;

import java.util.Scanner;

public class UserInputIntAddition {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter value of first no");
		int a = scan.nextInt();
		System.out.println("enter the value of second no");
		int b = scan.nextInt();
		
		int c = a + b;
		
		System.out.println("sum =" +c);
		
		scan.close();
		

	}

}
