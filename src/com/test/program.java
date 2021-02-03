package com.test;

public class program {

	public static void main(String[] args) {
		String a = "welcome to csscorp in chennai";		
		System.out.println(a);
		String res = "";

		String[] split = a.split(" ");

		for (int i = split.length - 1; i >= 0; i--) {
			 
			String output = " ";
			//System.out.println(split[i]);
			output = split[i]+output;			
			res= res+output;			
		}
		System.out.println(res);
	}
}
