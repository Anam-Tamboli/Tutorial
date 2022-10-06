package com;

public class Emp3 extends Employee implements Runnable{

	@Override
	int emp_id() {
		// TODO Auto-generated method stub
		return 103;
	}

	@Override
	String emp_name() {
		// TODO Auto-generated method stub
		return "Tom";
	}

	@Override
	int emp_age() {
		// TODO Auto-generated method stub
		return 26;
	}

	@Override
	int emp_dob() {
		// TODO Auto-generated method stub
		return 23-05;
	}

	@Override
	String emp_add() {
		// TODO Auto-generated method stub
		return "Punjab";
	}

	@Override
	int emp_phoneno() {
		// TODO Auto-generated method stub
		return 234567;
	}

	@Override
	String emp_quali() {
		// TODO Auto-generated method stub
		return "BBA";
	}

	@Override
	String emp_subject() {
		// TODO Auto-generated method stub
		return "Marketing";
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println();
	}
	public static void main(String args[])
	{
		Thread t3=new Thread();
		t3.start();
	}

}
