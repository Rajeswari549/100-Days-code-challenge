package com.DSA;

public class PerformLeftRotation {

	public static void main(String[] args) {

		int[] ar = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 1;
		k = k % ar.length;
		for (int i = 0; i < k; i++) {
			int first = ar[0];
			for (int j = 0; j < ar.length - 1; j++) {
				ar[j] = ar[j + 1];
			}
			ar[ar.length - 1] = first;
		}
		for (int num : ar) {
			System.out.print(num + " ");
		}
	}

}
