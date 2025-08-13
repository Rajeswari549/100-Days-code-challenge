package com.DSA;

public class InsertionSort {

	public static void main(String[] args) {
		int[] ar = { 5, 3, 4, 2, 1 };
		int n = ar.length;
		for (int i = 1; i < n; i++) {
			int key = ar[i];
			int j = i - 1;
			while (j >= 0 && ar[j] > key) {
				ar[j + 1] = ar[j]; // here ele shift to right
				j--; // decrase index
			}
			ar[j + 1] = key; // then j=-1 now j=1 so in j+1 place key
		}
		for (int num : ar) {
			System.out.print(num + " ");
		}
	}

}

