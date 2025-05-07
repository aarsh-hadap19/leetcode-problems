class Solution {
    public void rotate(int[] nums, int k) {
        k%=nums.length;
        rotatearray(nums,0,nums.length-1);
        rotatearray(nums,0,k-1);
        rotatearray(nums,k,nums.length-1);
        return;
    }
    public void rotatearray(int nums[],int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
        return;
    }
}