package com.globallogic.helloworld;

class Plant
{
String stemtype,life;
Plant()
{

System.out.println("In plant class");
}
void setData(String stemtype, String life)
{
this.stemtype=stemtype;
this.life=life;
}
void getData()
{
System.out.println("stemtype is"+stemtype);
System.out.println("life is"+life);
}
}





class Shrubs extends Plant
{
Shrubs()
{

System.out.println("In shrubs class");
}

}




class Herbs extends Plant
{
Herbs()
{

System.out.println("In Herbs class");
}

}



class Mint extends Herbs
{
Mint()
{

System.out.println("In Mint class");
}

}


class InheriDemo
{
public static void main(String[]args)
{

Mint m=new Mint();//object of super class Herb->Plant
Herbs s=new Herbs();
	s.setData("hard","long");
	s.getData();
	m.setData("soft","short");
	m.getData();

}


}
