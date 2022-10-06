package com;

public class Emp10 extends Employee implements Runnable{

	@Override
	int emp_id() {
		// TODO Auto-generated method stub
		return 110;
	}

	@Override
	String emp_name() {
		// TODO Auto-generated method stub
		return "Ramsha";
	}

	@Override
	int emp_age() {
		// TODO Auto-generated method stub
		return 20;
	}

	@Override
	int emp_dob() {
		// TODO Auto-generated method stub
		return 11-02;
	}

	@Override
	String emp_add() {
		// TODO Auto-generated method stub
		return "Goa";
	}

	@Override
	int emp_phoneno() {
		// TODO Auto-generated method stub
		return 76568;
	}

	@Override
	String emp_quali() {
		// TODO Auto-generated method stub
		return "BA";
	}

	@Override
	String emp_subject() {
		// TODO Auto-generated method stub
		return "History";
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println();
	}
	public static void main(String args[])
	{
		Thread t10=new Thread();
		t10.start();
	}

}
