package com.globallogic.helloworld;

class A3 {
	public void printA3() {
		System.out.println("Print A3");
	}
}

class B3 extends A3 {
	public void printB3() {
		System.out.println("Print B3");
	}
}

class C3 extends A3 {
	public void printC3() {
		System.out.println("Print C3");
	}
}

public class HierarichalInheritance {
	public static void main(String[] args) {
		A3 a = new A3();
		a.printA3();
		B3 b = new B3();
		b.printA3();
		b.printB3();
		C3 c = new C3();
		c.printA3();
		c.printC3();

	}
}
