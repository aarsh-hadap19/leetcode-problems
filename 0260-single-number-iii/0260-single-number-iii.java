class Solution {
    public int[] singleNumber(int[] nums) {
        int[] ans = new int[2];
        int xor =0;
        for(int i:nums){
            xor^=i;
        }
        int right = xor & -xor;
        for(int n:nums){
            if((n & right)!=0){
                ans[0]^=n;
            }
            else{
                ans[1]^=n;
            }
        }
        return ans;
    }
}