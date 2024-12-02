package com.studentapp;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	private static List<Student> studentList;

	public static void main(String[] args) {

		System.out.println("************* StudentManagement System ********************");
		System.out.println("************* Welcome ********************");
		
		studentList = new ArrayList<Student>();
		
		Student s1 = new Student("Hiren Patel",35, "S-123");
		s1.enrollCourse("JAVA");
		s1.enrollCourse("PYTHON");
		
		Student s2 = new Student("Uday",24, "S-125");
		s2.enrollCourse("JAVA");

		Student s3 = new Student("Ritu",27, "S-127");
		s3.enrollCourse("JAVA");
		s3.enrollCourse("JAVASCRIPT");
		
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		
		Student result = findStudentById("s-123");
		System.out.println("Result" + result);

	}
	
	public static Student findStudentById(String studentID) {
		Student result= null;
		
		try {
			result = studentList.stream().filter(x -> x.getStudentID().equalsIgnoreCase(studentID))
			.findFirst()
			.orElseThrow(()-> new RuntimeException("No Data Found"));
		}
		catch(RuntimeException e){
			System.err.println("Student with ID "+studentID+" not found!!");
		}

		
		return result;
	}

}
