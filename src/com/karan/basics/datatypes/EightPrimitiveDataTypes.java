package com.karan.basics.datatypes;

import java.lang.String;

public class EightPrimitiveDataTypes {

	// Integers
	static long l;
	static int i;
	static short s;
	static byte bt;
	
	// Floating Point Types
	static float f;
	static double d;
	
	// Character
	static char c;
	
	// boolean
	static boolean bl;
	
	
	public static void main(String[] args) {
		
		// default values of primitive types
		
		System.out.println(l+"\n"+i+"\n"+s+"\n"+bt+"\n"+f+"\n"+d+"\n"+c+"\n"+bl);
		
		l = -1546465465489787955L; // 64 bit type
		
		i = 2147483647; // -2147483648 to 2147483647
		
		s = 32767; // - 32768 to 32767
		
		bt = 127; // -128 to 127
		
		f = 13131313.321f; // 32 bit
		
		d = 135456971231564.213; // 64 bit
		
		c = 74; // 16 bit range of charcters is 0 to 65536 74 will print J we can also declare it like c = 'J';
		
		bl = true; // true or false
		
		System.out.println("\n"+l+"\n"+i+"\n"+s+"\n"+bt+"\n"+f+"\n"+d+"\n"+c+"\n"+bl);
		
	}
	
}
