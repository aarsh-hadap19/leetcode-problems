class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        int count=0,prefixsum=0;
        for(int num:nums){
            prefixsum+=num;
            int remove=prefixsum-k;
            count+=map.getOrDefault(remove,0);
            map.put(prefixsum,map.getOrDefault(prefixsum,0)+1);
        }
        return count;
    }
}