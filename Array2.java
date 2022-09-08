package com.yash.ArrayAssignments;

public class Array2 {
	public static void main(String[] args) {
		int a[] = { 1, 4, 1, 2, 4, 2, 4 };

		int sum = 0;
		System.out.print("Duplicate Number ");
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] == a[j]) {
					count++;
					sum = sum + count;
					System.out.print(a[i] + " ");
				}

			}

		}
		System.out.println();

		System.out.println("Total Count: " + sum);
	}

}
