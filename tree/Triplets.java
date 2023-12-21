public class Triplets {
    public static void main(String[] args) {
        Triplets trps=new Triplets();
        int[] arr=new int[]{1,3,1,2,4};
        System.out.println(trps.findtrps(arr));

    }
    private int findtrps(int[] nums){
        if(nums.length<3)return 0;
        int count=0;
        int i=0,j=0,k=0;
        while(i<nums.length-2&&j<nums.length-1&&k<nums.length){
            j=i+1;
            while(j<nums.length-1&&nums[j]==nums[i]){
                j++;
            }
            k=j+1;
            while(k<nums.length && (nums[k]==nums[i]||nums[k]==nums[j])){
                k++;
            }
            if(i<nums.length-2&&j<nums.length-1&&k<nums.length &&nums[i]!=nums[k]&&nums[i]!=nums[j]){
                count++;
            }
            i++;
        }
        return count;
    }
}
