package com.yash.ArrayAssignments;

public class Array11 {
	static String str[]= {"saas","yash","eye"};
	
	public static void main(String[] args) {
		Array11 t= new Array11();
		
		for(String s:str)
		{
			t.checkPalindrom(s);
			
		}
	}
	public void checkPalindrom(String s)
	{
		char chArr[]=s.toCharArray();
		
		int n =chArr.length;
		int count=0;
		for(int i=0,j=chArr.length-1;i<chArr.length;i++,j--)
		{
			
			
			if(chArr[i]==chArr[j])
			{
				count++;
			}
			
		}
		if(count==n)
		{
			System.out.println("palindrom: "+s);
		}
	}

}
