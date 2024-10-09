/*Develop a Java program to create a class Student with members usn, name, an array credits and an array marks. Include methods to accept and display details and a method to calculate SGPA of a student. */

import java.util.Scanner;

class Subject{
	String name;
	int marks, credits;
	Subject(int marks, int credits, String name){
		this.name = name;
		this.marks = marks;
		this.credits = credits;
	}
	int grade(){
		return marks / 10 + 1;
	}
}

class Student{
	String name, usn;
	Subject[] subjects;
	double sgpa;
	Scanner sc = new Scanner(System.in);
	Student(String name, String usn){
		this.name = name;
		this.usn = usn;
	}
	void getMarks(){
		System.out.println("Enter Marks:");
		for(int i = 0; i < 7; i++){
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Marks: ");
			int marks = sc.nextInt();
			System.out.print("Credits: ");
			int credits = sc.nextInt();
			s[i] = new Subject(name, marks, credits);
		}
	}
}






