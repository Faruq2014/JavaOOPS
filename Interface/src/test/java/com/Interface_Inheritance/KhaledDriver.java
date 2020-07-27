package com.Interface_Inheritance;

import org.openqa.selenium.chrome.ChromeDriver;

public class KhaledDriver extends ChromeDriver{
	/* KhaledDriver is direct child of ChromeDriver class.
	 * As a result: KhaledDriver inherit all the method from ChromeDriver. since ChromeDriver already implemented
	 *  all the WebDriver interface methods,  KhaledDriver does not have to do it again. So he is only executing 
	 *  all the methods from his parents, and he has his own method to implements. 
	 *  this is the way we use our WebDriver interface. 
	 *  So ChromeDriver in middle implementing all the methods for us
	 *  and also working as a adopter class, so we do not have to adopt all the class.
	 *   and also create lots of its own method for us to use. so we only using what ever helpful for us.
	 */
	

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		KhaledDriver kDriver= new KhaledDriver(); // since he is direct child.
		// he does not have to write
		//WebDriver driver = new ChromeDriver();
		//ChromeDriver driver2 = new ChromeDriver();
		
		// using parents methods
		kDriver.get("https://www.salesforce.com/");
		System.out.println(kDriver.getCurrentUrl());
		System.out.println(kDriver.getKeyboard());
		System.out.println(kDriver.getTitle());
		
		// using his own method.
		kDriver.name("Salesforce: We Bring Companies and Customers Together");
		kDriver.quit();
		kDriver.init();
	}
	
	
	
	void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();


		KhaledDriver kDriver= new KhaledDriver();
		kDriver.get("https://www.salesforce.com/");
		kDriver.quit();
	}
	
	public  String name(String name) {
	
		if (name.equalsIgnoreCase("Salesforce: We Bring Companies and Customers Together")) {
		System.out.println("we are on write page.");	
		}
		return null;
		
	}
	
}
