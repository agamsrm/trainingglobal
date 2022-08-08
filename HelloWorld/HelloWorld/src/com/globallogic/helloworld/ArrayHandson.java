//create a array of object of student type and create and store 10 object and print 10 object value



package com.globallogic.helloworld;
import java .util.*;
public class ArrayHandson {
public static void main(String[] args) {
	Student[] st=new Student[3];
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<3;i++){
		System.out.println("enter name");
		String s=sc.next();
		System.out.println("enter age");
		int a=sc.nextInt();
		System.out.println("enter address");
		String add=sc.next();
		//Student stu=new Student(s,add,a);
		//st[i]=stu;
		
		st[i]=new Student(s,add,a);
		
	}
	for(Student e:st){
		e.print();
	}
	sc.close();
}
}
class Student{
	private String name;
	private String add;
	private int age;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAdd() {
		return add;
	}


	public void setAdd(String add) {
		this.add = add;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public Student(String name, String add, int age) {
		super();
		this.name = name;
		this.add = add;
		this.age = age;
	}

	public void print(){
		System.out.println("Student name"+name);
		System.out.println("Student Age"+age);
		System.out.println("Student addreass"+add);
		
	}
}