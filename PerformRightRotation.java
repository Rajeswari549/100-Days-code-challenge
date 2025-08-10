package com.DSA;

public class PerformRightRotation {

	public static void main(String[] args) {
		int[] ar = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int k = 1; // here rotations
		k = k % ar.length;

		for (int r = 0; r < k; r++) { // starting from 0 to unitl k
			int lastele = ar[ar.length - 1]; // storing lastele
			for (int i = ar.length - 1; i > 0; i--) {
				ar[i] = ar[i - 1]; // 7 shift to last
			}
			ar[0] = lastele; // inserting lastele to first
		}

		for (int num : ar) {
			System.out.print(num + " ");
		}

	}

}
