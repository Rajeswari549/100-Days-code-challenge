package com.algorithms;

import java.util.LinkedHashSet;

public class RemoveDuplicatesUSingSB {

	public static void main(String[] args) {

		String s1 = "abbsseefsa";
		StringBuilder sb = new StringBuilder();
		LinkedHashSet<Character> set = new LinkedHashSet<>();

		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			if (!set.contains(c)) { // only add if not already present
				sb.append(c);
				set.add(c);
			}
		}

		System.out.println(sb.toString());

	}

}
