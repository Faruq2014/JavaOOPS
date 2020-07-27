package com.Interface_Abstraction;

public class Wells_Far_Go extends FDIC_Abstract{

	public Wells_Far_Go(String name, double minimumBalance) {
		super(name, minimumBalance);
	
	}

	public static void main(String[] args) {
		FDIC_Abstract wfg =new Wells_Far_Go("Wells",1500);
		wfg.LoaninterestRate(7);
	}

	@Override
	public void savingAccount(String savingAccount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkingAccount(String checkingName) {
		// TODO Auto-generated method stub
		
	}

}
