package com.DSA;

public class PrintDuplicatesInString {

	public static void main(String[] args) {

		String s1 = "book";
		String t = "";
		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			int count = 0;
			for (int j = 0; j < s1.length(); j++) {

				if (ch == s1.charAt(j)) {
					count++;
				}

			}
			boolean isadded = false;
			for (int k = 0; k < t.length(); k++) {
				if (ch == t.charAt(k)) {
					isadded = true;
					break;
				}
			}
			if (count > 1 && !isadded) {
				t = t + ch;
			}

		}
		System.out.println("duplicates letters : " + t);
	}

}
