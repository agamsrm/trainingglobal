package com.globallogic.helloworld;
import java.util.*;

public class ColourCodeIf {
	public static void main(String[] args) {
		System.out.println("Enter the colour code");
		Scanner sc = new Scanner(System.in);
		int cc=sc.nextInt();
		if(cc==1)
	    System.out.println("Red Colour");
			else if(cc==2)
			   System.out.println("Blue colour");
			else if(cc==3)
				System.out.println("Orange colour");
			else if(cc==4)
				System.out.println("White colour");
		else
		System.out.println("Wrong colour code");
        sc.close();		
	}

}
