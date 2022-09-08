package com.yash.ArrayAssignments;

public class Array10 {
	 public static void main(String[] args)
     {
          String a[] = { "prafulla", "yash", "technologies","from","parbhani maharashtra","india"};



               String s;



          for (int i = 0; i < a.length; i++)
            {                
                 for (int j = i+1; j < a.length; j++)
                 {
                     if (a[i].length() > a[j].length())
                     {
                        s = a[i];
                         a[i] = a[j];
                         a[j] = s;
                    }
                }
                 System.out.println(a[i]);
            }
     }

}
