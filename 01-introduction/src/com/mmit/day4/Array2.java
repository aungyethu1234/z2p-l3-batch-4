package com.mmit.day4;

public class Array2 {

	public static void main(String[] args) {
//		print_array();
		int [][] marks = {
				{100, 30, 90, 40, 50,200},
				{90, 90, 80, 70, 100, 400},
				{70, 100, 90, 100, 100}
		};
		String[] names = {"Jeon", "Yuri", "Cherry"};
		int row = marks.length;
//		int col = marks[0].length;
		
		for(int r =0; r < row ; r++) {
			int total = 0;
			int col_length = marks[r].length;
			
			for(int c = 0; c < col_length ; c++) {
				total += marks[r][c];
				
			}
			System.out.println("Total mark obtained by " + names[r] + ": "+ total + ": "+ total+ " marks");
			System.out.println("Average mark: " + total/5.0 + ": "+ total + ": "+ total+ " marks");
			System.out.println("...........");
		}
	}

	private static void print_array() {
		int [][] marks = {
				{100, 30, 90, 40, 50, 120},
				{90, 90, 80, 70, 100},
				{70, 100, 90, 100, 100}
		};
		
		System.out.println(".... Print with loop...");
				int mark_length = marks.length;
			for(var r = 0; r < mark_length ; r++) {
				int arr_length = marks[r].length;
				for(var c=0; c < arr_length ; c++) {
					System.out.println(marks[r][c] + "\t");
				}
				System.out.println();
				
		System.out.println(".......... Print with for each loop");
		for(int[] arr : marks) {
			for(var m: arr) {
				System.out.println(m + "\t");
			}
			System.out.println();
			
		}
			}
		
	}

}
