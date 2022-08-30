package com.mmit.practice;

import java.util.Arrays;

public class StaticBlock {
	
	
	
	public void example() {
		System.out.println("example method working");
		String Arr[][]  = {
				{"Mg Mg","Kyaw Kyaw"},
				{"Mya Mya","Hla Hla"}
		};
		
		String [] single = {"Htay Htay", "Maw Maw", "Thaw Thaw"};
		
		// More array dimention 
		
		String multi[][][] = {
				{
					{"1", "2", "3", "4"},
					{"5", "6", "7", "8"},
					{"9", "10", "11", "12"}
				},
				{
					{"13", "14", "15", "16"},
					{"17", "18", "19", "20"},
					{"21", "22", "23", "24"}
				},
				{
					{"25", "26", "27", "28"},
					{"29", "30", "31", "32"},
					{"33", "34", "35", "36"}
				}
		};
//		System.out.println(Arrays.toString(multi[0][0]));
//		System.out.println(Arrays.toString(multi[1][1]));
//		System.out.println(Arrays.asList(single).contains("Htay Htay"));
		
		// copy array first way
		
		String [] empty = new String [3];
		System.arraycopy(single, 0, empty, 0, 3);
//		System.out.println(Arrays.toString(empty));
		
		// array copy second way
		String [] emptyTwo = Arrays.copyOfRange(single, 0, 3);
		System.out.println(Arrays.toString(emptyTwo));
		
		// array initialize second way
		String [] easyArr = {};
		String [] newString = new String [] {"one", "two"};
		
		// string methods
		String hobby = "Programming , swiming, chinlone and wakling";
		char ch = hobby.charAt(9); // return char
		System.out.println(hobby.charAt(1));
		String sub = hobby.substring(7); // return string
		System.out.println(sub);
		System.out.println(hobby.contains("Pro"));
		String name1 = "";
		String name2 = "Maung Maung";
		String name3 = "Kyaw Kyaw";
		String name4 = "maung maung";
//		System.out.println(name1.equals(name2));
		System.out.println(name1.isEmpty());
		name1 = name1.replace("", name3);
		System.out.println(name1);
		System.out.println(name4.equalsIgnoreCase(name2));
		
		
		
	}
}
