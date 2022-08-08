package com.globallogic.helloworld;

import java.util.Scanner;

public class Occurence {
	
	public static void main(String[] args) {
		String str="Hello World";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character of Hello World");
		char c = sc.next().charAt(0);
		int a = str.indexOf(c);
		System.out.println("First index of o" +a);
		int b= str.lastIndexOf(c);
		System.out.println("Last index of o" +b);
		sc.close();
		
	}

}
