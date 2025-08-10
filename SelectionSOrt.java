package com.DSA;

public class SelectionSOrt {

	public static void main(String[] args) {

		int[] ar = { 5, 3, 4, 2, 1 };
		int n = ar.length;

		for (int i = 0; i < n - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < n; j++) {
				if (ar[j] < ar[minIndex]) {
					minIndex = j;
				}
			}
			// Swapping
			int temp = ar[minIndex];
			ar[minIndex] = ar[i];
			ar[i] = temp;
		}

		for (int num : ar) {
			System.out.print(num + " ");
		}
	}

}
