package com.nt.domain;

public class InsertionSorting {
	
	public static void main(String[] args) {
		int[] arr= {4,5,10,1,6,2};
		int temp=0;
		int j;
		for(int i=1;i<6;i++) {
			temp=arr[i];
			j=i-1;
			while(j>=0 && arr[j]>temp) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
		for(int i=0;i<6;i++) {
			System.out.println(arr[i] );
		}
	}

}
