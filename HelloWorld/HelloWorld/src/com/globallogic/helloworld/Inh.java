package com.globallogic.helloworld;

class A16 {
	int i;

	A16() {
		System.out.println("A16");
	}

	public void eat() {
		System.out.println("Eat A");
	}

	public void run() {
		System.out.println("Running");
	}
}

class B16 extends A16 {
	// super.eat();
	// super.i=10;
	// super.run();
	public void eat() {
		super.eat();
		System.out.println("Eat B");
		super.eat();
		super.i = 10;
		System.out.println(super.i);
	}

}

public class Inh {
	public static void main(String[] args) {
//       A16 a = new A16();
//       a.eat();
		B16 b = new B16();
		b.eat();

	}

}
