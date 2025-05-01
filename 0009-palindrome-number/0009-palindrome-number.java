class Solution {
    public boolean isPalindrome(int x) {
        
    long num=0;
        if(x<0){
            return false;
        }
        int temp=x;
        while(temp!=0){
            num=num*10+temp%10;
            temp/=10;
            //cout<<num<<endl;
        }
        return(x==num);
    }
}