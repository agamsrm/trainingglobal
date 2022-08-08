package com.globallogic.helloworld;
import java.util.*;

public class Stringpalindrome 
{
public static void main(String[] args) {
	
	
	String rev="";
	System.out.println("Enter the string you need to reverse");
	Scanner sc= new Scanner(System.in);
	String str = sc.nextLine();
	StringBuffer sb = new StringBuffer(str);
	System.out.println(sb.reverse());
	char a[]=str.toCharArray();  // a = 'a'  'g'  'a'  'm'
	int length = str.length(); 
	for(int i=length-1;i>=0;i--) 
	{
		System.out.print(a[i]);
		System.out.println();
		rev = rev+str.charAt(i); 
	}
	System.out.println("The reversed string is "+rev);
	sc.close();
}

}
