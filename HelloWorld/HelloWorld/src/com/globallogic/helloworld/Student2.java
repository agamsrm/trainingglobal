package com.globallogic.helloworld;

class Student1<Z,X,C,D,E>

{
	Z id;
	X name;
	C schoolname;
	D section;
	E marks;
	
//	Student1()
//	{
//		id=11;
//		name="Punyam";
//		schoolname="RLB";
//		section="B3";
//		marks="7";
//				
//	}
//	
	Student1(Z id,X name, C schoolname,D section,E marks)
	{
		this.id=id;
		this.name=name;
		this.schoolname=schoolname;
		this.section=section;
		this.marks=marks;
		}
	
	public void setData(Z id,X name, C schoolname,D section,E marks)
	{
		this.id=id;
		this.name=name;
		this.schoolname=schoolname;
		this.section=section;
		this.marks=marks;
		
	}
	public void getData()
	{
		System.out.println("The id of student is " +id);
		System.out.println("The name of student is " +name);
		System.out.println("The schoolname of student is " +schoolname);
		System.out.println("The section of student is " +section);
		System.out.println("The marks of student is " +marks);
	}
	

}
public class Student2
{
	public static void main(String[] args) 
	{
		Student1<Integer,String,String,String,String> s1=new Student1<Integer,String,String,String,String>(111,"Agam","SRMCEM","B1","8.5"); //sirf wrapper class hi likh skte hai not dataty
		//s1.setData(11, "Mohan", "PMS", "B2", "8");
		s1.getData();
	}
}