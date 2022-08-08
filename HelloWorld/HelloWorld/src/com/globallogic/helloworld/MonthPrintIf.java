package com.globallogic.helloworld;
import java.util.*;
public class MonthPrintIf {

	public static void main(String[] args) {
		
		System.out.println("Enter the month name");
		Scanner sc = new Scanner(System.in);
		int mn=sc.nextInt();
		if(mn==1)
	    System.out.println("January");
			else if(mn==2)
			   System.out.println("February");
			else if(mn==3)
				System.out.println("March");
			else if(mn==4)
				System.out.println("April");
			else if(mn==5)
				System.out.println("May");
			else if(mn==6)
				System.out.println("June");
			else if(mn==7)
				System.out.println("July");
			else if(mn==3)
				System.out.println("August");
			else if(mn==4)
				System.out.println("September");
			else if(mn==5)
				System.out.println("October");
			else if(mn==6)
				System.out.println("November");
			else if(mn==7)
				System.out.println("December");
		else
		System.out.println("Wrong month number");
		sc.close();
	}
}
