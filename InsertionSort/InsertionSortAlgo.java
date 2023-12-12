import java.util.*;

public class InsertionSortAlgo {

	public static void main(String args[]) {

		int[] arr = { 12, 3, 10, 5, 9, 11, 0 };
		insertionSort(arr);
		display(arr);
	}
	private static void insertionSort(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j>0; j--) {
				if (arr[j] > arr[j - 1]) {
					swap(arr, j, j - 1);
				} else {
					break;
				}
			}
		}
	}

	private static void swap(int[] arr, int j, int k) {
		int temp = arr[j];
		arr[j] = arr[k];
		arr[k] = temp;
	}

	private static void display(int[] arr) {

		System.out.print("[");
		for (int i = 0; i < arr.length; i++)
			System.out.print(" " + arr[i] + " ");
		System.out.println("]");
	}

}