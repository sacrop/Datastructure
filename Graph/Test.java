public class Test {
    public static void main(String[] args) {
        int[][] arr=new int[][]{{1,0,0,1,0},{1,0,0,1,0},{0,0,1,1,0},{1,0,0,0,0},{1,0,0,1,1}};
        // System.out.println(findsum(arr,0));
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i][j]==1){
                        count++;
                }
            }
        }
        System.out.println(count);
    }
    // public static int  findsum(int[] arr,int min){
    //     if(min>=arr.length){
    //         return 0;
    //     }
    //     int sum=arr[min];
    //     return sum+findsum(arr,min+1);
    // }
}

// [
// [1,0,0,1,0],
// [1,0,0,1,0],
// [0,0,1,1,0],
// [1,0,0,0,0],
// [1,0,0,1,1]
// ]
