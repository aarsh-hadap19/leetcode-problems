class Solution {
    public void reverseString(char[] s) {
        int n=s.length;
        int start=0,end=n-1;
        char ch1,ch2;
        while(start<=end)
        {
            ch1=s[end];
            ch2=s[start];
            s[end]=ch2;
            s[start]=ch1;
            start++;
            end--;

        }
        return;
    }
}