package de.sahinm.sorting.quicksort;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {

	private static final int N = 5;
	private static final int UPPER_BOUND = 100;
	static int[] A = new int[N];

	public static void main(String[] args) {
		for (int i = 0; i < N; i++) {
			A[i] = new Random().nextInt(UPPER_BOUND) + 1;
		}
		System.out.println("Unsorted List: " + Arrays.toString(A));
		quickSort(A);
		System.out.println("Sorted List: " + Arrays.toString(A));
	}

	private static void quickSort(int[] arr) {
		quickSort(0, arr.length - 1, arr);
	}

	private static void quickSort(int left, int right, int[] arr) {
		if (left >= right) {
			return;
		}
		int i = left;
		int j = right - 1;
		int pivot = arr[right];
		// partitioning loop 
		do {
			while (arr[i] < pivot && i < right) {
				i++;
			}
			while (arr[j] >= pivot && j > left) {
				j--;
			}
			if (i < j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		} while (i < j);
		// swap pivot element with new position if its greater
		if (arr[i] > pivot) {
			int temp = arr[i];
			arr[i] = pivot;
			arr[right] = temp;
		}
		quickSort(left, i - 1, arr);
		quickSort(i + 1, right, arr);
	}

}
