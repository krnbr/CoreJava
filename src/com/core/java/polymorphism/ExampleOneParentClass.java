package com.core.java.polymorphism;

public class ExampleOneParentClass {

	private int a = 3;
	
	public ExampleOneParentClass() {
		System.out.println("One");
	}

	public int getA(){
		return a;
	}
	
	// overloaded method it is correct
	public void getA(int a){
		//return a;
	}
	
	public void getA(long a){
		//return a;
	}
	
	public static void main(String[] args) {
		
	}
	
}
