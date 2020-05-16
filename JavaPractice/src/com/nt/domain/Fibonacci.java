package com.nt.domain;

import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String[] args) {
		int i,n,t1=0,t2=1,nextTerm;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number of term");
		int no=sc.nextInt();
		for(i=1;i<=no;i++) {
			System.out.println(t1);
			nextTerm=t1+t2;
			t1=t2;
			t2=nextTerm;
		}
	}

}
