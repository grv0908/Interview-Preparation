package com.grv.sorting;

/*
Best Case  : O(n)
Avg Case   : O(n^2)
Worst Case : O(n^2)
Stable Sort
Inplace Algorithm
*/

public class InsertionSort {
	
	public static void sort(int[] arr) {
		int n = arr.length;
		
		for(int i = 1; i<n; i++) {
			int item = arr[i];
			int j = i-1;
			while(j >= 0 && arr[j]>item) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = item;
		}
	}

}
