package com.nt.contract.equal.hashCode;

import java.util.HashMap;
import java.util.Map;

public class TestStudent_equal_And_hashCode {
	public static void main(String[] args) {

		Map<Student,String> map = new HashMap<Student, String>();
		
		map.put(new Student(101, "A"), "AAAA");
		map.put(new Student(102, "B"), "BBBB");
		map.put(new Student(103, "C"), "CCCC");
		map.put(new Student(101, "A"), "AAAA");
		map.put(new Student(101, "A"), "AAAA");map.put(new Student(101, "A"), "AAAA");map.put(new Student(101, "A"), "AAAA");
		
		System.out.println(map);
	}
}
