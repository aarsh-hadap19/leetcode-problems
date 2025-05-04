class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>curr=new ArrayList<>();
        findsubsets(0,curr,nums,ans);
        return ans;
    }
    private void findsubsets(int ind,List<Integer>curr,int[]nums,List<List<Integer>>ans){
        ans.add(new ArrayList<>(curr));
        for(int i=ind;i<nums.length;i++){
            curr.add(nums[i]);
            findsubsets(i+1,curr,nums,ans);
            curr.remove(curr.size()-1);
        }
    }
}