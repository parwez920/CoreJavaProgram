package com.nt.domain;

public class BinarySearch {
	
	public static int main(String[] args) {
		int[] arry={3,7,8,11,45,46,76};
		int search =45;
		int start=0;
		int end=7-1;
		int mid=0;
		while(start<=end) {
			mid=(start+end)/2;
			if(arry[mid]==search) 
				return mid;
				else if(search>arry[mid])
					start=mid+1;
				else
					end=mid-1;
			
			
		}
		System.out.println(arry);
		return end;
	}

}
