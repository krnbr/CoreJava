package com.core.java.util.recurssion;

public class LinearRecursion {

	public int AP(int[] array,int sum){
		if(!(array.length<1)){
			int[] arrayTemp = new int[array.length-1];
			for (int i = 0; i < arrayTemp.length; i++) {
				arrayTemp[i] = array[i];
			}
			sum = sum + array[array.length-1];
			return AP(arrayTemp,sum);
		}else{
			return sum;
		}
	}
	
	public static void main(String[] args) {
		LinearRecursion linearRecursion = new LinearRecursion();
		int sum = linearRecursion.AP(new int[]{1,2,3,4,5,6}, 0);
		System.out.println(sum);
	}
	
}