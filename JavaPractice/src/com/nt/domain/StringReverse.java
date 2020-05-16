package com.nt.domain;

public class StringReverse {
	
	static String reverse="";
	static void getStringRev(String str) {
		//int i=str.length();
		for(int i=str.length()-1;i>=0;i--) {
			reverse=reverse+str.charAt(i);
		}
		System.out.println(reverse);
		if(str.equals(reverse)) {
			System.out.println("String are palindorm");
		}
		else {
			System.out.println("string are not palindorm");
		}
	}
	public static void main(String[] args) {
		getStringRev("madam");
	}

}
