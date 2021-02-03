package com.test;

public class UST {
	public static void main(String[] args) {
		String s1 = "welcome";
		String s2 = "java";
		String s3 = "welcome";
		String s4 = "welcome";

		s2 =
				s2.concat(s3);
		System.out.println(s2);

		StringBuffer b = new StringBuffer("python");
		b.append(s1);
		System.out.println(b);

		System.out.println(s1.compareTo(s2));

		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));

		System.out.println(System.identityHashCode(s3));

		System.out.println(System.identityHashCode(s4));

	}
}
