class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        for(int i=n;i>0;i--){//length of the string
            for(int j=0;j<=n-i;j++){//start of the string
                if(checkpal(j,j+i,s)){
                    return s.substring(j,j+i);
                }
            }
        }
        return "";
    }
    public boolean checkpal(int i,int j,String s){
        int start=i,end=j-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}