package edai.tema1.ejercicio2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SorterTest {
	@Test
	void testBubbleSort() {
		final int[] numbers = { 20, 16, 42, 31, 46, 124 };
		final int[] expected = { 16, 20, 31, 42, 46, 124 };
		final int[] result = Sorter.bubbleSort(numbers);
		assertArrayEquals(expected, result);
	}

}
