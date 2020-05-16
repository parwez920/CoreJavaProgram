package com.nt.domain;

import java.util.Scanner;

public class PrimeNumberBw {
	
	static boolean checkPrime(int number) {
		boolean istPrime=true;
		if(number<=1) {
			istPrime=false;
			return istPrime;
		}else {
			for(int i=2;i<=number%2;i++) {
				if(number%1==0) {
					istPrime=false;
					break;
				}
			}
			return istPrime;
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a start prime number");
		System.out.println("Enter a end prime number");
		int start=sc.nextInt();
		int end=sc.nextInt();
		System.out.println("prime number b/w "+start +" and "+end+ ":");
		for(int i=start;i<end;i++) {
			if(checkPrime(i)) {
				System.out.println(i);
			}
		}
		sc.close();
	}

}
