package com.mmit.assignment;

import java.util.Scanner;

public class Assignment2 {
	
	public static void main (String [] args) {
		Assignment2 obj = new Assignment2();
		Scanner input = new Scanner(System.in);
		obj.getInput(input);
	}
	
	public void getInput(Scanner input) {
		
		System.out.print("When do you go bed?: ");
		int bedTime = input.nextInt();
		System.out.print("When do you get up?: ");
		int getUpTime = input.nextInt();
		
		if((bedTime > 12 | getUpTime > 12) | ( bedTime <= 0 | getUpTime <= 0)) {
			System.out.println("Error! your input data (check your input and Please restart program and try again)");
			 
		} else if((bedTime <= 12 && getUpTime <= 12) && (bedTime > 0 && getUpTime > 0)) {
			int sleepTime = getSleepTime(bedTime, getUpTime);
			System.out.println("Your sleep time = "+ sleepTime);;
			System.out.println();
			showAlert(sleepTime);
		} 
		
		
	}

	private int getSleepTime(int bedTime, int getUpTime) {
		int sleepTime = 0;
		sleepTime = (getUpTime + 24) - (bedTime +12)+1;
		
		return sleepTime;
		
	}
	
	public void showAlert(int sleepTime) {
		if(sleepTime >= 5 && sleepTime <= 8) {
			System.out.println("You take care your health well");
		} else if(sleepTime < 5) {
			System.out.println("You are very hardworking");
		} else if(sleepTime > 8) {
			System.out.println("You are abnormal");
		} 
		Scanner input = new Scanner(System.in);
		System.out.println(".....................................");
		System.out.print("Are you want to exit (type exit or N): ");
		String option = input.nextLine();
		if("N".equals(option)) {
			getInput(input);
		} else if("exit".equals(option)) {
			System.out.println("Program finish");
			return;
		}
	}
	
	
}
