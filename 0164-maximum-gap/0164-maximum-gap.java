class Solution {
    public int maximumGap(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int dif=0;
        for(int i=n-1;i>0;i--){
            if(nums[i]-nums[i-1]>dif){
                dif=nums[i]-nums[i-1];
            }
        }
        return dif;
    }
}