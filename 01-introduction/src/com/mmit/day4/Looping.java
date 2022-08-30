package com.mmit.day4;

public class Looping {

	public static void main(String[] args) {
		String[] languages = {"Java", "Javascript", "Php", "CSS"};
		
		for(String lang: languages) {
			if("Php".equals(lang))
				break;
			System.out.println(lang);
		}

	}

}
