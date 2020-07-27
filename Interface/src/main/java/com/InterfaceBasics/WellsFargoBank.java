package com.InterfaceBasics;

public class WellsFargoBank implements FDIC{
	/*an implementing class must implement all the method from interface.
	 * it can add any number of its own class 
	 * it can over ride any number of inherited methods from interface. 
	 * it can not change the interface variable value, because they are constant.
	 * it can implements any number of interface, but must implements all the method.
	 * it can extend one class and implements any number of interface  together.
	 */
		
		public static void main(String[] args) {
		
			 new WellsFargoBank().bname(null); //
			 new WellsFargoBank().checkingAccount(null);// string, even if you put null/default value in the constructor it call the method argument.
			 new WellsFargoBank().savingAccount(null);
			 new WellsFargoBank().LoaninterestRate(0);// float, even if you put 0/default value in the constructor it call the method argument.
		}

		@Override
		public void bname(String bankName) {
			bankName="WellsFargoBank";
			System.out.println("This is "+bankName);
			System.out.println("we are member of "+FDIC.name);
			System.out.println(" minimum balance you have to maintain "+ FDIC.minimumBalance+"\r\n");//+"\r\n"=line breaker
		
			
		}

		@Override
		public void checkingAccount(String checkingName) {
			checkingName="abc checking accont.";
			System.out.println("we are providing "+checkingName+"\r\n");
			
		}

		@Override
		public void savingAccount(String savingName) {
			savingName="xyz saving accont.";
			System.out.println("we are providing "+savingName+"\r\n");
			
		}

		@Override
		public void LoaninterestRate(float interest) {
			interest=(float) 2.0; 
			System.out.println("saving account interest rate is "+FDIC.interestRate+ interest+"%");
			
		}

}
