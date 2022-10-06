package com;

public class Emp6 extends Employee implements Runnable{

	@Override
	int emp_id() {
		// TODO Auto-generated method stub
		return 106;
	}

	@Override
	String emp_name() {
		// TODO Auto-generated method stub
		return "Jerry";
	}

	@Override
	int emp_age() {
		// TODO Auto-generated method stub
		return 26;
	}

	@Override
	int emp_dob() {
		// TODO Auto-generated method stub
		return 12-06;
	}

	@Override
	String emp_add() {
		// TODO Auto-generated method stub
		return "Assam";
	}

	@Override
	int emp_phoneno() {
		// TODO Auto-generated method stub
		return 8787489;
	}

	@Override
	String emp_quali() {
		// TODO Auto-generated method stub
		return "BA";
	}

	@Override
	String emp_subject() {
		// TODO Auto-generated method stub
		return "Geography";
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println();
	}
	public static void main(String args[])
	{
		Thread t6=new Thread();
		t6.start();
	}

}
