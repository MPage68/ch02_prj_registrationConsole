package ch02_prj_01;

import java.util.Scanner;

public class studentRegistrationApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Welcome, Follow propts to complete registration");
	
		String firstName = "";
		String lastName = "";
		int yearOfBirth = 0;
		
		
		System.out.println("Enter First Name:  ");
		firstName = sc.next();
		System.out.println("Enter Last  Name:  ");
		lastName = sc.next();
		System.out.println("Enter Date of Birth:  ");
		yearOfBirth = sc.nextInt();
		
		System.out.println("Registration Complete:   " + firstName + " " + lastName);
		
		System.out.println("Your temperary password is:  " + firstName + "*" + yearOfBirth);
		
		System.out.println("Good Bye");
		
		sc.close();
		
	}

}
		
		
		
		
