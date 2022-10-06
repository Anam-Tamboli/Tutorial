package com;

public class Emp4 extends Employee implements Runnable{

	@Override
	int emp_id() {
		// TODO Auto-generated method stub
		return 104;
	}

	@Override
	String emp_name() {
		// TODO Auto-generated method stub
		return "Sam";
	}

	@Override
	int emp_age() {
		// TODO Auto-generated method stub
		return 30;
	}

	@Override
	int emp_dob() {
		// TODO Auto-generated method stub
		return 11-01;
	}

	@Override
	String emp_add() {
		// TODO Auto-generated method stub
		return "HP";
	}

	@Override
	int emp_phoneno() {
		// TODO Auto-generated method stub
		return 321456;
	}

	@Override
	String emp_quali() {
		// TODO Auto-generated method stub
		return "BBA";
	}

	@Override
	String emp_subject() {
		// TODO Auto-generated method stub
		return "Finance";
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println();
	}
	public static void main(String args[])
	{
		Thread t4=new Thread();
		t4.start();
	}

}
