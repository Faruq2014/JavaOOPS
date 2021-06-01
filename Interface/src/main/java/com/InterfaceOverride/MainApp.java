package com.InterfaceOverride;
class Webdriver{
	public String get() {
	System.out.println("this parent get ");
	return null;
	}
	
	public static void  getName() {
	System.out.println("this parent get ");

	}
	protected void getCurrentURl() {
		System.out.println("this parent get "); 
	 }
	void getTitle() {
		System.out.println("this parent get ");
	}

	private void getscreenshot() {
		System.out.println("this parent get "); 
	 }
	
	 final void getBalance() {
			System.out.println("this parent get ");
		}
}


class chrome extends Webdriver{
	public  String get() {
		System.out.println("this child get ");
		return null;
	}
	
	public static void  getName() { // method hiding
	System.out.println("this child get ");

	}
	
	 protected void getCurrentURl() {
		System.out.println("this child get "); 
	 }
	
 void getTitle() {
		System.out.println("this child get ");
	}

}



public class MainApp {

	public static void main(String[] args) {
		Webdriver wd = new chrome();
		wd.get();
		wd.getBalance();

	}

}
