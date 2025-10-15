package com.Welcome;

import java.util.Scanner;

import com.StudentDTO.*;
import com.StudentDAO.*;

public class SignUp {
	
	public static void signUp() {
		Scanner sc = new Scanner(System.in);
		Student s = new Student();
		StudentDAO si = new StudentDaoImp();
		boolean res = false;
		System.out.println("Enter your name : ");
		String name = sc.next();
		s.setName(name);
		// we can write this step in 1 line like below 
		// s.setName(sc.next());
		System.out.println("Enter phone number : ");
		s.setPhone(sc.nextLong());
		System.out.println("Enter email : ");
		s.setEmail(sc.next());
		System.out.println("Enter branch : ");
		s.setBranch(sc.next());
		System.out.println("Enter Location : ");
		s.setLocation(sc.next());
		System.out.println("Enter password : ");
		String password = sc.next();
		System.out.println("Confirm Password : ");
		String confirm = sc.next();
		// why we are again taking 2 steps means
		// we need to verify the password before sing up
		
		if(password.equals(confirm)) {
			s.setPassword(password);
			res = si.insertStudent(s);
			if(res) {
				System.out.println("Data saved Successfully..");
			}
			else {
				System.out.println("Data failed to save..!!!");
			}
		}
		else {
			System.out.println("Password mismatch !!!");
		}
	}
	
}
