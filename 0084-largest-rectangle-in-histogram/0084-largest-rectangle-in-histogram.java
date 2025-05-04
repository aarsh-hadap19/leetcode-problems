class Solution {
    public int largestRectangleArea(int[] ht) {
        int n=ht.length;
        int []left = new int[n];
        int []right = new int[n];
        Stack<Integer> st= new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && ht[st.peek()]>=ht[i]){
                st.pop();
            }
            if(st.isEmpty()){
                left[i]=0;
            }
            else{
                left[i]=st.peek()+1;
            }
            st.push(i);
        }
        st= new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty()&&ht[st.peek()]>=ht[i]){
                st.pop();
            }
            if(st.isEmpty()){
                right[i]=n-1;
            }
            else{
                right[i]=st.peek()-1;
            }
            st.push(i);
        }
        int ans=0;
        for(int i=0;i<n;i++){
            int width = right[i]-left[i]+1;
            int area = width * ht[i];
            if(area>ans){
                ans=area;
            }
        }
        return ans;
    }
}