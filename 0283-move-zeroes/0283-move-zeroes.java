class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int[]arr=new int[n];
        int count=0,a=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                count++;
            }
            else{
                arr[a]=nums[i];
                a++;
            }
        }
        for(int i=0;i<count;i++){
            arr[a]=0;
            a++;
        }

        System.arraycopy(arr, 0, nums, 0, n);

    }
}