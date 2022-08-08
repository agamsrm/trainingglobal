package com.globallogic.helloworld;

class A1 {
	public void printA() {
		System.out.println("Print class A");

	}
}

class B1 extends A1 {
	public void printB() {
		System.out.println("Print class B");
	}
}

class C1 extends B1 {
	public void printC() {
		System.out.println("Print class C");
	}
}

public class MultilevelInheritance {
	public static void main(String[] args) {
		
		A1 a = new A1();
		a.printA();
		B1 b= new B1();
		b.printA();
		b.printB();
		C1 c= new C1();
		c.printA();
		c.printB();
		c.printC();

	}

}
