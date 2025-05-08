class Solution {
    public boolean isPowerOfFour(int n) {
        for(int i=0;i<16;i++)
        {
            int pow = (int)Math.pow(4,i);
            if(pow==n)
            {
                return true;
            }
        }
        return false;
    }
}