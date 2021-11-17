import java.util.*;
class pair_w_diff{
	public static void main(String[] args) {
		int arr[]={1,5,8,3,7};
		System.out.println(maxSumPairWithDifferenceLessThanK(arr, 5, 4));
	}
	public static int[] rev_ar(int arr[],int N){
        int start=0,end=N-1;
        
        while(start<=end){
            int k=arr[start];
            arr[start++]=arr[end];
            arr[end--]=k;
        }
        
        return arr;
        
    }
    
    public static int maxSumPairWithDifferenceLessThanK(int arr[], int N, int K) 
    {
        Arrays.sort(arr);
        
        arr=rev_ar(arr,N);
        
        int sum=0;
        
        for(int i=0;i<N-1;i++){
            if(arr[i]-arr[i+1]<K){
                sum=sum+arr[i++]+arr[i];
            }
        }
        
        return sum;
        
    }
}