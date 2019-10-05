package examples;

public class InsertionSort {
	public static void insertion(int[] arr) {
		for (int i = 1;i < arr.length;i++) {
			int  temp = arr[i];
			int index = i;
			while (index > 0 && temp < arr[index - 1]) {
				arr[index] = arr[index - 1];
				index--;
			}
			arr[index] = temp;
		}
	}
}
