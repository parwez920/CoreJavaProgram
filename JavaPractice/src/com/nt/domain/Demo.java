package com.nt.domain;

import java.util.HashMap;
import java.util.Map;

public class Demo {

	public static void main(String[] args) {
		String s1="parwez";
		String s2="parwez";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		Map<Integer, String> map= new HashMap<Integer, String>();
		map.put(1, "sonu");
		map.put(2, "fassi");
		map.put(3, "zeya");
		map.put(1, "sonu1");
		System.out.println(map);
	}
}
