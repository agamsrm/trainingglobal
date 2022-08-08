package com.globallogic.helloworld;

interface EveOd {
	public String res(int n);
}

interface LargeNo {
	public void res(int a, int b);
}

interface Smallno {
	public void res(int a, int b);
}

interface Print {
	public void print();
}

interface Sum {
	public int sum();
}

public class Lambda {

	public static void main(String[] args) {

		EveOd e = (n) -> (n % 2 == 0) ? "Even" : "Odd";

		System.out.println(e.res(665587));

		System.out.println(e.res(55764356));
		
		System.out.println("------------------------");

		LargeNo ln = (a, b) -> {
			if (a > b)
				System.out.println(a + " is the largest");
			else
				System.out.println(b + " is the largest");
		};
		ln.res(654949, 7596);

		System.out.println("------------------------");

		Smallno sn = (a, b) -> {

			if (a > b)
				System.out.println(b + " is the Smallest");
			else
				System.out.println(a + " is the Smallest");

		};
		sn.res(3453, 9868979);
		
		System.out.println("------------------------");

		Print p1 = () -> System.out.println("Welcome Hello World !");

		p1.print();

		
		System.out.println("------------------------");
		Sum stt = () -> {
			int sum = 0;
			for (int i = 1; i <= 10; i++)
				sum = sum + i;
			return sum;
		};
		System.out.println(stt.sum());

	}

}

