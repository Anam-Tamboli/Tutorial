package com;
import java.util.ArrayList;
public class ArrayListElem {
	public int check(){
	//public static void main(String args[])
	{
		ArrayList<String> list1= new ArrayList<String>();
		list1.add("Anam");
		list1.add("Tina");
		list1.add("Pinki");
		list1.add("Jerry");
		list1.add("Tom");
		list1.add("Sammu");
		
		
		ArrayList<String> list2= new ArrayList<String>();
		list2.add("Grace");
		list2.add("Anam");
		list2.add("Eva");
		list2.add("Aadhya");
		list2.add("Dola");
		
		ArrayList<String> list3= new ArrayList<String>();
		list3.add("Doll");
		list3.add("Doli");
		list3.add("Doro");
		list3.add("Anam");
		list3.add("Divya");
		
		ArrayList<String> list4= new ArrayList<String>();
		list4.add("Sama");
		list4.add("Anam");
		list4.add("Mia");
		list4.add("Sofiya");
		list4.add("Amelia");
		
		ArrayList<String> list5= new ArrayList<String>();
		list5.add("Abigail");
		list5.add("Abby");
		list5.add("Aadi");
		list5.add("Leo");
		list5.add("Anam");
		
		list1.retainAll(list2);
		list1.retainAll(list3);
		list1.retainAll(list4);
		list1.retainAll(list5);
		System.out.println("Common Element"+ list1);
		String s= list1.get(0);
		
		int index=list3.indexOf(s);
		System.out.println("Index of Element in list3"+index);
		return index;
		//System.out.println("Index of duplicate string in list_1 is  "+list1.indexOf("Anam"));
		
}
	
}
}
