package com.globallogic.helloworld;
import java.util.*;
public class Swap {
	public static void main(String[] args)
	{
		System.out.println("Enter the first number ");
		Scanner sc=new Scanner(System.in);
		int n1= sc.nextInt();
		System.out.println("Enter the second number ");
		//Scanner sc1=new Scanner(System.in);
		int n2= sc.nextInt();
		int n3=0;
		n3=n1;
		n1=n2;
		n2=n3;
		System.out.println("The first number is "+n1);
		System.out.println("The second number is "+n2);
		sc.close();
	}

}
