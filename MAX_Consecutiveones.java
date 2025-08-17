package com.algorithms;

public class MAX_Consecutiveones {

	public static void main(String[] args) {

		int[] ar = { 1, 1, 0, 0, 1, 1, 1 };

		int left = 0;
//		int right = 0;    here it is not increasing that's why used in for loop
		int max = 0;
		for (int right = 0; right < ar.length; right++) {
			if (ar[right] == 0) {
				left = right + 1;
			}
			max = Math.max(max, right - left + 1);
		}
		System.out.println(max);
//		int count = 0;
//		int max = 0;
//
//		for (int i = 0; i < ar.length; i++) {
//			if (ar[i] == 1) {
//				count++;
//				if (count > max) {
//					max = count;
//				} else {
//					count = 0;
//				}
//			}
//		}
//		System.out.println(max);
	}

}
