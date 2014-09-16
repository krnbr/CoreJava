package com.core.java.util.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;

public class List02ArrayList {

	public static void main(String[] args) {
		ArrayList<? super Object> arrayList = new ArrayList<Object>();
		arrayList.add(new String("12300"));
		arrayList.add(new Integer(123002));
		arrayList.add(new String("123001"));
		arrayList.add(new Integer(1230022));
		arrayList.add(new String("12378112"));
		arrayList.add(new Integer(12332));
		arrayList.add(new String("123983"));
		arrayList.add(new Integer(13402));
		arrayList.add(new String("123568"));
		arrayList.add(new Integer(1252));
		System.out.println(arrayList);
		arrayList.set(0, 100);
		arrayList.remove(0);
		System.out.println(arrayList);
		System.out.println("---------------------------------------------------");
		LinkedList<? super Object> linkedList = new LinkedList<Object>();
		linkedList.add(new String("12300"));
		linkedList.add(new Integer(123002));
		linkedList.add(new String("123001"));
		linkedList.add(new Integer(1230022));
		linkedList.add(new String("12378112"));
		linkedList.add(new Integer(12332));
		linkedList.add(new String("123983"));
		linkedList.add(new Integer(13402));
		linkedList.add(new String("123568"));
		linkedList.add(new Integer(1252));
		System.out.println(linkedList);
		linkedList.set(0, 100);
		System.out.println(linkedList);
	}
	
}
