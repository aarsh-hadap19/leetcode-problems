class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        int longest=1;
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int i:set){
            if(!set.contains(i-1)){
                int counter=1;
                int x=i;
                while(set.contains(x+1)){
                    counter++;
                    x++;
                }
                longest=Math.max(longest,counter);
            }
        }
        return longest;
    }
}