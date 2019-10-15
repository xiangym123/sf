package com.css.ztb.df;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 10, 45,8, 71, 5, 2, 6, 1, 7 };
		// insertSort(array);
		// testInsert(array);
		shellSort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);

		}
	}

	public static void shellSort(int[] array) {
		int num = (array.length-1)/2;
		while(num>0) {
			for (int i = num; i < array.length; i++) {
				for (int j = i-num; j >=0; j=j-num) {
					if (array[j] > array[j + num]) {
						sweap(array, j, j + num);
					}
				}
			}
			num=num/2;
		}
		
	}

	public static void testInsert1(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int j = i - 1;
			int temp = array[i];
			while (j >= 0 && array[j] > temp) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = temp;
		}
	}

	public static void testInsert(int[] array) {
		for (int j = 3; j > 0; j--) {
			if (array[j] < array[j - 1]) {
				sweap(array, j, j - 1);
			}
		}
	}

	public static void insertSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			for (int j = i; j > 0; j--) {
				if (array[j] < array[j - 1]) {
					sweap(array, j, j - 1);
				}
			}
		}

	}

	private static void sweap(int[] array, int a, int b) {
		int t = array[a];
		array[a] = array[b];
		array[b] = t;
	}

}
