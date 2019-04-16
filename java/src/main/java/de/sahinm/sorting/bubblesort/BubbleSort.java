package de.sahinm.sorting.bubblesort;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {

	private static final int N = 1000;
	private static final int UPPER_BOUND = 100;

	public static void main(String[] args) {
		int[] unsortedNums = new int[N];
		for (int i = 0; i < N; i++) {
			unsortedNums[i] = new Random().nextInt(UPPER_BOUND) + 1;
		}
		System.out.println("Input: N = " + N);
		System.out.println("Unsorted List: " + Arrays.toString(unsortedNums));
		int ct = 0;
		int n = N;
		do {
			int newN = 1;
			// Bubble Phase
			for (int i = 0; i < n - 1; ++i) {
				ct++;
				if (unsortedNums[i] > unsortedNums[i + 1]) {
					unsortedNums = swap(unsortedNums, i, i + 1);
					newN = i + 1;
				}
			}
			n = newN;
		} while (n > 1);

		System.out.println("Number of comparisons = " + ct);
		System.out.println("Sorted: " + Arrays.toString(unsortedNums));

	}

	private static int[] swap(int[] unsortedNums, int i, int j) {
		int lower = unsortedNums[j];
		int bigger = unsortedNums[i];
		unsortedNums[i] = lower;
		unsortedNums[j] = bigger;
		return unsortedNums;
	}

}
