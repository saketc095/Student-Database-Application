package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Ask how many students you want to enroll
        System.out.println("Enter the number of Students to be enrolled: - ");
        Scanner sc = new Scanner(System.in);
        int noOfStu = sc.nextInt();
        Student[] students= new Student[noOfStu];

        //Create no of new Students
        for(int i=0; i<noOfStu;i++){
            students[i] = new Student();
            students[i].enroll();
            students[i].viewBalance();
            students[i].payTuition();
            System.out.println(students[i].showStatus()+"\n");

        }
    }
}
