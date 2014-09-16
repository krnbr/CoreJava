package com.core.java.polymorphism;

import java.io.IOException;

class ExampleTwoParentClass {
	
	public static void test() throws IOException{
		System.out.println("123456");
	}
	
	public static void main(String[] args) {
		try {
			test();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
