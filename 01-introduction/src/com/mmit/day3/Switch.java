package com.mmit.day3;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter food name: ");
		var name = sc.nextLine().toLowerCase();
		String category = null;
//		switchStatement(name);

		// switch expression
//		category = switch(name) {
//			case "burger", "pizza", "sandwich"  -> "Fast Food";
//			case "yogurt", "milk tea" -> "Dessert";
//			case "mohinga" -> "Burmese Food";
//			case "sushi" -> "Japanese Food";
//			default -> "unknown";
//		};
		
		category = switch (name) {
		case "burger", "pizza", "sandwich" -> {
			name = null;
			if(name.equals("pizza")) // "pizza".equals(name)
				System.out.println(name + " is an Italian food.");
			yield "Fast Food";
		}
		case "yogurt", "milk tea" -> {
			yield "Dessert";
		}
		case "mohinga" -> "Burmese Food";
		case "sushi" -> "Japanese Food";
		default -> "unknown";

		};

		sc.close();
		System.out.println(name + " is " + category);
	}

	private static void switchStatement(String name) {
		String category;

		switch (name) {
		case "burger", "pizza", "sandwich":
			category = "Fast food";
			break;

		case "yogurt", "milk tea":
			category = "Dessert";
			break;

		case "mohinga":
			category = "Burmese food";
			break;

		case "sushi":
			category = "Japanese food";
			break;

		default:
			category = "unknown";
		}

		System.out.println(name + " is " + category);

	}

}
