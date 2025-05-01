class Solution {
    public String longestCommonPrefix(String[] arr) {
        Arrays.sort(arr);
        StringBuilder ans=new StringBuilder();
        String first=arr[0];
        String last=arr[arr.length-1];
        for(int i=0;i<Math.min(first.length(),last.length());i++){
            if(first.charAt(i)!=last.charAt(i)){
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }
        return ans.toString();
    }
}