package com.Interface_Abstraction;

public class Client {

	public static void main(String[] args) {
		
		FDIC_Abstract bocAbstract = new Bank_Of_America("boa", 2000);
		bocAbstract.savingAccount(null);
		FDIC_Abstract wfg =new Wells_Far_Go("Wells",1500);
		wfg.LoaninterestRate(7);
	}

}
