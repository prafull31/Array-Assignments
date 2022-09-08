package com.yash.ArrayAssignments;

public class Array12 {
	public static void main(String[] args) {
		int a[]= {10,2,3,41,12,13,19,81,9};
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[j]%10==i)
					System.out.print(a[j]+" ");
			}
			
		}
		
	}

}
