package com.trainingbasket;

import java.util.Scanner;

public class Runner {
	int count = 0, count1 = 0, i, j, tempattendance;
	float tempmarks;
	String tempname, temprollno;
	Student student[] = new Student[20];
	static Scanner s = new Scanner(System.in);
	static Runner runner = new Runner();

	private static void mainMenu() {
		System.out.println(
				"\n1->Add Student\n2->Show All Student\n3->Top 3 Student by marks\n4->Top 3 Student by Attendance\n5->Exit\nEnter your choice\n");
	}

	/**
	 * 
	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int option = 0;
		mainMenu();
		while (option != 5) {
			option = s.nextInt();
			switch (option) {
			case 1:
				runner.AddStudent();
				break;
			case 2:
				runner.ShowAllStrudent();
				break;
			case 3:
				runner.TopThreeByMarks();
				break;
			case 4:
				runner.TopThreeByAttendance();
				break;
			case 5:
				runner.Exit();
				break;
			default:
				runner.Default();
			}
		}

	}

	private void AddStudent() {
		Student e1 = new Student();
		if (count >= 0 && count < 20) {

			System.out.println("Enter Student Roll No: ");
			e1.setRollno(s.next());
			System.out.println("Enter Student Name: ");
			e1.setName(s.next());
			System.out.println("Enter Student Marks: ");
			e1.setMarks(s.nextFloat());
			;
			System.out.println("Enter Student Attendance: ");
			e1.setAttendance(s.nextInt());

		} else
			System.out.println("Storage full");

		student[count++] = e1;
		mainMenu();

	}

	private void ShowAllStrudent() {
		Student e2 = null;
		System.out.println("Student details are\n");
		System.out.println("RollNo\tNAME\tMARKS\tATTENDANCE.");
		for (i = 0; i < count; i++) {
			e2 = student[i];
			System.out.print(e2.getRollno());
			System.out.print("\t");
			System.out.print(e2.getName());
			System.out.print("\t");
			System.out.print(e2.getMarks());
			System.out.print("\t");
			System.out.println(e2.getAttendance());
		}
		mainMenu();

	}

	private void TopThreeByMarks() {

		Student e1 = null, e2 = null;

		for (i = 0; i < count; i++) {
			for (j = i + 1; j < count; j++) {
				e1 = student[i];
				e2 = student[j];
				if (e2.getMarks() > e1.getMarks()) {
					tempmarks = e1.getMarks();
					e1.setMarks(e2.getMarks());
					e2.setMarks(tempmarks);

					tempname = e1.getName();
					e1.setName(e2.getName());
					e2.setName(tempname);

					temprollno = e1.getRollno();
					e1.setRollno(e2.getRollno());
					e2.setRollno(temprollno);

					tempattendance = e1.getAttendance();
					e1.setAttendance(e2.getAttendance());
					e2.setAttendance(tempattendance);
				}
			}
		}
		System.out.println("******Top Three Student By Marks*****");
		System.out.println("RollNo\tNAME\tMARKS\tATTENDANCE.");
		for (i = 0; i < 3; i++) {
			e1 = student[i];
			System.out.print(e1.getRollno());
			System.out.print("\t");
			System.out.print(e1.getName());
			System.out.print("\t");
			System.out.print(e1.getMarks());
			System.out.print("\t");
			System.out.println(e1.getAttendance());
		}
		mainMenu();
	}

	private void TopThreeByAttendance() {

		Student e1 = null, e2 = null;

		for (i = 0; i < count; i++) {
			for (j = i + 1; j < count; j++) {
				e1 = student[i];
				e2 = student[j];
				if (e2.getAttendance() > e1.getAttendance()) {
					tempmarks = e1.getMarks();
					e1.setMarks(e2.getMarks());
					e2.setMarks(tempmarks);

					tempname = e1.getName();
					e1.setName(e2.getName());
					e2.setName(tempname);

					temprollno = e1.getRollno();
					e1.setRollno(e2.getRollno());
					e2.setRollno(temprollno);

					tempattendance = e1.getAttendance();
					e1.setAttendance(e2.getAttendance());
					e2.setAttendance(tempattendance);
				}
			}
		}
		// student[count1++] = e1;
		System.out.println("******Top Three Student By Attendance*****");
		System.out.println("RollNo\tNAME\tMARKS\tATTENDANCE.");
		for (i = 0; i < 3; i++) {
			e1 = student[i];
			System.out.print(e1.getRollno());
			System.out.print("\t");
			System.out.print(e1.getName());
			System.out.print("\t");
			System.out.print(e1.getMarks());
			System.out.print("\t");
			System.out.println(e1.getAttendance());
		}
		mainMenu();

	}

	private void Exit() {
		System.out.println("Thank You!!!");
		return;

	}

	private void Default() {
		System.out.println("Invalid choice:");
		mainMenu();

	}

}
