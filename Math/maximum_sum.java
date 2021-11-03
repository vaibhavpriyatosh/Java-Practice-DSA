import java.util.*;

class maximum_sum{
	public static void main(String[] args) {
		
	}
	
    int Maximize(int arr[], int n)
    {
        
        Arrays.sort(arr);
        
        long sum=0;
        int m=1000000007;
        
        for(int i=0;i<n;i++){
            sum=(sum+((long)arr[i]*i)%m)%m;
            
        }
        
        return (int)sum ;
        
    } 
}