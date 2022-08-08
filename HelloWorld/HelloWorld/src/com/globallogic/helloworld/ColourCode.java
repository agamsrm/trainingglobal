package com.globallogic.helloworld;
import java.util.*;
public class ColourCode {
	
	public static void main(String[] args)
	{
		
		System.out.println("Enter the colour code");
		Scanner sc = new Scanner(System.in);
		int colourcode= sc.nextInt();
		switch(colourcode)
		{
		case 123:
			System.out.println("Red colour");
			break;
		case 124:
			System.out.println("Blue colour");
			break;
		case 125:
			System.out.println("Orange colour");
			break;
		case 126:
			System.out.println("White colour");
			break;
		default:
			System.out.println("Colour code doesn't match any colour");
			
		
		}
		sc.close();
	}

}
