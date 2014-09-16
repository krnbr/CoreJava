package com.core.java.util.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.core.java.util.P;

public class Class01List {

	public static void main(String[] args) {
		
		List<Integer> listOfIntegers = new ArrayList<Integer>();
		P.p("values in order of insertion are:-");
		for (int i = 0; i < 10; i++) {
			int temp = new Integer((int)((Math.random()*100)))+i;
			P.p("Integer at position ---> "+(i+1)+" is ---> "+temp);
			listOfIntegers.add(temp);
		}
		
		for (Iterator<Integer> iterator = listOfIntegers.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			P.p(integer);
		}
		P.p(listOfIntegers);
		listOfIntegers.removeAll(listOfIntegers.subList(0,3));
		P.p(listOfIntegers);
	}
	
}
