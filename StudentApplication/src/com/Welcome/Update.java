package com.Welcome;

import java.util.Scanner;

import com.StudentDTO.*;
import com.StudentDAO.*;

public class Update {
	public static void update(Student s) {
		Scanner sc = new Scanner(System.in);
		StudentDAO si = new StudentDaoImp();
		System.out.println("Hey user what do you want to Update..!");
		System.out.println("1.Name");
		System.out.println("2.Phone");
		System.out.println("3.Email");
		System.out.println("4.Location");
        System.out.println("Enter your option : ");
        int upDate = sc.nextInt();
        if(upDate == 1) {
        	System.out.println("Enter Updated Name : ");
        	String Uname = sc.next();
        	s.setName(Uname);
        	si.updateStudent(s);
        }
        else if(upDate == 2) {
        	System.out.println("Enter Updated PhoneNumber : ");
        	long Uphone = sc.nextLong();
        	s.setPhone(Uphone);
        	si.updateStudent(s);
        }
        else if(upDate == 3) {
        	System.out.println("Enter Updated Email : ");
        	String Umail = sc.next();
        	s.setEmail(Umail);
        	si.updateStudent(s);
        }
        else if(upDate == 4) {
        	System.out.println("Enter New Location : ");
        	String Uloc = sc.next();
        	s.setLocation(Uloc);
        	si.updateStudent(s);
        }	
        else {
            System.out.println("Invalid option. Please try again.");
        }
	}
}
