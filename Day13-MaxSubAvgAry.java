package com.algorithms;

public class MaxSubAvgAry {

	public static void main(String[] args) {
		int[] ar = { 1, 12, -5, -6, 50, 3 };
		int k = 4;
		double max = Double.NEGATIVE_INFINITY;
		for (int i = 0; i <= ar.length - k; i++) {
			int sum = 0;
			for (int j = i; j < k + i; j++) {
				sum = sum + ar[j];

			}
			if ((double) sum / k > max) {
				max = (double) sum / k;
			}
		}
		System.out.println(max);
	}

}
