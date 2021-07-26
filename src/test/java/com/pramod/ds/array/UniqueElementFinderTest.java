package com.pramod.ds.array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UniqueElementFinderTest {
	

	@Test
	void testUniquElementWhenLengthIsEven() {
		int[] arr = new int[] {1, 1, 2, 2, 3, 3, 4, 5, 5};
		int elementAppearOnce = UniqueElementFinder.elementAppearOnce(arr);
		assertEquals(4, elementAppearOnce);
		
		int elementAppearOnceUsingXOR = UniqueElementFinder.elementAppearOnceUsingXOR(arr);
		assertEquals(4, elementAppearOnceUsingXOR);
		
		int uniqueElementUsingBinarySearch = UniqueElementFinder.findElementUsingBinarySearch(arr);
		assertEquals(4, uniqueElementUsingBinarySearch);
	}
	
	@Test
	void testUniquElementWhenLengthIsOdd() {
		int[] arr = new int[] {1, 2, 2, 3, 3, 4, 4, 5, 5};
		int expected = 1;
		int elementAppearOnce = UniqueElementFinder.elementAppearOnce(arr);
		assertEquals(expected, elementAppearOnce);
		
		
		int elementAppearOnceUsingXOR = UniqueElementFinder.elementAppearOnceUsingXOR(arr);
		assertEquals(expected, elementAppearOnceUsingXOR);
		
		int uniqueElementUsingBinarySearch = UniqueElementFinder.findElementUsingBinarySearch(arr);
		assertEquals(expected, uniqueElementUsingBinarySearch);
	}

}
