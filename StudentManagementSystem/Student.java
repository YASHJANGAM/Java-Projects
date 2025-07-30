package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = null;
	private int tutionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	
	//Constructor : prompt user to enter student name and year 	
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Student first name: ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter Student last name : ");
		this.lastName = in.nextLine();
		
		System.out.print("1 -Freshmen\n2 - sophmore\n3 - Junior\n4 - Senior\nEnter student class level:");
		this.gradeYear = in.nextInt();
		
		setStudentID();
	}
	
	// generate an Id
	private void setStudentID() {
		// Grade level 
		id++;
		this.studentID = gradeYear + "" + id;
	}
	
	//enroll in courses
	public void enroll() {
		// Get inside a loop , user hits 0
		do {
		System.out.println("Enter course to enroll(0 to quit): ");
		Scanner in = new Scanner(System.in);
		String course = in.nextLine();
		if(!course.equals("Q")) {
			courses = courses + "\n  "+ course;
			tutionBalance = tutionBalance + costOfCourse;	
		} 
		else {
			break;
		  }
		}while (1!=0);
	}
	
	//view balance 
	public void viewBalance() {
		System.out.println("Your balance is : $"+ tutionBalance);
	}
	
	//pay tution
	public void payTution() {
		viewBalance();
		System.out.print("Enter your payment: $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tutionBalance = tutionBalance - payment;
		System.out.println("Thank you for your payment of $"+payment);
		viewBalance();
	}
	//show status
	public String toString() {
		return "Name: "+ firstName + " " + lastName +
				"\nGrade Level: "+ gradeYear +
				"\nStudentID: " + studentID +
				"\nCourse Enrolled: "+ courses +
				"\nBalance: $" + tutionBalance;
	}
	
}
