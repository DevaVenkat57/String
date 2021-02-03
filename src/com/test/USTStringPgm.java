package com.test;

import java.util.HashMap;
import java.util.Map;

public class USTStringPgm {

	private static void duplicateWordsinString() {
		String string = "Big black bug bit a big black dog on his big black nose his";
		int count;

		// Converts the string into lowercase
		string = string.toLowerCase();

		// Split the string into words using built-in function
		String words[] = string.split(" ");

		System.out.println("Duplicate words in a given string : ");
		for (int i = 0; i < words.length; i++) {
			count = 1;
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					count++;
					// Set words[j] to 0 to avoid printing visited word
					words[j] = "0";
				}
			}

			// Displays the duplicate word if count is greater than 1
			if (count > 1 && words[i] != "0")
				System.out.println(words[i]);
		}
	}

	private static void countofDuplicatewordsinstring() {
		String a = "computer program is usually written by a computer programmer";
		String[] a1 = a.split(" ");
		Map<String, Integer> mp = new HashMap<String, Integer>();
		for (int i = 0; i < a1.length; i++) {
			String a2 = a1[i];
			if (mp.containsKey(a2)) {

				Integer integ = mp.get(a2);
				mp.put(a2, integ + 1);
			} else {
				mp.put(a2, 1);
			}

		}
		System.out.println(mp);

	}

	public static void main(String[] args) {
		duplicateWordsinString();
		countofDuplicatewordsinstring();

	}

}
