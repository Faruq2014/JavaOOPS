	/**
	 * 
	 */
	package com.InterfaceBasics;
	
	/**
	 * @author Faruq
	 *
	 */
	public interface Basics {
	/*   What is an Interface?
	 * 
	 * An interface in Java is a blueprint of a class. It has static constants and abstract methods.
	 * An interface in Java is a System Requirement Specification(SRS).
	 * An interface in Java is a is agreement between client and service provider. 
	 * 
	 * Why do we need an interface?
	 * 
	 * What are  the advantages  of an interface?
	 * The interface in Java is a mechanism to achieve abstraction.
	 * The interface in Java is a mechanism to achieve multiple inheritance in Java.
	 * It can be used to achieve loose coupling.
	 * 
	 * How to declare an Interface in java?
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
	              
	              
	next »« prev
	Interface in Java
	Interface
	Example of Interface
	Multiple inheritance by Interface
	Why multiple inheritance is supported in Interface while it is not supported in case of class.
	Marker Interface
	Nested Interface
	An interface in Java is a blueprint of a class. It has static constants and abstract methods.
	
	The interface in Java is a mechanism to achieve abstraction. There can be only abstract methods in the Java interface, not method body. It is used to achieve abstraction and multiple inheritance in Java.
	
	In other words, you can say that interfaces can have abstract methods and variables. It cannot have a method body.
	
	
	Java Interface also represents the IS-A relationship.
	
	It cannot be instantiated just like the abstract class.
	
	Since Java 8, we can have default and static methods in an interface.
	
	Since Java 9, we can have private methods in an interface.
	
	Why use Java interface?
	There are mainly three reasons to use interface. They are given below.
	
	It is used to achieve abstraction.
	By interface, we can support the functionality of multiple inheritance.
	It can be used to achieve loose coupling.
	Why use Java Interface
	
	
	How to declare an interface?
	
	An interface is declared by using the interface keyword. It provides total abstraction; means all the methods in an interface are declared with the empty body, and all the fields are public, static and final by default. A class that implements an interface must implement all the methods declared in the interface.
	
	Syntax:
	interface <interface_name>{  
	      
	    // declare constant fields  
	    // declare methods that abstract   
	    // by default.  
	}  
	Java 8 Interface Improvement
	Since Java 8, interface can have default and static methods which is discussed later.
	
	Internal addition by the compiler
	The Java compiler adds public and abstract keywords before the interface method. Moreover, it adds public, static and final keywords before data members.
	In other words, Interface fields are public, static and final by default, and the methods are public and abstract.
	
	interface in java
	
	 
	The relationship between classes and interfaces
	A class extends another class, an interface extends another interface,
	 but a class implements an interface.It is a IS-A-RRELATIONSHIP concept.
	 it is not has-a- relationship concept.
		}  
	 * 
	 */
		// what does an Interface contain?
		/*
		 *1. abstract methods 2.constants(variable), 3. default methods, 4. static methods,
		 *  and nested types. Method bodies exist only for default methods and static methods.
		 *  by the way a class contain five things.
		 *  variable, constructor, method, static block and non-static block.
		 *  Writing an interface is similar to writing a class. But a class describes the attributes and 
		 *  behaviors of an object. And an interface contains behaviors that a class implements.
		 */
		
		// what are the unique feature of an interface or the difference between class?
		
		/*You cannot instantiate an interface.

	An interface does not contain any constructors.
	
	All of the methods in an interface are abstract.
	
	An interface cannot contain instance fields. The only fields that can appear in an interface
	 must be declared both static and final.
	
	An interface is not extended by a class; it is implemented by a class.
	
	An interface can extend multiple interfaces.
			
		 */
		
		// Explain Extending key words in Interface.
		public void test1();
		
	}
