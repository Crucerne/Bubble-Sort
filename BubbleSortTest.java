package com.crucerne.www.bubblesort;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class BubbleSortTest {

	@Test
	public void bubbleSortTest()
	{
		final List<Integer> numbers = Arrays.asList(10, 8, 12, 6, 4, 16);
		final List<Integer> expected = Arrays.asList(4, 6, 8, 10, 12, 16);
		BubbleSort.bubbleSort(numbers);
		for (int number : numbers)
		{
			System.out.println(number);
		}
		assertEquals(expected, numbers);
	}

}
