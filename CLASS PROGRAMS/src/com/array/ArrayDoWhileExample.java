package com.array;

public class ArrayDoWhileExample {

	public static void main(String[] args) {
		 int[] arr = {10,20,30,40,50,60};
		 
		 int i = 0;
		 do {
			 int x = arr[i];
			 System.out.println(x);
			 i++;
		 }
		 while(i<arr.length);

	}

}
