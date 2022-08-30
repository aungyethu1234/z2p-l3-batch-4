package com.mmit.day3;

import java.util.Scanner;

public class Conditional {
	
		enum Role {
			Admin, Staff, Customer, Merchant
		};
		
		private static Role role;
		
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter language name: ");
		String name = sc.nextLine();
		
		if(name.equalsIgnoreCase("java") ) {
			System.out.print("Java is a compiled language");
			
		} else {
			System.out.println("other");
		}
		
		System.out.println("...........");
		System.out.print("Enter email: ");
		var email = sc.nextLine();
		System.out.println("Enter password: ");
		var pass = sc.nextLine();
		if(email.equals("admin@gmail.com") && pass.equals("123")) {
			
		} else {
			System.err.println("Login fail");
		}
		sc.close();

	}

}
