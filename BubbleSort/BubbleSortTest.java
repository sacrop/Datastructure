import java.util.*;
public class BubbleSortTest{

private static void bubbleSort(int[] arr){

	for(int i=0;i<arr.length-1;i++){
		for(int j=0;j<arr.length-1-i;j++){
			if(arr[j]<arr[j+1]){
				int temp=arr[j+1];
				arr[j+1]=arr[j];
				arr[j]=temp;
			}
		}
	}
	displayArray(arr);
}

	public static void main(String args[]){
		int[] arr={29,30,12,10,80,1};
		displayArray(arr);
		bubbleSort(arr);
		
		
	}
private static void displayArray(int[] arr){
		System.out.print("[");
		for(int a:arr){
			System.out.print(" "+a+" ");
                }
		System.out.println("]");

	}

}