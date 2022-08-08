package com.globallogic.helloworld;

class A {

	int a;
	
	public A(int age) {
		a=age;
		System.out.println("Age is class A " + age);
	}

	int id = 5;

	public void printA() {
		System.out.println("Print class A");
	}
	
	public void run()
	{
		System.out.println("Running in class A");
	}
}

class B extends A {

	public B(int age) {
		super(age);
		System.out.println(super.a);
		super.printA();
		System.out.println("Age class B "+age);
	
		// TODO Auto-generated constructor stub
	}

	public void printid() {
		int b;
		b = super.id + 5;
		System.out.println("Value of b " + b);
	}

	public void printB() {
		System.out.println("Print class B");
	}
	
	public void run()
	{
		System.out.println("Running in class B");
	}
}

public class SingleInheritance {
	public static void main(String[] args) {
		A a = new A(10);
		a.printA();
		B b = new B(20);
		b.printA();
		b.printB();
		b.printid();
		
//		A a = new A(10);
//		a.run();

	}

}
