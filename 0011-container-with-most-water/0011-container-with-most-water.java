class Solution {
    public int maxArea(int[] heights) {
        // Two pointers l and r 
        // calculate the water held between with r-l * Math.min(l,r);
        // move the smaller one up
        int l = 0;
        int r = heights.length-1;
        int ans = 0;

        while(l < r){
            int l_val = heights[l];
            int r_val = heights[r];
            ans = Math.max(ans, (r-l) * Math.min(l_val,r_val));
            if(l_val < r_val) l++;
            else r--;

        }
        return ans;
    }
}