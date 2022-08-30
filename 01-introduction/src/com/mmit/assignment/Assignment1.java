package com.mmit.assignment;

import java.util.Scanner;

public class Assignment1 {
//	int zero = 0;
//	int positive_num = 0;
	int negative_num = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		getInput(sc);

	}

	private static void getInput(Scanner input) {
		Assignment1 obj = new Assignment1();
		int numSeries = 1;
		int no_of_zero = 0;
		int no_of_positive = 0;
		int no_of_negative = 0;
		System.out.print("How many input you want: ");
		int userInput = input.nextInt();
		
		for(int i=1; i <= userInput; i++) {
			System.out.print(numSeries++ +". " +"."+"Enter any number: ");
			int number = input.nextInt();
			
			if(number == 0) {
				 no_of_zero = obj.countZero(no_of_zero);
			}
			
			if(number > 0) {
				 no_of_positive = obj.checkPositive(no_of_positive);
			}
			
			if(number < 0) {
				 no_of_negative = obj.checkNegative(no_of_negative);
			}
		}
		input.close();
		System.out.println(".........Result.........");
		obj.showNoOfZero(no_of_zero);
		obj.showNoOfPositive(no_of_positive);
		obj.showNoOfNegative(no_of_negative);
	}
	
	private int checkNegative(int negative) {
		negative++;
		return negative;
		
	}

	private void showNoOfPositive(int no_of_positive) {
		System.out.println("No of positive number: " + no_of_positive);
		
	}

	private void showNoOfZero(int no_of_zero) {
		System.out.println("No of zero: "+ no_of_zero);
		
	}
	
	private void showNoOfNegative(int no_of_negative) {
		System.out.println("No of negative: "+ no_of_negative);
		
	}

	public int countZero(int zero) {
		zero++;
		return zero;
	}
	
	public int checkPositive(int positive) {
		positive++;
		return positive;
	}
	

}
