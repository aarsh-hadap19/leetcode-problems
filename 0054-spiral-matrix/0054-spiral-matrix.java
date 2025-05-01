class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        List<Integer>list=new ArrayList<>();
        int n=mat.length;
        int m=mat[0].length;
        int top=0,bottom=n-1;
        int left=0,right=m-1;
        while(left<=right && top<=bottom){
            // going left to rigth
            for(int i=left;i<=right;i++){
                list.add(mat[top][i]);
            }
            top++;
            // going top to bottom
            for(int i=top;i<=bottom;i++){
                list.add(mat[i][right]);
            }
            right--;
            // going rigth to left
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    list.add(mat[bottom][i]);
                }
                bottom--;
            }
            // bottom to top
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    list.add(mat[i][left]);
                }
                left++;
            }
        }
        return list;
    }
}