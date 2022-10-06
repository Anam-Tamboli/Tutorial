package com;

public class Joker extends AbstractJoker {
	String name;
	String dance;
	Joker()
	{
		
	}
Joker(String name, String dance){
	this.name=name;
	this.dance=dance;
}
@Override
String dance() {
	// TODO Auto-generated method stub
	return "Unique Dance Forms";
}
public static void main(String args[])
{
	Joker j1=new Joker();
	Joker j2=new Joker();
	Joker j3=new Joker();
	Joker j4=new Joker();  
	Joker j5=new Joker();
	Joker j6=new Joker();
	Joker j7=new Joker();
	Joker j8=new Joker();
	Joker j9=new Joker("Joker1","Bharatnatyam");
	Joker j10=new Joker("Joker2","Kathak");
	Joker j11=new Joker("Joker3","Kuchipudi");
	Joker j12=new Joker("Joker4","Manipuri");
	Joker j13=new Joker("Joker5","Sattriya");
	Joker j14=new Joker("Joker6","Mohiniyattam");
	Joker j15=new Joker("Joker7","Odissi");
	Joker j16=new Joker("Joker8","Bihu");
	
	
	System.out.println(j1.name+" is dancing"+j1.dance);
	System.out.println(j2.name+" is dancing"+j2.dance);
	System.out.println(j3.name+" is dancing"+j3.dance);
	System.out.println(j4.name+" is dancing"+j4.dance);
	System.out.println(j5.name+" is dancing"+j5.dance);
	System.out.println(j6.name+" is dancing"+j6.dance);
	System.out.println(j7.name+" is dancing"+j7.dance);
	System.out.println(j8.name+" is dancing"+j8.dance);
	System.out.println(j9.name+" is dancing"+j9.dance);
	System.out.println(j10.name+" is dancing"+j10.dance);
	System.out.println(j11.name+" is dancing"+j11.dance);
	System.out.println(j12.name+" is dancing"+j12.dance);
	System.out.println(j13.name+" is dancing"+j13.dance);
	System.out.println(j14.name+" is dancing"+j14.dance);
	System.out.println(j15.name+" is dancing"+j15.dance);
	System.out.println(j16.name+" is dancing"+j16.dance);
}

}
