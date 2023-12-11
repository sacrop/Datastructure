import java.util.*;
 
public class SelectionSort{
	
	public static void main(String args[]){
		
		int[] arr={20,10,33,20,55,10,56,78,98,90,34,52,60};
		display(arr);
		System.out.println("");
		selectionSort(arr);
		display(arr);
		
	}
	
	public static void display(int[] arr){
		System.out.print("[");
		for(int i:arr)System.out.print(" "+i+" ");
		System.out.println("]");
	}
	private static void selectionSort(int arr[]){
		for(int i=0;i<arr.length-1;i++){
			int min=arr[i];
			int minIndex=i;
		  for(int j=i;j<arr.length;j++){
			if(arr[j]<min){
				min=arr[j];
				minIndex=j;
			}
	
		   }
		
			int temp=arr[i];
			arr[i]=arr[minIndex];
			arr[minIndex]=temp;
		}
	}
}