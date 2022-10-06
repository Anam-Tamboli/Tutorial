package com;

public class Emp5 extends Employee implements Runnable{

	@Override
	int emp_id() {
		// TODO Auto-generated method stub
		return 105;
	}

	@Override
	String emp_name() {
		// TODO Auto-generated method stub
		return "Pinky";
	}

	@Override
	int emp_age() {
		// TODO Auto-generated method stub
		return 22;
	}

	@Override
	int emp_dob() {
		// TODO Auto-generated method stub
		return 15-03;
	}

	@Override
	String emp_add() {
		// TODO Auto-generated method stub
		return "HP";
	}

	@Override
	int emp_phoneno() {
		// TODO Auto-generated method stub
		return 547879;
	}

	@Override
	String emp_quali() {
		// TODO Auto-generated method stub
		return "BSC";
	}

	@Override
	String emp_subject() {
		// TODO Auto-generated method stub
		return "Biology";
	}

	public void run() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String args[])
	{
		Thread t5=new Thread();
		t5.start();
	}

}
