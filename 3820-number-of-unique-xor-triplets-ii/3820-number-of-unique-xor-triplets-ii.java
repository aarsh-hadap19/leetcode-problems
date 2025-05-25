class Solution {
    public int uniqueXorTriplets(int[] nums) {
        Set<Integer>uni=new HashSet<>();
        Set<Integer>xors=new HashSet<>();
        for(int i:nums){
            uni.add(i);
        }
        Integer[] arr = uni.toArray(new Integer[0]);
        int m = arr.length;
        Set<Integer>mid=new HashSet<>();
        for(int i=0;i<m;i++){
            for(int j=i;j<m;j++){
                mid.add(arr[i]^arr[j]);
            }
        }
        for(int l:mid){
            for(int k=0;k<m;k++){
                xors.add(l^arr[k]);
            }
        }
        return xors.size();
    }
}