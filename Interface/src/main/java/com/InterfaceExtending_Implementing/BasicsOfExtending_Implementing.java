package com.InterfaceExtending_Implementing;

public interface BasicsOfExtending_Implementing {
	
/*
	 How to declare an Interface in java?
			 * 
	 * An interface is declared by using the interface keyword.
	 * It provides total abstraction; means all the methods in an interface are declared with the empty body,
	 *  and all the fields are public, static and final by default. A class that implements an interface must
	 *  implement all the methods declared in the interface.
	 *  An interface is implicitly abstract. You do not need to use the abstract keyword while 
	 *  declaring an interface.Each method in an interface is also implicitly abstract, 
	 *  so the abstract keyword is not needed.Methods in an interface are implicitly public.
	 *  
	 *  Interface <interface_name>{  
		      
		    // declare constant fields 
		      public void final int age =35;
		       
		    // declare methods that abstract 
		     public abstract void marry(int age);   
		    // by default. 
		     * 
		    Java 8 Interface Improvement
	              Since Java 8, interface can have default and static methods which is discussed later.
	              
	*/	
	
	// what is extends key word is Interface?
	/*extend key words is to inherit one interface to another interface
	 * 
	 */
	interface Soccer extends Sports{
	}
	// what is implements key word is Interface?
		/*implements key words is to inherit one interface to another interface
		 * 
		 */
	class SoccerGame implements Sports{

		@Override
		public void setHomeTeam(String name) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void setVisitingTeam(String name) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	// can one interface implements another interface? -->no
	//can one class implements another class?--> no
	
	//can one interface implements one  class?-->no
	
	
	//can one interface extends one  class?-->no
	//can one class extends one  interface?-->no
	/*
	 * no, cross connection is not possible 
	
	interface Soccer implements Sports{ // interface can not implements interface
	}
	class SoccerGame implements class CricketGame{// class can not implements class
		
	}
	 */
	}
	

