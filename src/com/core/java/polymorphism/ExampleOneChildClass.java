package com.core.java.polymorphism;

public class ExampleOneChildClass extends ExampleOneParentClass{

	public int getA(){
		return getA();
	}
	
	public ExampleOneChildClass() {
		super();
		System.out.println("Two");
	}
	
	public static void main(String[] args) {
		ExampleOneChildClass exampleOneChildClass = new ExampleOneChildClass();
	}
	
}
