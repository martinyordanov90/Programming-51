package com.hackbulgaria.programming51.week7;

import java.util.Stack;

public class Brackets {
	public static boolean isCorrect(String brackets) {
		Stack<Character> s = new Stack<>();
		for (int i = 0; i < brackets.length(); i++) {
			Character br = brackets.charAt(i);
			if (br.equals("(") || br.equals("[") || br.equals("{")) {
				s.push(br);
			}

			if ((br.equals("(") && s.peek().equals(")"))
					|| (br.equals("[") && s.peek().equals("]"))
					|| (br.equals("{") && s.peek().equals("}"))) {
				s.pop();
			} else {
				return false;
			}

		}
		return s.isEmpty();

	}

}
