package com.globallogic.helloworld;
import java.util.*;

public class Factorial {
	public static void main(String[] args) {
		System.out.println("Enter the number whose factorial want to know");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++)
		{
		
			fact = fact*i;
			
		}
		System.out.println("The factorial is "+fact);
		sc.close();
	}

}
