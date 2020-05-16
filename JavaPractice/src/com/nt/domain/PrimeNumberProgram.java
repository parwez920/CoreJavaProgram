package com.nt.domain;

public class PrimeNumberProgram {
	
	static boolean checkPrime(int inpulNumber) {
		boolean istPrime=true;
		if(inpulNumber<=1) {
			istPrime=false;
			return istPrime;
		}else {
			for(int i=2;i<=inpulNumber/2;i++) {
				if(inpulNumber%i==0) {
					istPrime=false;
					break;
				}
			}
			return istPrime;
		}
	}
	public static void main(String[] args) {
		boolean istPrime=checkPrime(3);
		if(istPrime) {
			System.out.println("Is a prime Number");
		}else {
			System.out.println("Is not prime number");
		}
	}

}
