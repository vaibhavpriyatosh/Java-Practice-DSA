import java.util.*;
class largerec1 {
    static int getMax(int row[], int n)
    {
        Arrays.sort(row);
        int ans =0;
        for(int i=0;i<n;i++){
            ans = Math.max(ans, row[i]*(n-i));
        }
        return ans;
    }
    int maxArea(boolean[][] mat, int r, int c) {
        // code here
        int[][] temp = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(mat[i][j]==true){
                    temp[i][j] = 1;
                }
                else{
                    temp[i][j] = 0;
                }
                if(i>0){
                    if(mat[i][j]){
                        temp[i][j]+=temp[i-1][j];
                    }
                }
                // System.out.print(temp[i][j]+" ");
            }
            // System.out.println();
        }
        int ans = 0;
        for(int[] a:temp){
            ans =Math.max(ans, getMax(a,c));
        }
        // int res = maxRectangle(r, c, temp);
        return ans;
    }
}