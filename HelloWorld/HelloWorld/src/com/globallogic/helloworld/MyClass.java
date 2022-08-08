package com.globallogic.helloworld;

class Employee
{
	private int id;
	private String name;
	private String address;
	private int age;
	private int salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
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
	
	
	public void print()
	{
		System.out.println(id +" "+ name+" "+address+ " "+age+" "+salary);
	}
	
	public Employee(int id, String name, String address, int age, int salary)
	{
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.age = age;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", age=" + age + ", salary=" + salary
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + age;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + salary;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (age != other.age)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}
	
	
	
}






public class MyClass 
{
public static void main(String[] args)
{
	Employee emp = new Employee(150,"Punyam","Barabanki",22,1000000);
	System.out.println(emp.getAge());
	System.out.println(emp.getName());
	System.out.println(emp.getAddress());
	System.out.println(emp.getSalary());
	System.out.println(emp.getId());
	System.out.println(emp.toString());
	System.out.println(emp.hashCode());
	emp.print();
	
	Employee emp1 = new Employee(140,"Agam","Barabanki",20,100000);
	System.out.println(emp1.getAge());
	System.out.println(emp1.getName());
	System.out.println(emp1.getAddress());
	System.out.println(emp1.getSalary());
	System.out.println(emp1.getId());
	System.out.println(emp1.toString());
	System.out.println(emp1.hashCode());
	emp1.print();
	
	System.out.println(emp.equals(emp1));
	

}
}
