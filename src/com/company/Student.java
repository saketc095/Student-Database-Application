package com.company;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastname;
    private int gradeYear;
    private String studentID;
    private String courses ="";
    private int tutionBalance;
    private static int costOfCourse = 3000;
    public static int id = 1000;

    // Constructor: to prompt user's name and year

    public Student(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Students first Name");
        this.firstName = sc.nextLine();

        System.out.println("Enter the Students last Name");
        this.lastname = sc.nextLine();

        System.out.println("Enter the Students Class Level from the following\n1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior");
        this.gradeYear = sc.nextInt();
        setStudentID();
    }

    // Generate an ID
    public void setStudentID(){
        // Class level + ID
        id++;
        this.studentID = gradeYear + "" + id;
    }
    // Enroll in courses
    public void enroll(){
        do{
            System.out.println("Enter the course to be enrolled");
            Scanner sc = new Scanner(System.in);
            String course = sc.nextLine();
            if(!course.equals("Q")){
                courses = courses + "\n " + course;
                tutionBalance = tutionBalance + costOfCourse;
            }else{
                break;
            }
        }while (1 !=0);
    }

    // View balance
    public void viewBalance(){
        System.out.println("Tuition Balance is: - $" + tutionBalance);
    }

    // Pay tuition
    public void payTuition(){
        System.out.println("Enter the amount to pay the tuition fees: - $");
        Scanner sc = new Scanner(System.in);
        int payment = sc.nextInt();
        tutionBalance = tutionBalance - payment;
        System.out.println("Thank you for your payment of $"+payment);
        viewBalance();
    }

    // Show status
    public String showStatus(){
        return  "Your Student Registration is Completed\nThe status of your registration is: -"+
                "Name: - "+firstName+" "+lastname+
                "\nClass level is: - "+ gradeYear+
                "\nStudent ID is: - "+ studentID+
                "\nCourses Enrolled: - "+courses+
                "\nTuition Balance is: - "+tutionBalance;

    }
}
