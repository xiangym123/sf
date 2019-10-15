package com.css.ztb.df;

public class Test6 {
	public static void main(String[] args) {
		int[] array = { 10, 45,8, 71, 5, 2, 6, 1, 7 };
		// insertSort(array);
		// testInsert(array);
		maoPao(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);

		}
	}
	public static void  maoPao(int[] array) {
		for (int i = 0; i < array.length-1; i++) {
			for(int j=0;j<array.length-1-i;j++) {
				if(array[j]>array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					 array[j+1] = temp;
				}
			}
		}
		
	}
}
