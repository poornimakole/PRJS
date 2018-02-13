package com.psl.q2;

public class Anagrams {
	String string1, string2;

	public Anagrams(String str1, String str2) {
		// TODO Auto-generated constructor stub
		string1 = str1;
		string2 = str2;
	}

	private void findAnagrams() {
		// TODO Auto-generated method stub
		String s1 = string1.toLowerCase();
		String s2 = string2.toLowerCase();
		if (s1.length() == s2.length()) {
			char cs1[] = s1.toCharArray();
			char cs2[] = s2.toCharArray();

			for (int i = 0; i < cs1.length; i++) {
				for (int j = i + 1; j < cs1.length; j++) {
					if (cs1[i] > cs1[j]) {
						char temp = cs1[i];
						cs1[i] = cs1[j];
						cs1[j] = temp;
					}
					if (cs2[i] > cs2[j]) {
						char temp = cs2[i];
						cs2[i] = cs2[j];
						cs2[j] = temp;
					}
				}

			}
			boolean flag = true;
			for (int i = 0; i < cs1.length; i++) {
				if (cs1[i] != cs2[i]) {
					flag = false;
					break;
				}
			}
			if (flag)
				System.out.println("Strings are Anagrams");
			else
				System.out.println("Strings are not Anagrams");

		} else {
			System.out.println("Strings are not Anagrams");
		}

	}

	public static void main(String[] args) {
		Anagrams a = new Anagrams("anagram", "margana");
		a.findAnagrams();
	}

}
