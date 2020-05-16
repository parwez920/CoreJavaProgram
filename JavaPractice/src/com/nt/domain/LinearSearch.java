package com.nt.domain;

public class LinearSearch {
	
	public static void main(String[] args) {
		int[] arry={91,5,7,3,67,8,4};
		int flag=0;
		int data=8;
		for(int i=0;i<arry.length;i++) {
			
			if(arry[i]==data) {
				System.out.println("element potion "+i);
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("element not found");
		}
	}

}
