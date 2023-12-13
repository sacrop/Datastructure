import java.util.*;

public class MergeSortAlgo {

	public static void main(String args[]) {
		int[] arr = { 29, 33, 2, 29, 45, 33, 56, 66, 11, 332, 4, 46, 77 };
		int[] nest = mergeSort(arr);
		System.out.println(Arrays.toString(nest));
	}

private static int[] mergeSort(int[] arr){
	if(arr.length==1){//i have a confusion on array
		return arr;
	}
	int mid=arr.length/2;
	int[] left=mergeSort(Arrays.copyOfRange(arr, 0, mid));
	int[] right=mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
	return merge(left,right);
}

private static int[] merge(int[] left, int[] right) {
	int[] mix=new int[left.length+right.length];
	int i=0,j=0,k=0;
	while (i<left.length&&j<right.length) {
		if(left[i]>right[j]){
			mix[k]=right[j];
			j++;
		}
		if(left[i]<right[j]){
			mix[k]=left[i];
			i++;
		}
		k++;
		while(i<left.length){
			mix[k]=left[i];
			i++;
			k++;
		}
		while (j<right.length) {
			mix[k]=right[j];
			j++;
			k++;
		}
	}
	return mix;
}


}