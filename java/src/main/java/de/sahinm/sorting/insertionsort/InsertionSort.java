package de.sahinm.sorting.insertionsort;

import java.util.Arrays;
import java.util.Random;

public class InsertionSort {

	private static final int N = 1000;
	private static final int UPPER_BOUND = 1000;

	public static void main(String[] args) {
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = new Random().nextInt(UPPER_BOUND) + 1;
		}
		System.out.println("Input: N = " + N);
		System.out.println("Unsorted List: " + Arrays.toString(A));
		// Insetion Sort
		int toSort;
		int ct = 0;
		for (int i = 1; i < A.length; i++) {
			toSort = A[i];
			int j = i;
			while (j > 0 && A[j - 1] > toSort) {
				A[j] = A[j - 1];
				j--;
				ct++;
			}
			A[j] = toSort;
		}
		System.out.println("Number of comparisons = " + ct);
		System.out.println("Sorted List: " + Arrays.toString(A));
	}

}
