package com.nt.contract.equal.hashCode;

public class HashMapEquqls {
	
	public static void main(String[] args) {
		String s1= "FB";
		String s2= "Ea";
		
		String s3 = "FB";
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
	}
}
