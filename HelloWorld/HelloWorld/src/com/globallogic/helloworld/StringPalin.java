package com.globallogic.helloworld;

import java.util.Scanner;

public class StringPalin {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//String str= sc.nextLine();
		StringBuilder sb = new StringBuilder(sc.nextLine());
		StringBuilder rev= sb.reverse();
		System.out.println(rev);
		sc.close();
	}

}
