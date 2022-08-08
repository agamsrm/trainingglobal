package com.globallogic.helloworld;

import java.util.*;
import java.util.concurrent.*;

public class SetIs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Myemp> e = new TreeSet<Myemp>(new Sor());
		boolean t = true;

		while (t == true) {
			if (t == true) {
				{

					System.out.println("1. Add the employee to Set");
					System.out.println("2. Delete the employee from Set");
					System.out.println("3. Search the employee name");
					System.out.println("4. Sort the data of employee");

					int i = sc.nextInt();

					switch (i) {
					case 1: {
						System.out.println("Enter the  name");
						String s = sc.next();
						System.out.println("Enter the salary");
						int sal = sc.nextInt();
						System.out.println("Enter the id");
						int id = sc.nextInt();
						e.add(new Myemp(s, id, sal));
						System.out.println("Data Added Successfully");
						break;
					}
					case 2: {

						System.out.println("Enter the person name to be deleted");
						String na = sc.next();
						Iterator<Myemp> ea = e.iterator();
						while (ea.hasNext()) {
							Myemp value = ea.next();
							if (value.getNa().equals(na)) {

								ea.remove();
							}

						}
						System.out.println(e);
						break;
					}
					case 3: {
						System.out.println("Enter the person name to be searched");
						String name = sc.next();
						for (Myemp ea : e) {
							if (ea.getNa().equals(name)) {
								System.out.println(ea.toString());

							}

						}
						break;
					}
					case 4: {

						System.out.println("Sorted Set Data are");

						System.out.println(e);

						break;
					}
					default: {
						System.out.println("Invalid Input");
					}

					}
				}
				System.out.println("Do you want to continue");
				t = sc.nextBoolean();
			} else {
				System.exit(0);
			}

		}
	}
}

class Sor implements Comparator<Myemp> {
	@Override
	public int compare(Myemp o1, Myemp o2) {
		// TODO Auto-generated method stub
		return o1.getNa().compareTo(o2.getNa());
	}
}

class Myemp {
	private String na;
	private int id;
	private int salary;

	public String getNa() {
		return na;
	}

	public void setNa(String na) {
		this.na = na;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Myemp(String na, int id, int salary) {
		super();
		this.na = na;
		this.id = id;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Myemp [na=" + na + ", id=" + id + ", salary=" + salary + "]";

	}

}