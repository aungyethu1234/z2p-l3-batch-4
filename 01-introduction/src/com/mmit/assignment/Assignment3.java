package com.mmit.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment3 {
	public static void main(String[] args) {

		String[][] brand_lists = { { "     ", "Lenovo", "Hp", "Samsung", "Acer", "Dell", "Asus" },
				{ "Core-i3", "Core-i5", "Core-i7", "Core-i9" } };

		double[][] prices_lists = { 
				
				{ 230.21, 400.21, 294.2, 693.33, 340.44, 691.99 },
				{ 529.483, 920.483, 676.66, 1594.659, 783.012, 1591.577 },
				{ 552.504, 960.504, 706.08, 1663.992, 817.056, 1660.776 },
				{ 690.63, 1200.63, 882.6, 2079.99, 1021.32, 2075.97 } 
				
				};

		int brand_rows = brand_lists.length;
		for (int row = 0; row < brand_rows; row++) {
			if (row == 1) {
				break;
			}
			for (int col = 0; col < brand_lists[row].length; col++) {

				System.out.print(brand_lists[row][col] + "    | ");

			}

		}
		System.out.println("\n------------------------------------------------------------------------");
		for (int h_row = 0; h_row < brand_lists[1].length; h_row++) {

			System.out.print(brand_lists[1][h_row] + " | ");
			int row_length = prices_lists[h_row].length;
			for (int price_col = 0; price_col < row_length; price_col++) {

				if (h_row == 0) {
					System.out.print(prices_lists[h_row][price_col] + "$" + "   |");

				} else if (h_row == 1 | h_row == 2) {
					System.out.print(prices_lists[h_row][price_col] + "$" + "  |");
				} else {
					System.out.print(prices_lists[h_row][price_col] + "$" + "   |");
				}

			}
			System.out.println();
			System.out.println("-----------------------------------------------------------------------");
		}

		Assignment3 obj = new Assignment3();
		Scanner input1 = new Scanner(System.in);
		obj.searchBrand(input1, brand_lists);

	}

	public void errorAlert(String search_brand) {
		System.err.println(search_brand + " not found try another brand");

	}

	public void search(String[][] arr, String search) {
		Scanner input2 = new Scanner(System.in);
		String search_cpu = "";
		int arr_length = arr.length;
		boolean result = false;
//		boolean cpu_result = ;
//		boolean cpu_result = false;

		outer_loop: for (int row = 0; row < arr_length; row++) {
			int row_length = arr[row].length;
			
			for (int col = 0; col < row_length; col++) {
				result = search.equalsIgnoreCase(arr[row][col]);
				if (result) {
					showResult(arr[row][col]);
					result = true;
					System.out.print("Search CPU model name: ");
					search_cpu = input2.nextLine();
					search_cpu.toLowerCase();
					boolean cpu_result = search_cpu.equalsIgnoreCase(arr[row][col]);
					if(cpu_result) {
						System.out.println("ok");
						showResult(arr [row] [col]);
//						cpu_result = true;
						break outer_loop;
					}
					
					
				} 
				
			}
			
		}
		if (result == false) {
			errorAlert(search);
			searchBrand(input2, arr);
		} 
//			else if (cpu_result == false) {
//			errorAlert(search_cpu);
//			searchBrand(input2, arr);
//		}
	}

	public void showResult(String arr) {
		System.out.println("Found " + arr);
	}

	public void searchBrand(Scanner input1, String[][] brand_lists) {
		System.out.print("Search computer brand name: ");
		String search_brand = input1.nextLine();
		search_brand.toLowerCase();
		search(brand_lists, search_brand);
	}
	
//	public void searchCpu(Scanner input2, String[][] arr) {
//		System.out.print("Search CPU model name: ");
//		String search_cpu = input2.nextLine();
//		search_cpu.toLowerCase();
//		search(arr,search_cpu);
//	}

}
