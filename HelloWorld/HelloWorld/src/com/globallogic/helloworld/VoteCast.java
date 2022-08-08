package com.globallogic.helloworld;
import java.util.*;
public class VoteCast 
{

	public static void main(String[] args)
	{
		System.out.println("Enter you current age ");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if(age>=18)
		{
			System.out.println("Person having " +age +" age is eligible to vote");
			
		}
		else
		{
			System.out.println("Person having " +age +" age is not eligible to vote");
		}
		sc.close();
	}
}
 