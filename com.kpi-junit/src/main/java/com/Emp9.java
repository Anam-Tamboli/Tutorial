package com;

public class Emp9 extends Employee implements Runnable{

	@Override
	int emp_id() {
		// TODO Auto-generated method stub
		return 109;
	}

	@Override
	String emp_name() {
		// TODO Auto-generated method stub
		return "Sonal";
	}

	@Override
	int emp_age() {
		// TODO Auto-generated method stub
		return 24;
	}

	@Override
	int emp_dob() {
		// TODO Auto-generated method stub
		return 21-03;
	}

	@Override
	String emp_add() {
		// TODO Auto-generated method stub
		return "Karnataka";
	}

	@Override
	int emp_phoneno() {
		// TODO Auto-generated method stub
		return 8765456;
	}

	@Override
	String emp_quali() {
		// TODO Auto-generated method stub
		return "BSC";
	}

	@Override
	String emp_subject() {
		// TODO Auto-generated method stub
		return "Zoology";
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println();
	}
	public static void main(String args[])
	{
		Thread t9=new Thread();
		t9.start();
	}

}
