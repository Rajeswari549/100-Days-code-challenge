package com.DSA;

public class MergeSort {
	public static void MergeS(int[] ar, int lb, int ub) {

		if (lb < ub) {
			int mid = (lb + ub) / 2;
			MergeS(ar, lb, mid);
			MergeS(ar, mid + 1, ub);
			Merge(ar, lb, mid, ub);
		}

	}

	public static void Merge(int[] ar, int lb, int mid, int ub) {

		int n1 = mid - lb + 1;
		int n2 = ub - mid;

		int[] l = new int[n1];
		int[] r = new int[n2];

		for (int i = 0; i < n1; i++) {
			l[i] = ar[lb + i];
		}
		for (int j = 0; j < n2; j++) {
			r[j] = ar[mid + 1 + j];
		}

		int i = 0, j = 0, k = lb;
		while (i < n1 && j < n2) {
			if (l[i] < r[j]) {
				ar[k] = l[i];
				i++;
			} else {
				ar[k] = r[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			ar[k] = l[i];
			i++;
			k++;
		}
		while (j < n2) {
			ar[k] = r[j];
			j++;
			k++;
		}

	}

	public static void main(String[] args) {
		int[] ar = { 2, 3, 4, 1, 1, 23, 43, 5 };
		System.out.println("original aray");
		for (int num : ar) {
			System.out.print(num + " ");
		}
		MergeS(ar, 0, ar.length - 1);
		System.out.println();
		System.out.println("sorted aray");
		for (int num : ar) {
			System.out.print(num + " ");
		}

	}

}
