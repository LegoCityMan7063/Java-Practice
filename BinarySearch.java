package examples;

public class BinarySearch {
	//assume array already sorted
	public static boolean binarySearch(int target, int[] arr) {
		int low = 0;
		int high = arr.length;
		while (high >= low) {
			int middle = (low + high) / 2;
			if (arr[middle] == target) {
				return true;
			}
			if (arr[middle] < target) {
				low = middle + 1;
			}
			if (arr[middle] > target) {
				high = middle - 1;
			}
		}
		return false;
	}
}
