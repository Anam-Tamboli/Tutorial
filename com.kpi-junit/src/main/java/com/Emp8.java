package com;

public class Emp8 extends Employee implements Runnable {

	@Override
	int emp_id() {
		// TODO Auto-generated method stub
		return 108;
	}

	@Override
	String emp_name() {
		// TODO Auto-generated method stub
		return "Tamboli";
	}

	@Override
	int emp_age() {
		// TODO Auto-generated method stub
		return 28;
	}

	@Override
	int emp_dob() {
		// TODO Auto-generated method stub
		return 14-04;
	}

	@Override
	String emp_add() {
		// TODO Auto-generated method stub
		return "HP";
	}

	@Override
	int emp_phoneno() {
		// TODO Auto-generated method stub
		return 787875;
	}

	@Override
	String emp_quali() {
		// TODO Auto-generated method stub
		return "B.COM";
	}

	@Override
	String emp_subject() {
		// TODO Auto-generated method stub
		return "Satistics";
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println();
	}
	public static void main(String args[])
	{
		Thread t8=new Thread();
		t8.start();
	}

}
