package com.core.java.util.collection.list;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Class01List {

	public static void main(String[] args) {
		
		List<Integer> listOfIntegers = new CopyOnWriteArrayList<Integer>();
		System.out.println("values in order of insertion are:-");
		for (int i = 0; i < 10; i++) {
			int temp = new Integer((int)((Math.random()*100)))+i;
			System.out.println("Integer at position ---> "+(i+1)+" is ---> "+temp);
			listOfIntegers.add(temp);
		}
		
		for (Iterator<Integer> iterator = listOfIntegers.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
		SOP(listOfIntegers);
		listOfIntegers.removeAll(listOfIntegers.subList(0,3));
		SOP(listOfIntegers);
	}
	
	public static <T> void SOP(T t){
		System.out.println(t);
	}
	
}
