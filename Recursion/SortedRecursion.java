public class SortedRecursion {
    public static void main(String[] args) {
        int arr[]={0,1,2,3,4,5,6,7};
        // System.out.println(sorted(arr,0));
        System.out.println(binarySearch(arr, 9, 0, arr.length-1));
    }
    static boolean sorted(int[] arr,int index){
        if(index==arr.length-1)return true;
        return arr[index]<arr[index+1]&&sorted(arr, index+1);
    }
    static int binarySearch(int[] arr,int target,int low,int high){    
        int mid=low+(high-low)/2;
        if(mid==target){
            return mid;
        }
        if(mid>arr.length-1)return -1;
        if(arr[mid]>target){
           return binarySearch(arr, target, low, mid-1);
        }
        else{
            return binarySearch(arr, target, mid+1, high);
        } 
    }
}
