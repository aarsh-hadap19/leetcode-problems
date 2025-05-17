class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int no1=0;
        int prevno1=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                no1++;
            }
            else{
                prevno1=Math.max(prevno1,no1);
                no1=0;
            }
        }
        prevno1=Math.max(prevno1,no1);
        return prevno1;
    }
}