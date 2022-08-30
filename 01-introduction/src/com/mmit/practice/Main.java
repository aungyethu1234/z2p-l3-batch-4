package com.mmit.practice;

import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
//		short value = 11;
//		int val = (int)value;
//		Boy o =new Boy();
//		Student st = new Boy();
		
//		Girl gl = new Girl();
//		Student st2 = new Girl();
//		School sch = (School) new Girl();
		
//		Student [] stArr = {new Boy(), new Girl()};
//		
//		for(int i = 0; i <= 100; i++) {
//			System.out.println(stArr[i%2].name);
//		}
		Girl gl = new Girl();
		Boy by = new Boy();
		Student [] stu = {by, gl};
//		System.out.println(((Boy)stu[0]).name);
//		System.out.println(((Girl)stu[1]).name);
		
//		for(int i = 0; i <= 100; i++) {
//			switch(i%2) {
//			case 0:
//				System.out.println(((Boy)stu[0]).name);
//				break;
//			case 1:
//				System.out.println(((Girl)stu[1]).name);
//			}
//		}
		
		StaticBlock stk = new StaticBlock();
//		stk.example();
		Main mainObj = new Main();
//		mainObj.practiceDouble();
		mainObj.changeBinary();
		
		
	}
	public void practiceDouble() {
		String text = "12";
		int num = Integer.parseInt(text);
		String text2 = "13";
		int num2 = Integer.parseInt(text2);
		int result = num + num2;
		System.out.println(result);
		
		Boolean b1 = false;
		Boolean b2 = false;
		int result2 = Boolean.compare(b1, b2);
		if(result2 > 0) {
			System.out.println("b1 is true");
		} else if(result2 == 0) {
			System.out.println("b1 and b2 are equal");
		} else if(result2 < 0) {
			System.out.println("b1 true but b2 fasle");
		}
		
		int code = b2.hashCode();
		if(code == 1231) {
			System.out.println("true");
		} else if(code == 1237) {
			System.out.println("false");
		}
		Integer number = 123;
		
		// swap variable 
		int num1 = 30, num6 = 50, temp;
		System.out.println("Before swap num1, num2 = "+num1+", "+num6);
		temp = num1;
		num1 = num6;
		num6 = temp;
		
		
		System.out.println("After swap num1, num2 = "+num1+", "+num6);
		
		
	}
	
	public void changeBinary() {
		int bin[] = new int[100];
		int index = 0, decimal_num;
		Scanner scan = new Scanner(System.in);
		System.out.print("Input decimal number: ");
		decimal_num = scan.nextInt();
		int origin_decimal = decimal_num;
		while(decimal_num > 0) { //10
			bin[index]=decimal_num%2; // bin[0] = 0; bin[1] = 1 bin[2] = 0
			decimal_num = decimal_num/2; // decimal_num = 5;
			index++;
		}
		
		scan.close();
		System.out.printf("Binary number of %d = ",origin_decimal);
		
		for(int j = index - 1; j >= 0; j--) {
			System.out.print(bin[j]);
		}
		
		
		
		
		
		
	}
}