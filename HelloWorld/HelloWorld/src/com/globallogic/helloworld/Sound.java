//abstract method can only exist in abstract class
//if subclass do not want to define all methods of superclass it must be declared as abstract
//can't create object of abstract class
//we cannot create object of abstract class
//it is not compulsory to have abstract methods in abstract class
//a class of which we can create object is called concrete class
//abstract class ka implicit object bant hai mtlb by environment
//explicit means what we create as a developer
//we can create constructor of abstract class it get invoked when object of subclass is made
//(not recommended)


package com.globallogic.helloworld;

abstract class Sound1
{     
//	Sound1()                                            //not recommended
//	{                                                   // overriding --> abstraction  //abstract class
//		System.out.println("In sound 1");
//	}
    abstract void cry();
    abstract void scream();
	void night()
	{
		System.out.println("Dark");
	}
	

}

 class Cat extends Sound1  //inheritance
{

	void cry()
	{
		System.out.println("Mew");
	}
	
	void scream()
	{
		System.out.println("Loud");
	}
	
	void night()
	{
		super.night();
		System.out.println("Cat dark");
	}
	
}

public class Sound  //concrete class  and singelton class
{
	public static void main(String[] args) { //inheritance child class object --> parent class
		//Sound1 s =new Sound1();
		Cat c =new Cat();  // child class ka object
		c.cry();   // object --> implicit aur explicit 
		c.scream();
		c.night();
				
	}
}