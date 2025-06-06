class Solution {
    public int findKthPositive(int[] arr, int k) {
        int low=0,high=arr.length-1;
        while(high>=low){
            int mid=(high+low)/2;
            if (arr[mid] - mid - 1 < k) {
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return k+high+1;
    }
}