package com.studentapp;

public class Main {

	public static void main(String[] args) {

		System.out.println("************* StudentManagement System ********************");
		System.out.println("************* Welcome ********************");
		
		
		Student s1 = new Student("Hiren Patel",35, "S-123");
		s1.enrollCourse("JAVA");
		s1.enrollCourse("PYTHON");
		s1.printStudentInfo();
		
		Student s2 = new Student("Uday",24, "S-125");
		s2.enrollCourse("JAVA");
		s2.printStudentInfo();
		
		Student s3 = new Student("Ritu",27, "S-127");
		s3.enrollCourse("JAVA");
		s3.enrollCourse("JAVASCRIPT");
		s3.printStudentInfo();

	}

}
