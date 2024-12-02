package com.studentapp;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {
	
	private String name;
	private int age;
	private String studentID;
	private List<String> courses;
	
	
	public Student(String name, int age, String studentID) {
		super();
		if(validateAge(age) && validateName(name) && validateStudentID(studentID)) {
			this.name = name;
			this.age = age;
			this.studentID = studentID;
			
			courses = new ArrayList<String>();  //Initialization of courses!!
		}
		
	}
	
	public void enrollCourse(String course) {
		if(validateCourseName(course)) {
			if(courses.contains(course)) {
				System.err.println("Student is already enrolled to the course "+course);
			}
			else {
			courses.add(course);
			System.out.println("Student is enrolled to  "+ course + " successfully!!");
			}
		}

	}
	
	public void printStudentInfo() {
		System.out.println("======== Student Information ==========");
		System.out.println("Student Name: " +name);
		System.out.println("Student Age: " +age);
		System.out.println("Student ID: " +studentID);
		System.out.println("Enrolled for: " +courses);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", studentID=" + studentID + ", courses=" + courses + "]";
	}
	
	//Validation Methods
	
	public boolean validateAge(int age) {
		if(age>=19 && age<=35) {
			return true;
		}
		else {
			System.err.println("Invalid age!!! Student Age needs to be between 19 and 35");
			return false;
		}
	}
	
	public boolean validateName(String name) {
		String nameRegex = "^[a-zA-Z\\s]+$";
		Pattern namePattern = Pattern.compile(nameRegex);
		Matcher nameMatcher=namePattern.matcher(name);
		if(nameMatcher.matches()) {
			return true;
		}
		else {
			System.err.println("Invalid Name!!! Please enter alphabets only");
			return false;
		}
	}
	
	public boolean validateStudentID(String studentID) {
		String studentIDRegex = "S-[0-9]+$";
		Pattern studentIDPattern = Pattern.compile(studentIDRegex);
		Matcher studentIDMatcher=studentIDPattern.matcher(studentID);
		if(studentIDMatcher.matches()) {
			return true;
		}
		else {
			System.err.println("Invalid StudentID!!! Please enter valid studentID");
			return false;
		}
	}
	
	public boolean validateCourseName(String course) {
		if(course.equalsIgnoreCase("JAVA") ||course.equalsIgnoreCase("PYTHON") || course.equalsIgnoreCase("JAVASCRIPT")) {
			return true;
		}
		else {
			System.err.println(course+ " is invalid Course Name!!! Please select valid course name from the list!! [JAVA, PYTHON, JAVASCRIPT]");
			return false;
		}
			
	}
	

}
