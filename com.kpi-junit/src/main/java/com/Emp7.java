package com;

public class Emp7 extends Employee implements Runnable{

	@Override
	int emp_id() {
		// TODO Auto-generated method stub
		return 107;
	}

	@Override
	String emp_name() {
		// TODO Auto-generated method stub
		return "Jolly";
	}

	@Override
	int emp_age() {
		// TODO Auto-generated method stub
		return 34;
	}

	@Override
	int emp_dob() {
		// TODO Auto-generated method stub
		return 21-04;
	}

	@Override
	String emp_add() {
		// TODO Auto-generated method stub
		return "Gujrat";
	}

	@Override
	int emp_phoneno() {
		// TODO Auto-generated method stub
		return 674847;
	}

	@Override
	String emp_quali() {
		// TODO Auto-generated method stub
		return "BSC";
	}

	@Override
	String emp_subject() {
		// TODO Auto-generated method stub
		return "Physics";
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println();
	}
	public static void main(String args[])
	{
		Thread t7=new Thread();
		t7.start();
	}
}
