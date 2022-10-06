package com;

public class Emp1 extends Employee implements Runnable{

	@Override
	int emp_id() {
		// TODO Auto-generated method stub
		return 101;
	}

	@Override
	String emp_name() {
		// TODO Auto-generated method stub
		return "Anam";
	}

	@Override
	int emp_age() {
		// TODO Auto-generated method stub
		return 23;
	}

	@Override
	int emp_dob() {
		// TODO Auto-generated method stub
		return 22-01;
	}

	@Override
	String emp_add() {
		// TODO Auto-generated method stub
		return "Mahrashtra";
	}

	@Override
	int emp_phoneno() {
		// TODO Auto-generated method stub
		return 1234567;
	}

	@Override
	String emp_quali() {
		// TODO Auto-generated method stub
		return "ME-TECH";
	}

	@Override
	String emp_subject() {
		// TODO Auto-generated method stub
		return "Computer";
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println();
		
	}
	public static void main(String args[])
	{
		Thread t1=new Thread();
		t1.start();
	}

	
	}


