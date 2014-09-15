package com.core.java.util.collection.Stack;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.add(1);
		stack.add(2);
		stack.add(3);
		stack.add(4);
		System.out.println(stack);
		stack.remove(2);
		System.out.println(stack);
		stack.peek();
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
	}
	
}
