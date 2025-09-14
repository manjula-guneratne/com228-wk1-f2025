package com.mgun.week1.demo;

import java.util.Scanner;

/**
 * Calculate and store student grades for various subjects.
 */

public class GradeCalculation {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter student name:");
		String studentName = sc.nextLine();
		
		System.out.println("Enter number of subjects:");
		int numSubjects = sc.nextInt();
		
		double[] grades = new double[numSubjects];
		double total = 0;
		
		for(int i=0; i<numSubjects; i++) {
			System.out.println("Enter grade for subject "+(i+1)+":");
			grades[i] = sc.nextDouble();
			total += grades[i];
		}
		
		double average = total/numSubjects;
		
		String status = (average >= 60) ? "Pass":"Fail";
		
		System.out.println("Student: "+studentName);
		System.out.println("Average grade: "+average);
		System.out.println("Status: "+status);
		
		sc.close();	
	}

}
