package com.nt.domain;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Student {

		private String id;
		private String name;
		private String dept;
		
		
		public Student() {
			super();
		}
		public Student(String id, String name, String dept) {
			super();
			this.id = id;
			this.name = name;
			this.dept = dept;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDept() {
			return dept;
		}
		public void setDept(String dept) {
			this.dept = dept;
		}
		
		
		
//
//		List<Integer> list = new ArrayList<Integer>();
//		list.add(444);
//		list.add(656);
//		list.add(1);
//		list.add(3);
//
//		List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
//		sortedList.forEach(System.out::println);

}
