package com.globallogic.helloworld;

class EmployeeNew {
	int age;
	int salary;
	static String city;


	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		EmployeeNew.city = city;
	}
	
	

}

public class MyStatic {
	public static void main(String[] args) {
	EmployeeNew emp = new EmployeeNew();	
	System.out.println(emp.getCity());
    System.out.println(EmployeeNew.city);
	}

}
