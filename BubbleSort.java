package com.crucerne.www.bubblesort;

import java.util.List;

public class BubbleSort {

	/*
	 * The method takes a list collection of integers as argument and sorts them
	 * via bubble sort. The sorting algorithm involves having a boolean flag to
	 * check whether the list still requires sorting or not. If sorting is still
	 * required, it will iterate through the list for adjacent elements and
	 * comparing them to each other. If the sequential element's value is less
	 * than the current value, the two elements will swap with each other and
	 * trigger the sorting flag that another iteration through the list is
	 * required. If no swapping has occurred, the list no longer needs to go
	 * through sorting and will set the sorting flag to false.
	 */
	public static void bubbleSort(List<Integer> numbers) {
		// sorting check flag
		boolean needSorting;
		do {
			needSorting = false;
			for (int i = 0; i < numbers.size() - 1; i++) {
				// swap the two numbers if the next number is smaller than the
				// current number in the integer collection
				if (numbers.get(i) > numbers.get(i + 1)) {
					// swapping required
					int temp = numbers.get(i);
					numbers.set(i, numbers.get(i + 1));
					numbers.set(i + 1, temp);
					// still requires sortingm, set sorting check flag to true
					needSorting = true;
				}
			}
		} while (needSorting);
	}
}