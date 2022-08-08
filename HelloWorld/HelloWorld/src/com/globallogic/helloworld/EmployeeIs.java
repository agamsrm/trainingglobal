
//formal parameter instance variable ki value ko hide kr deta hai
//kyonki uski(local) ki precedence jyada hoti hai
//this refers to same object and remove hiding concept of instance variable
//jis samay jo object se call hoga usi ko refer krega
//no need to remember multiple variable name less syntax error



package com.globallogic.helloworld;

public class EmployeeIs {
	
	String employeename;
	int employeesalary;
	int employeeid;
	
	public void setinfo(String employeename,int employeesalary,int employeeid)
	{
		this.employeename=employeename; // current object point 
		this.employeesalary=employeesalary;
		this.employeeid=employeeid;
	}
	
	public void getinfo()
	{
		System.out.println(employeename);
		System.out.println(employeesalary);
		System.out.println(employeeid);
	}
	
	public static void main(String[] args) {
		EmployeeIs emp=new EmployeeIs();
		emp.setinfo("Agam",4555454,4454);
		emp.getinfo();
		
		EmployeeIs emp1=new EmployeeIs();
		emp1.setinfo("Punyam", 45454545, 45);
		emp1.getinfo();
		
//		EmployeeIs emp2 =null;
//		emp2=new EmployeeIs();
	}
	
	
}

