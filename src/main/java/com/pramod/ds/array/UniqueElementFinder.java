package com.pramod.ds.array;

public class UniqueElementFinder {

	public static int elementAppearOnce(int[] arr) {
		if (arr.length == 0) {
			return 0;
		}

		if (arr.length == 1) {
			return arr[0];
		}
		int i = 0;
		while (i < arr.length - 1) {
			if (arr[i] != arr[i + 1]) {
				return arr[i];
			}
			i = i + 2;
		}
		return arr[i];
	}

	public static int elementAppearOnceUsingXOR(int[] arr) {

		int res = 0;
		for (int i : arr) {
			res ^= i;
		}
		return res;
	}

	public static int findElementUsingBinarySearch(int[] arr) {
		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;
			
			if(low == high) {
				return arr[low];
			}else if (mid % 2 != 0) { // If mid is odd traverse left
				if (arr[mid - 1] == arr[mid]) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			} else {
				if(arr[mid] == arr[mid + 1]) {
					low = mid + 2;
				} else {
					high = mid;
				}
			}

		}
		
		return 0;
	}

}
