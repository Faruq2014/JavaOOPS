package com.Interface_Abstraction;
	/*
	 * Points to Remember
	An abstract class must be declared with an abstract keyword.
	It can have abstract and non-abstract methods.
	It cannot be instantiated.
	It can have constructors and static methods also.
	It can have final methods which will force the subclass not to change the body of the method.
	variable can not be abstract.
	
	 */
public abstract class FDIC_Abstract {
   
	String name ;  // variable can use any modifier but abstract.
    double minimumBalance;
   
	
	  //It can have any number of constructors . 
    public FDIC_Abstract() { super();
	  }
	 
    public FDIC_Abstract(String name, double minimumBalance) {
		super();
		this.name = name;
		this.minimumBalance = minimumBalance;
		System.out.println("The bank name is "+name);
		System.out.println("The minimum balabce  is "+minimumBalance);
	}

	public static final float interestRate = 5; // constant or final modifier can not be part of constructor.
	
	public static void main(String[] args) {
		//FDIC_Abstract fdic = new FDIC_Abstract();  
	//It cannot be instantiated.
		// you can not create direct object out of abstract class. indirectly you can.
	}
	//It can have any number of abstract  methods even 0 number.
	public abstract  void savingAccount(String savingAccount);
	public abstract void checkingAccount(String checkingName);

	//It can have any number of non-abstract methods/concrete method even 0 number.
	public static void name() {
		
	}
	/*
	 * void savingAccount(String savingName) { }
	 */

	void LoaninterestRate(float interest) {
		System.out.println("interest rate is "+interest);
	}
	

}
