package com.globallogic.helloworld;

import java.util.Scanner;


public class PrintSentence 
{
	public static void main(String[] args) {
		
System.out.println("Enter any String");
Scanner sc = new Scanner(System.in);
String str = sc.nextLine();
System.out.println(str);
sc.close();
	}
	

}
