import java.util.*;
class kth_2dmatrix{
	public static int findIndex(int arr[], int t)
    {
 
        int index = Arrays.binarySearch(arr, t);
        return (index < 0) ? -1 : index;
    }
    
    
	public static int kthSmallest(int[][]mat,int n,int k)
	{int m=0;
        int a[]=new int[n*n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[m++]=mat[i][j];
            }
        }
        
        Arrays.sort(a);
        
        
        return (a[k-1]);
        
        
    }
	public static void main(String[] args) {
		
	}
}