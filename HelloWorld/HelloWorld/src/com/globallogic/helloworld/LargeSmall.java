package com.globallogic.helloworld;

public class LargeSmall {
	public static void main(String[] args) {
		String str ="This is an umbrella";
		String[] str1=str.split(" ");
		for(int i=0;i<str1.length;i++)
		{
			
			System.out.println("Length of string "+i);
			int length = str1[i].length();
			
		}
		
		
	}

}
