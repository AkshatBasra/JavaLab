/*Develop a Java program to create a class Student with members usn, name, an array credits and an array marks. Include methods to accept and display details and a method to calculate SGPA of a student. */

import java.util.Scanner;

class Subject{
    String name;
    int marks, credits;
    Subject(String name, int marks, int credits){
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
    Subject[] subjects = new Subject[8];
    double sgpa = 0;
    Scanner sc = new Scanner(System.in);
    Student(String name, String usn){
        this.name = name;
        this.usn = usn;
    }
    void getMarks(){
        System.out.println("Enter Subject Details:");
        for(int i = 0; i < 3; i++){
            System.out.println("Subject "+ (i+1));
            System.out.print("Name: ");
            String name1 = sc.next();
            System.out.print("Marks: ");
            int marks = sc.nextInt();
            System.out.print("Credits: ");
            int credits = sc.nextInt();
            subjects[i] = new Subject(name1, marks, credits);
        }
    }
    double getSgpa(){
        int sum = 0;
        for(int i = 0; i < 3; i++) {
            sgpa += (double) subjects[i].grade() * subjects[i].credits;
            sum += subjects[i].credits;
        }
        sgpa = sgpa / sum;
        return sgpa;
    }
}

class SGPARun{
    public static void main(String[] args){
        System.out.println("Akshat Basra 1BM23CS020");
	Student s1 = new Student("as","12");
	System.out.println("Student " + s1.name + " :");
        s1.getMarks();
	Student s2 = new Student("df","13");
	System.out.println("Student " + s2.name + " :");
        s2.getMarks();
	Student s3 = new Student("gh","14");
	System.out.println("Student " + s3.name + " :");
        s3.getMarks();
        System.out.println(s1.name + " SGPA: "+ s1.getSgpa());
        System.out.println(s2.name + " SGPA: "+ s2.getSgpa());
        System.out.println(s3.name + " SGPA: "+ s3.getSgpa());
    }
}






