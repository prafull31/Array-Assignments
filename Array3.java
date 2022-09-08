package com.yash.ArrayAssignments;

public class Array3 {
	public static void main(String[] args) {

		int a[] = { 1, 2, 4, 7, 6, 9, 13, 14, 16 };

		for (int i = (a.length/2); i >= 0; i--) {

			for (int j = (a.length/2); j >= 0; j--) {

				if (a[i] < a[j]) {

					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}

			}

		}

		for (int i = (a.length/2) + 1; i < a.length - 1; i++) {

			for (int j = (a.length/2) + 2; j < a.length; j++) {

				if (a[i] > a[j]) {

					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}

			}

		}

		for (int k = 0; k < a.length; k++) {
			System.out.print(a[k] + " ");

		}

	}

}
