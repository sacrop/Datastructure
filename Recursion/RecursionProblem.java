

import java.util.Scanner;

public class RecursionProblem {
 public static void main(String[] args) {
  int[] arr=new int[]{2,1,10,30,25};
  int target=30;
findIndex(arr,target);
 }  
 public static void findIndex(int[] arr,int target){
   int start=0;
   int end=arr.length-1;
   while (start<=end) {
      int mid=(start+end)/2;
      if(arr[mid]==target){
         System.out.println(mid);
         return;
      }
      if(arr[mid]<target){
         start=mid+1;
      }
      if(arr[mid]>target){
         end=mid-1;
      }

   }
 }

}
