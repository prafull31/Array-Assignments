package com.yash.ArrayAssignments;

public class Array6 {
	
	public static void main(String[] args) {
		int [] arr = {1,3,4,6,9,11,15,16,50};
		int temp=0;
		int flag=0;
		for (int i=arr.length/2;i>=1;i--) {
			for(int j=i-1;j>=0;j--) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
				
			}
		}System.out.println("Ascending");
		
		
		for (int i=arr.length/2+1;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					flag=arr[i];
					arr[i]=arr[j];
					arr[j]=flag;
	}

}
}
		for(int k=0;k<arr.length;k++) {
			System.out.println(arr[k]);
			
		}System.out.println("Descending");
	}
}