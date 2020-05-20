package com.nt.domain;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentMain {

	public static void main(String[] args) {
		List<Student> student = new ArrayList<Student>();
		student.add(new Student("103","parwez","ma"));
		student.add(new Student("101","jhasi","cs"));
		student.add(new Student("106","sonu","it"));
		
		Collections.sort(student, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		System.out.println(student);
	}
}
