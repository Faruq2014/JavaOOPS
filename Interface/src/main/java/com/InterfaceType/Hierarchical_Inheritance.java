package com.InterfaceType;


 class  BaseTest {
	 public void befroe() {
		 System.out.println("before test");
		 
		
	 }
	 


	public void takeScreenShot() {
		 System.out.println("screen shot test >> parents method");
	 }
	
	 public void after() {
		 System.out.println("after test");
	 }
	 
 }
 
 
 class Login extends  BaseTest{
	 
	 public void userName() {
		 
	 }
	 
	 @Override
	 public void takeScreenShot() {
		 System.out.println("screen shot test >>>> child method");
	 }
 }
 
 class Deposite extends BaseTest{
	 public void balance()	{
		 
	 }
 }
 
 
public class Hierarchical_Inheritance {

	public static void main(String[] args) {
		
		BaseTest bt = new BaseTest(); // parent class reference = parent class object
	    //bt.after();
	    bt.takeScreenShot();
		Login lg = new Login(); // child class reference =child class object
		//lg.after();
		lg.takeScreenShot();
		
		BaseTest pc= new Login(); // Parent class reference = child class object // selenium
		//pc.after();
		pc.takeScreenShot();
		
		
		//Login cp = new BaseTest(); not possible
		
		

	}

}
