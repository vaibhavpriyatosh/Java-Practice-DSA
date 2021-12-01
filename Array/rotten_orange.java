class rotten_orange{
	public int orangesRotting(int[][] grid)
    {
        int n=grid.length;
        int m=grid[0].length;
        
        int temp=1;int count=0;
        
        while(temp!=0){
            temp=0;count++;
            boolean chk[][]=new boolean [n][m];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(grid[i][j]==2 && !chk[i][j]){
                        if(i-1>=0 && grid[i-1][j]==1){
                            chk[i-1][j]=true;grid[i-1][j]=2;temp++;
                        }
                        if(i+1<n && grid[i+1][j]==1){
                            chk[i+1][j]=true;grid[i+1][j]=2;temp++;
                        }
                        if(j-1>=0 && grid[i][j-1]==1){
                            chk[i][j-1]=true;grid[i][j-1]=2;temp++;
                        }
                        if(j+1<m && grid[i][j+1]==1){
                            chk[i][j+1]=true;grid[i][j+1]=2;temp++;
                        }
                    }
	                    else if(grid[i][j]==1){
	                        int check=0;
	                        if(i-1>=0 && grid[i-1][j]!=0){
	                            check++;
	                        }
	                        else if(i+1<n && grid[i+1][j]!=0){
	                            check++;
	                        }
	                        else if(j-1>=0 && grid[i][j-1]!=0){
	                            check++;
	                        }
	                        else if(j+1<m && grid[i][j+1]!=0){
	                            check++;
	                        }
	                        if(check==0)
	                            return -1;
	                    }
                }
            }
        }
        --count;
        if(count==0)
            return -1;
        return count; 
    }
}