package com.globallogic.helloworld;

class Animal {
	String color, type;
	String size = "big";

	void setData(String color, String type) {

		this.color = color;
		this.type = type;

	}

	void getData() {

		System.out.println(color);
		System.out.println(type);
	}

}

class Deer extends Animal {

	String speed;
	String size = "Medium";

	void setSpeed(String speed) {
		this.speed = speed;
	}

	void getData() {

		System.out.println("speed is " + speed);

		System.out.println("size is " + size);

		System.out.println("Animal size is " + super.size);// super class animal size

		super.getData();// animal class getData()
	}

}

public class AnimalDemo {
	public static void main(String[] args) {
		Deer d = new Deer();
		d.setData("brown", "herbivores");// from super class due to inheritance
		d.setSpeed("30Km");
		d.getData();// d.getD();

	}

}
