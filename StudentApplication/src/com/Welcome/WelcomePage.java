package com.Welcome;

import java.util.Scanner;

public class WelcomePage {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Hey user, Welcome..!");
		System.out.println("These are operations to perform : ");
		int choice = 0;
		
		do {
			System.out.println("1. Sign Up");
			System.out.println("2. Login");
			System.out.println("3. Exit");
			System.out.print("Choose your option : ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				SignUp.signUp();
				break;
			
			case 2:
				Login.login();
				break;
				
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("Enter proper input : ");
			}
		
		}while(choice != 3);
		
		
	}

}
