package com.DSA;

public class BubbleSort {

	public static void main(String[] args) {

		int ar[] = { 11, 2, 3, 4, 5, 6 };

		int n = ar.length;

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n - i - 1; j++) {

				if (ar[j] > ar[j + 1]) {

					int temp = ar[j];
					ar[j] = ar[j + 1];
					ar[j + 1] = temp;

				}
			}
		}
		for (int num : ar) {
			System.out.print(num + " ");
		}

	}

}
