package com.StudentDAO;

import java.util.ArrayList;

import com.StudentDTO.Student;

public interface StudentDAO {

	public boolean insertStudent(Student s); // DML operation
	public boolean updateStudent(Student s); // DML operation
	public boolean deleteStudent(Student s); // DML operation
	public Student getStudent(String email, String password); // DQL operation 
	public ArrayList<Student> getAllStudents(); // DQL operation
	
}
