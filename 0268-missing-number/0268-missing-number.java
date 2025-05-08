class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int a = 0, b = 0;

        for (int i = 0; i < n; i++) {
            a ^= nums[i];
        }

        for (int i = 0; i <= n; i++) {
            b ^= i;
        }

        return a ^ b;
    }
}
