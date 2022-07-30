package org.bank;

public class AxisBank extends BankInfo {
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println(" deposit interest 6.6%");
	}

	public void saving() {
		// TODO Auto-generated method stub
		System.out.println(" saving account");

	}

	public void fixed() {
		// TODO Auto-generated method stub
		System.out.println("fixed interest 10.5%");

	}

	public static void main(String[] args) {
		AxisBank obj = new AxisBank();
		obj.deposit();
		obj.fixed();
		obj.saving();

	}

}
