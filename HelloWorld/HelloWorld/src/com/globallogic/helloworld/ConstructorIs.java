package com.globallogic.helloworld;


//class ke instance variable default value se initialized hotr hai ye kaam default constructor krta hai
//calls only once when object is created
//we use parametrized constructor in place of set data to make processing fast
//more than one constructor constructor overloading
//constructor overloading krke dikhao 
//agr parametrized constructor banaoge to default bana padega
//product architecture bno sab bana ke do setter getter default parametrized


class Constructor {

	String name;
	int rollno;
	String friend;
	
//	Constructor() // default constructor
//	{
//		name="Agam";
//		rollno=1812213013;
//		friend="Punyam";
//	}
	
	Constructor(String name, int rollno, String friend) //parametrized constructor
	{
		this.name = name;
		this.rollno = rollno;
		this.friend = friend;	
	}
//	
//	Constructor(int rollno,String name, String friend) //constructor overloading
//	{
//		this.rollno = rollno;
//		this.name = name;
//		this.friend = friend;
//	}

	public void set(String name, int rollno, String friend) {
		this.name = name;
		this.rollno = rollno;
		this.friend = friend;
	}

	public void get() {
		System.out.println(name);
		System.out.println(rollno);
		System.out.println(friend);
	}

}

public class ConstructorIs {
	public static void main(String[] args) {
		
		Constructor cs = new Constructor("hkhh",656565,"ddfdf"); // by default default constructor andar ban jaata hai
    	cs.set("Agam", 1812213013, "Punyam Bhai");
     	cs.get();

	}
}