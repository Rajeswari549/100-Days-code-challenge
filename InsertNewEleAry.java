package com.DSA;

public class InsertNewEleAry {

	public static void main(String[] args) {

		int[] ar = { 1, 2, 3, 4, 5 };
		int pos = 2;
		int[] ar1 = new int[ar.length + 1];
		for (int i = 0; i < pos; i++) {
			ar1[i] = ar[i];

		}

		ar1[pos] = 56;
		for (int i = pos; i < ar.length; i++) {
			ar1[i + 1] = ar[i];

		}
		System.out.println("updated arary:");
		for (int i = 0; i < ar1.length; i++) {
			System.out.print(ar1[i] + " ");
		}

	}

}
