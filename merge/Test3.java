package com.css.ztb.df;

public class Test3 {

	public static void main(String[] args) {
		int[] array = { 7, 10, 2, 11, 14, 51, 86, 87 };
		int end = array.length - 1;
		int start = 0;
		mergeSort(array, start, end);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	static void merge(int[] array, int start, int mid, int end) {

		// System.out.println(mid);
		int[] left = new int[mid - start];
		int[] right = new int[end - mid + 1];
		for (int i = start; i < mid; i++) {
			left[i - start] = array[i];
		}
		for (int i = mid; i <= end; i++) {
			right[i - mid] = array[i];
		}

		int i = 0, j = 0, k = start;
		while (i < left.length && j < right.length) {
			if (left[i] < right[j]) {
				array[k] = left[i];
				i++;
				k++;
			} else {
				array[k] = right[j];
				j++;
				k++;
			}
		}
		while (i < left.length) {
			array[k] = left[i];
			i++;
			k++;
		}
		while (j < right.length) {
			array[k] = right[j];
			j++;
			k++;
		}

	}

	static void merge1(int[] array, int start, int end) {
		int mid = (end + start) / 2;
		int mid1 = start + (end - start) / 2;
		// System.out.println(mid);
		System.out.println("*******************************");
		for (int i = start; i <= mid; i++) {
			System.out.println(array[i]);
		}
		System.out.println("==============================");
		for (int i = mid + 1; i <= end; i++) {
			System.out.println(array[i]);
		}
	}

	static void mergeSort(int[] array, int start, int end) {
		if (start == end) {
			return;
		}
		int mid = (end + start) / 2;
		mergeSort(array, start, mid);
		mergeSort(array, mid + 1, end);
		merge(array, start,mid + 1, end);
	}
}
