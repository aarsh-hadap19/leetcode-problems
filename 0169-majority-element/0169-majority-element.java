class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int a=nums[nums.length/2];
        if(nums[0]==a||nums[nums.length-1]==a){
            return a;
        }
        return a;
    }
}