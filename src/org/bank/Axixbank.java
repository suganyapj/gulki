package org.bank;

public class Axixbank extends BankInfo {
	public void deposit()
	{
		super.deposit();
	System.out.println("You have to deposit 10000");
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Axixbank ab=new Axixbank();
ab.deposit();

	}

}
