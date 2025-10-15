package com.Welcome;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;
import com.StudentDAO.*;
import com.StudentDTO.*;

public class Login {
	
	public static void login() {
	
		Scanner sc = new Scanner(System.in);
		StudentDAO si = new StudentDaoImp();
		System.out.println("Enter email : ");
		String email = sc.next();
		System.out.println("Enter password : ");
		String password = sc.next();
		Student s = si.getStudent(email,password);
		
		if(s != null) {
			System.out.println("Login Successful..");
			System.out.println("Welcome "+s.getName());
			int choice = 0;
			do {
				System.out.println("choose the operation");
				System.out.println("1.Update");
				System.out.println("2.View details");
				System.out.println("3.Exit");
				
				if(s.getId()==18) {
					System.out.println("4.View All students");
					System.out.println("5.Delete Student");
				}
				choice = sc.nextInt();
				
				switch(choice) {
				case 1:
					Update.update(s);
					break;
					
				case 2:
					System.out.println(s);
					
				case 3:
					System.exit(0);
					break;
					
				case 4:
					ArrayList<Student> ls = si.getAllStudents();
					ListIterator<Student> li = ls.listIterator();
					while(li.hasNext()) {
						System.out.println(li.next());
					}
					
					break;
					
				case 5:
					Delete.delete(s);
				}
				
				
				
			}while(choice != 3);
		}
		else {
			System.out.println("Login failed !!!!");
		}
		
	}
	
}
