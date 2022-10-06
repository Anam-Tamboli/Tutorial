package com;

public class Emp2 extends Employee implements Runnable{

	@Override
	int emp_id() {
		// TODO Auto-generated method stub
		return 102;
	}

	@Override
	String emp_name() {
		// TODO Auto-generated method stub
		return "Tina";
	}

	@Override
	int emp_age() {
		// TODO Auto-generated method stub
		return 25;
	}

	@Override
	int emp_dob() {
		// TODO Auto-generated method stub
		return 23-2;
	}

	@Override
	String emp_add() {
		// TODO Auto-generated method stub
		return "AP";
	}

	@Override
	int emp_phoneno() {
		// TODO Auto-generated method stub
		return 36578;
	}

	@Override
	String emp_quali() {
		// TODO Auto-generated method stub
		return "BSC";
	}

	@Override
	String emp_subject() {
		// TODO Auto-generated method stub
		return "Maths";
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println();
	}
	public static void main(String args[])
	{
		Thread t2=new Thread();
		t2.start();
	}

}
