package com.InterfaceType;

class Parent{
	public void m1() {
		System.out.println("this is parent");
	}
}



class Child extends Parent{
	
}


public class SingleLevel {
	
public static void main(String[] args) {
	Child child = new Child();
	child.m1();
}
}
