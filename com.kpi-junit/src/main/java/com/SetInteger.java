package com;
import java.util.Set;
import java.util.HashSet;
public class SetInteger {
	public int show() {
	//public static void main(String args[]) {
		Set<Integer> set=new HashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(10);
		set.add(50);
		set.add(20);
		set.add(35);
		set.add(76);
		set.add(34);
		set.add(20);
		set.add(30);
		set.add(44);
		set.add(30);
		set.add(65);
		set.add(10);
		set.add(50);
		set.add(90);
		set.add(65);
		set.add(76);
		set.add(67);
		
		int lastEle=0;
		for(int x:set)
		{
			lastEle=x;
		}
		System.out.println("List of Elemnets:"+set);
		System.out.println("Last Element in Set:"+lastEle);
		return lastEle;
	}
	public static void main(String args[]) {
		
	}
		
		
		
	}
	


