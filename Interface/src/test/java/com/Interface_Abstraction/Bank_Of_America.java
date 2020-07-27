package com.Interface_Abstraction;

public class Bank_Of_America extends FDIC_Abstract{

	public Bank_Of_America(String name, double minimumBalance) {
		super(name, minimumBalance);
		
	}
public static void main(String[] args) {
	
	FDIC_Abstract bocAbstract = new Bank_Of_America("boa", 2000);
	bocAbstract.savingAccount(null);
	// no direct object
	//FDIC_Abstract bAbstract = new FDIC_Abstract();
}

	@Override
	public void savingAccount(String savingAccount) {
		savingAccount="ABCsavimg";
		System.out.println(savingAccount);
		
	}

	@Override
	public void checkingAccount(String checkingName) {
		checkingName="XYZchecking";
		System.out.println(checkingName);
	}

}
