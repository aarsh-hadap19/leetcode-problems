class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int count=0;
        int i=g.length-1;
        int j=s.length-1;
        Arrays.sort(g);
        Arrays.sort(s);
        while(i>=0 && j>=0){
            int greed=g[i];
            int size=s[j];
            if(size>=greed){
                j--;
            }
            i--;
        }
        return s.length-j-1;
    }
}