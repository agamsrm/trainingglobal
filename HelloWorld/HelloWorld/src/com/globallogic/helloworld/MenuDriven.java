package com.globallogic.helloworld;

import java.util.*;

public class MenuDriven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<emplo> list = new LinkedList<emplo>();

		boolean t = true;

		while (t == true) {

			if (t == true) {
				System.out.println("1. Add the employee");
				System.out.println("2. Delete the employee");
				System.out.println("3. Search the employee name");
				System.out.println("4. Update the employee value using name");
				System.out.println("5. Sort the data of employee");
				System.out.println("6. Provide the sum of salary of employee");
				System.out.println("7 Search for highest paid salary");
				System.out.println("8 Search for minimum paid salary");
				int i = sc.nextInt();

				switch (i) {
				case 1: {
					System.out.println("Enter name");
					String s = sc.next();
					System.out.println("Enter value");
					int v = sc.nextInt();
					System.out.println("Enter salary");
					int sal = sc.nextInt();
					System.out.println("Enter id");
					int id = sc.nextInt();
					list.add(new emplo(s, v, sal, id));
					System.out.println("Data Added Successfully");
					break;
				}
				case 2: {
					System.out.println("Enter the person name to be deleted");
					String na = sc.next();
					for (emplo ea : list) {
						if (ea.getName().equalsIgnoreCase(na)) {

							list.remove(ea);
						}
						System.out.println(list);

					}
					break;

				}

				case 3: {
					System.out.println("Enter the person name to be searched");
					String na = sc.next();
					for (emplo ea : list) {
						if (ea.getName().equalsIgnoreCase(na)) {
							System.out.println(ea.toString());

						}

					}
					break;
				}

				case 4: {
					System.out.println("Enter the person name to be Updated");
					String na = sc.next();
					System.out.println("Enter the person value to be updated");
					int v = sc.nextInt();

					for (emplo ea : list) {
						if (ea.getName().equalsIgnoreCase(na)) {
							ea.setValue(v);
							System.out.println("Data Updated Successfully");

						}
					}
					break;
				}
				case 5: {

					Collections.sort(list, new SortBy());
					for (emplo e : list) {
						System.out.println(list);

					}

					break;
				}
				case 6: {
					double sum = 0;

					for (emplo e : list) {
						sum = sum + e.getSalary();
					}
					System.out.println(sum);
					break;
				}
				case 7: {
					int maxSal = Integer.MIN_VALUE;

					for (emplo e : list) {
						if (maxSal < e.getSalary()) {
							maxSal = e.getSalary();
						}
					}
					System.out.println(maxSal);
					break;
				}
				case 8: {
					int minSal = Integer.MAX_VALUE;

					for (emplo e : list) {
						if (minSal > e.getSalary()) {
							minSal = e.getSalary();
						}
					}
					System.out.println(minSal);
					break;
				}
				default: {
					System.out.println("Invalid Input");
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

class SortBy implements Comparator<emplo> {
	@Override
	public int compare(emplo o1, emplo o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
}

class emplo {
	private String name;
	private int value;
	private int salary;
	private int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public emplo(String name, int value, int salary, int id) {
		super();
		this.name = name;
		this.value = value;
		this.salary = salary;
		this.id = id;
	}

	@Override
	public String toString() {
		return "emplo [name=" + name + ", value=" + value + ", salary=" + salary + ", id=" + id + "]";
	}

}