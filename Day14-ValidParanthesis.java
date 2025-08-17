package com.algorithms;

class Solution {
	public static boolean isValid(String s)

	{

		if (s.isEmpty()) {
			return true;
		}
		String newstr = s.replace("()", "").replace("{}", "").replace("[]", "");

		if (newstr.length() == s.length())
			return false;
		return isValid(newstr);

//		Stack<Character> st = new Stack<>();
//		for (int i = 0; i < s.length(); i++) {
//			char ch = s.charAt(i);
//			if (ch == '(' || ch == '{' || ch == '[') {
//				st.push(ch);
//			} else {
//				if (st.isEmpty())
//					return false;
//				char top = st.peek();
//				if ((top == '(' && ch == ')') || (top == '{' && ch == '}') || (top == '[' && ch == ']')) {
//					st.pop();
//				}
//
//				else {
//					return false;
//				}
//
//			}
//		}
//		return st.isEmpty();

	}

}

public class ValidParanthesis {

	public static void main(String[] args) {
		String s = "{[()]}}";
//		boolean res = Solution.isValid(s);
//		System.out.println(res);

		System.out.println(Solution.isValid(s));
	}

}
