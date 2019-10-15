package com.sorting.algorithm;

public class BubbleSort {
	public static void main(String[] args) {
		int arr[] = { 12, 29, 27, 4, 8, 11, 32, 1 };
		bubbleSortAlgorithm(arr);
		for (int value : arr) {
			System.out.print(value + " ");
		}
	}

	private static void bubbleSortAlgorithm(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
}
