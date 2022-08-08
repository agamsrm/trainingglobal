package com.globallogic.helloworld;

import java.util.Scanner;

public class Generic {
public static void main(String[] args) {
	Stude<String,String,Integer,Double,Boolean>[]n =new Stude[2];

	Scanner sc=new Scanner(System.in);
	for(int i=0;i<2;i++){
		System.out.println("enter name");
		String s=sc.next();
		System.out.println("enter age");
		int a=sc.nextInt();
		System.out.println("enter address");
		String add=sc.next();
		System.out.println("enter marks");
		double ma=sc.nextDouble();
		System.out.println("enter friend");
		boolean f=sc.nextBoolean();
		n[i] =new Stude<String,String,Integer,Double,Boolean>(s,add,a,ma,f);
	}
	for(Stude<String,String,Integer,Double,Boolean> e:n){
		System.out.println(e.toString());
		e.getData();
	}
	sc.close();
	
}
}
class Stude<name,add,age,marks,friend>
{
	name name;
	add address;
	age age;
	marks m;
	friend f;
	/*public Stude()
	{
		
		this.name="Punyam";
		this.address="barabanki"
		this.m=100.0;
		this.age=23;
		this.f=true;
				
	}*/
	public Stude(name name, add address, age age, marks m, friend f) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
		this.m = m;
		this.f = f;
		
		
	}
	public name getName() {
		return name;
	}
	public void setName(name name) {
		this.name = name;
	}
	public add getAddress() {
		return address;
	}
	public void setAddress(add address) {
		this.address = address;
	}
	public age getAge() {
		return age;
	}
	public void setAge(age age) {
		this.age = age;
	}
	public marks getM() {
		return m;
	}
	public void setM(marks m) {
		this.m = m;
	}
	public friend getF() {
		return f;
	}
	public void setF(friend f) {
		this.f = f;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", age=" + age + ", m=" + m + ", f=" + f + "]";
	}

	public void getData()
	{
		System.out.println("The name of student is" +name);
		System.out.println("The address of student is" +address);
		System.out.println("The  of age student is" +age);
		System.out.println("The marks of student is" +m);
		System.out.println("The student has a friend" +f);
	}
	
}