package com.DSA;

public class QucikSort {

	public static int partition(int[] ar, int lb, int ub) {
		int pivot = ar[lb]; // choosing first element as pivot
		int start = lb;
		int end = ub;

		while (start < end) {
			while (ar[start] <= pivot && start < ub) {
				start++;
			}
			while (ar[end] > pivot && end > lb) {
				end--;
			}
			if (start < end) {
				int temp = ar[start];
				ar[start] = ar[end];
				ar[end] = temp;
			}
		}

		// Swaping pivot with ar[end]
		int temp = ar[lb];
		ar[lb] = ar[end];
		ar[end] = temp;

		return end;
	}

	public static void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			int pi = partition(arr, low, high);
			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 38, 27, 43, 3, 9, 82, 10 };
		System.out.println("Original Array:");
		for (int num : arr) {
			System.out.print(num + " ");
		}

		quickSort(arr, 0, arr.length - 1);

		System.out.println();
		System.out.println("Sorted Array:");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}
