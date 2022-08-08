package com.globallogic.helloworld;

public class CheckWord {
	public static void main(String[] args) {
		String str="This is orange juice";
		if(str.contains("orange"))
		{
			System.out.println("Orange is present in the string");
		}
		else
		{
			System.out.println("Orange is not present in the string");
		}
	}

}
