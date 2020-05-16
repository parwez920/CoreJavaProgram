package com.nt.domain;

import java.util.HashMap;
import java.util.Map;

public class StringCount {

	static void getString(String str) {
		Map<Character, Integer> map = new HashMap<>();
		for (char ch : str.toCharArray()) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}else
				map.put(ch, 1);
		}
		System.out.println(map);
	}

	public static void main(String[] args) {
		getString("this is my first application");

	}

}
