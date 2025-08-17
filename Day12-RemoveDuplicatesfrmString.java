package com.algorithms;

public class RemoveDuplicatesfrmString {

	public static void main(String[] args) {

		String s = "abbcbbba";
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			boolean found = false;
			for (int j = 0; j < res.length(); j++) {
				if (ch == res.charAt(j)) {
					found = true;
					break;
				}
			}
			if (!found) {
				res = res + ch;
			}
		}
		System.out.println(res);

	}

}
