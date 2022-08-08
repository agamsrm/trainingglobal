package com.globallogic.helloworld;

 class Sports1 {

	int player;
	int over;
	int runs;

	Sports1() {
		System.out.println("In class sports");
	}

	Sports1(int player, int over, int runs) {
		this.player = player;
		this.over = over;
		this.runs = runs;

	}
	
	public void getData()
	{
		System.out.println(player);
		System.out.println(over);
		System.out.println(runs);
	}

}

class Cricket1 extends Sports1
{
	int bats;
	int bowl;
	int ump;
	int day;
	Cricket1()
	{
		System.out.println("In cricket class");
	}
	
	Cricket1(int bats,int bowl,int ump,int day)
	{
		super(bats,bowl,ump);
		this.day=day;
		
	}
	
	public void getData()
	{
		super.getData();
		System.out.println(day);
	}
	
}


public class Sports
{
	public static void main(String[] args) {
		Cricket1 cr = new Cricket1(2,5,5,5);
		cr.getData();
	}
}