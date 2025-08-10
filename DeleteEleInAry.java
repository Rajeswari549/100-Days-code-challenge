package com.DSA;

public class DeleteEleInAry {

	public static void main(String[] args) {

		int[] ar = { 1, 2, 3, 4, 5, 6, 7 };
		int pos = 1;
		int[] ar1 = new int[ar.length - 1];
		for (int i = 0; i < pos; i++) {
			ar1[i] = ar[i];
		}
		for (int i = pos + 1; i < ar.length; i++) {
			ar1[i - 1] = ar[i];
		}
		for (int i = 0; i < ar1.length; i++) {
			System.out.print(ar1[i] + " ");
		}

	}

}
