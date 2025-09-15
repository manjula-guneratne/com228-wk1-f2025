package com.mgun.week1.EvenOdd;

import java.util.Scanner;

public class EvenOdd {
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a value: ");
		int value = scan.nextInt();
		
		if((value%2)==0) {
			System.out.println(value+" is an Even number");
		}else {
			System.out.println(value+" is an Odd number");
		}
		
		scan.close();
	}

}
