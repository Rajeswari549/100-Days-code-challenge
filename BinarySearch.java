package com.DSA;

public class BinarySearch {
	public static int BS(int ar[], int key) {

		int low = 0;
		int high = ar.length - 1;

		int index = -1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (ar[mid] == key) {
				return mid;
			} else if (ar[mid] < key) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return index;

	}

	public static int LS(int ar1[], int ele) {

		boolean isfound = false;
		int pos = 0;
		for (int i = 0; i < ar1.length - 1; i++) {
			if (ar1[i] == ele) {
				pos = i;
				System.out.println("element is found at position  " + pos);
				isfound = true;
				break;
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		int[] ar = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int[] ar1 = { 2, 3, 4, 5, 6, 2, 6, 7 };

		System.out.println("linear search:-");
		int ele = 5;
		int res1 = LS(ar1, ele);
		if (res1 != -1) {
			System.out.println("element is found " + res1);
		} else {
			System.out.println("not there");
		}

		System.out.println("binary search:-");
		int key = 8;
		int res = BS(ar, key);
		if (res != -1) {
			System.out.println("element found  " + res);
		}

	}

}
