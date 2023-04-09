package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {
	public static void main (String args[]) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		Student student = new Student();
		
		student.name=input.nextLine();
		student.grade1=input.nextDouble();
		student.grade2=input.nextDouble();
		student.grade3=input.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f\n", student.finalGrade());
		
		if (student.finalGrade() <60) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS\n", student.missingPoints());
		}
		else {
			System.out.println("PASS");
		}
		
		
		input.close();	
	}
	}
