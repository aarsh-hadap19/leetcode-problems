class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>list1=new ArrayList<>();
        List<Integer>list2=new ArrayList<>();
        Set<Integer>set1=new HashSet<>();
        Set<Integer>set2=new HashSet<>();
        for(int n:nums1){
            set1.add(n);
        }
        for(int n:nums2){
            set2.add(n);
        }
        for(int i=0;i<nums1.length;i++){
            if(!set2.contains(nums1[i])&&!list1.contains(nums1[i])){
                list1.add(nums1[i]);
            }
        }
        ans.add(list1);
        for(int i=0;i<nums2.length;i++){
            if(!set1.contains(nums2[i])&&!list2.contains(nums2[i])){
                list2.add(nums2[i]);
            }
        }
        ans.add(list2);
        return ans;
    }
}