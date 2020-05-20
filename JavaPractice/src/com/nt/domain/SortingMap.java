package com.nt.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortingMap {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("five", 5);
		map.put("six", 6);
		map.put("seven",7);
		map.put("eight", 8);
		List<Entry<String,Integer>> enteries=new ArrayList<>(map.entrySet());
//		
//		Collections.sort(enteries,new Comparator<Entry<String, Integer>>() {
//
//			@Override
//			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
//				return o1.getKey().compareTo(o2.getKey());
//			}
//		});
	//	Collections.sort(enteries,( o1,  o2) ->o1.getKey().compareTo(o2.getKey()));
			
		
//		for(Entry<String, Integer> entry:enteries) {
//			System.out.println(entry.getKey()+"       "+entry.getValue());
//		}
	//	map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
	}
}
