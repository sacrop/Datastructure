import java.util.*;

public class QuickSortAlgo{

	public static void main(String args[]){

		 int[] arr={200,10,15,20,40,100,90,83,44,1};
		quickSort(arr,0,arr.length-1);
		display(arr);

	}
	public static void display(int[] arr){
		System.out.print("[");
		for(int i=0;i<arr.length-1;i++){
			System.out.print(" "+arr[i]+" ");
		}
		System.out.println("]");
		}
	
	public static void quickSort(int[] arr,int low,int high){
	
		if(low>=high)return;
	
		int left=low;
		int right=high-1;
		int pivot=arr[high]; 
		
		while(left<right){
			while(arr[left]<pivot&&left<right){
				left++;
			}
			while(arr[right]>pivot&&left<right){
				right--;
			}
			swap(arr,left,right);
		}
		swap(arr,high,left);
		quickSort(arr,low,left-1);
		quickSort(arr,left+1,high);	
	}

	private static void swap(int arr[],int left,int right){
		int temp=arr[left];
		arr[left]=arr[right];
		arr[right]=temp;
	}
	
}