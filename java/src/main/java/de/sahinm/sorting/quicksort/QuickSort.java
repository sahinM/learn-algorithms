package de.sahinm.sorting.quicksort;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {

	private static final int N = 10;
	private static final int UPPER_BOUND = 100;

	public static void main(String[] args) {
		int[] unsortedNums = new int[N];
		for (int i = 0; i < N; i++) {
			unsortedNums[i] = new Random().nextInt(UPPER_BOUND) + 1;
		}
		System.out.println("Unsorted List: " + Arrays.toString(unsortedNums));
		quickSort(unsortedNums);
	}

	private static void quickSort(int[] unsortedNums) {
		int pivot = unsortedNums[N - 1];
		if (unsortedNums.length > 1) {
			for (int i = 0; i < N - 2; i++) {
				if (unsortedNums[i] <= pivot) {

				}
			}
		}

	}

}
