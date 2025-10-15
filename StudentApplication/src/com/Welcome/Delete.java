package com.Welcome;

import java.util.Scanner;
import com.StudentDTO.Student;
import com.StudentDAO.StudentDAO;
import com.StudentDAO.StudentDaoImp;

public class Delete {

    public static void delete(Student currentUser) {
        if (currentUser.getId() != 18) {
            System.out.println("Access denied. Only admin can delete students.");
            return;
        }

        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDaoImp();

        System.out.println("Enter Student ID to delete: ");
        int id = sc.nextInt();

        Student s = new Student();
        s.setId(id);

        boolean result = dao.deleteStudent(s);

        if (result) {
            System.out.println("Student deleted successfully...");
            System.out.println();
        } else {
            System.out.println("Deletion failed. Check if the ID exists.");
        }

    }
}