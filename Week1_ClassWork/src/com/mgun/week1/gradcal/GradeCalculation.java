package com.mgun.week1.gradcal;

/**
 * Set the grade for each course mark
 */

import java.util.Scanner;

public class GradeCalculation {
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the course grade here: ");
		int courseGrade = scan.nextInt();
		
		System.out.print("The Grade you get is ");
		if (courseGrade >= 80) {
			System.out.print("A");
		} else if ((courseGrade <80) && (courseGrade >=60)) {
			System.out.print("B");
		} else if ((courseGrade <60) && (courseGrade >=40)) {
			System.out.print("C");
		} else {
			System.out.print("D");
		}
		
		scan.close();
	}

}
