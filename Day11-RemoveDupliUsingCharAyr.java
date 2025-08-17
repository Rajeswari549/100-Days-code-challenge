package com.algorithms;

public class RemoveDupliUsingCharAyr {

	public static void main(String[] args) {

		String s1 = "abbsbb";
		char[] ch = s1.toCharArray();
		int index = 0;
		for (int i = 0; i < ch.length; i++)

		{
			boolean found = false;
			for (int j = 0; j < index; j++) {
				if (ch[i] == ch[j]) {
					found = true;
					break;
				}
			}
			if (!found)

			{
				ch[index++] = ch[i];

			}
		}
		for (int i = 0; i < index; i++) {
			System.out.println(ch[i]);
		}
	}

}
