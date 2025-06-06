class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findLast(nums, target);
        return new int[]{first, last};
        
    }
    private int findFirst(int[] nums, int target) {
        int high=nums.length-1,low=0;
        int first=-1;
        while(high>=low){
            int mid=(high+low)/2;
            if(nums[mid]==target){
                first=mid;
                high=mid-1;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return first;
    }
    private int findLast(int[] nums, int target) {
        int high=nums.length-1,low=0;
        int last=-1;
        while(high>=low){
            int mid=(high+low)/2;
            if(nums[mid]==target){
                last=mid;
                low=mid+1;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return last;
    }
}