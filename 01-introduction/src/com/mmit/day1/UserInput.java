package com.mmit.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) throws IOException {
		//create or open
//		readWithBufferReader();
		readWithScanner();
		
		

	}

	private static void readWithScanner() {
		// open
		Scanner sc = new Scanner(System.in);
		
		// operate
		System.out.print("Enter name: ");
		var name = sc.nextLine();
		System.out.println("Enter salary: ");
		double salary = sc.nextDouble();
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter city: ");
		String city = sc.nextLine();
		sc.close();
		System.out.println("..... Information");
		System.out.println("name " + name);
		System.out.println("Salary " + salary);
		System.out.println("Age " + age);
		System.out.println("City " + city);
		
	}

	private static void readWithBufferReader() throws NumberFormatException, IOException {
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		// operate
		System.out.print("Enter name");
		String name = reader.readLine();
		System.out.print("Enter salary: ");
		
		//convert from string to any number data type
		//double salary = 10000;
//Double salary = new Double(10000);
		double salary = Double.parseDouble(reader.readLine());
		
		System.out.print("Enter age: ");
		int age = Integer.parseInt(reader.readLine());
		System.out.print("Enter bounus: ");
		float bonus = Float.parseFloat(reader.readLine());
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
	}
	
	
	

}
