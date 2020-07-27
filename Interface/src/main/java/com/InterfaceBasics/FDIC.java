/**
 * 
 */
package com.InterfaceBasics;

/**
 * @author Faruq
 *
 */
public interface FDIC {
    String name = "FDIC";  // by default all variable is constant =public static final
    double minimumBalance = 2000;
	public static final float interestRate = 5;
	
	public abstract  void bname(String bankName);
	
	public abstract void checkingAccount(String checkingName);

	void savingAccount(String savingName); // by default all methods are public and abstract 

	void LoaninterestRate(float interest);
	// it is possible to declare with argument or method signature
}
