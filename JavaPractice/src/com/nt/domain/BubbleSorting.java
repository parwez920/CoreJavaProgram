package com.nt.domain;

public class BubbleSorting {
	public static void main(String[] args) {
		
		int temp=0;
		int[] array= {45,3,6,8,1,9};
		int n=6;
		for(int i=0;i<n-1;i++) {
			int flag=0;
			for(int j=0;j<n-1-i;j++) {
				if(array[j]>array[j+1]) {
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
					flag=1;
				}
			}
			if(flag==0) {
				break;
			}
		}
		for(int i=0;i<n;i++) {
	
		System.out.println(array[i]);
		}
	}

}
