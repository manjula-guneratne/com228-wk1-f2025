package com.mgun.week1.conversion;

import java.util.Scanner;

/**
 * a. Convert temp value F to C
 * 
 * b. Convert miles to kms
 * 
 * c. Convert litres to gallons
 */

public class Conversion {
	
	public static void main(String args[]) {
		
		//for a
		Scanner scan = new Scanner(System.in);
		
		double result;		
	
		System.out.println("Enter the Fahrenheit value: ");
		double input = scan.nextDouble();
		
		result = (input-32)/1.8;			
		
		System.out.printf("The Celcius value is %.2f celcius \n\n",result);
		
		//for b
		System.out.println("Enter the Miles value: ");
		input = scan.nextDouble();
		
		result = input*1.609344;
		
		System.out.printf("The KM value is %.2f \n\n",result);
		
		//for c
		System.out.println("Enter the Litres value: ");
		input = scan.nextDouble();
		
		result = input*0.2641720524;
		
		System.out.printf("The result in Gallons is %.2f",result);
		
		scan.close();	
	}

}
