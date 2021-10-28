import java.util.*;

class count_triplet{
	public static void main(String[] args) {
		long arr[]={1,3,4,5,7};
		System.out.println(t_pointer(arr,0,3,12));		
	}



	 public static long countTriplets(long []arr, int sum){
        long count = 0;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int start = 0,end=arr.length-1,p = 1;
        while(start<arr.length-2){
            p = start+1;
            end = arr.length-1;
            while(p<end){
                if(arr[start]+arr[end]+arr[p] < sum){
                    System.out.println(arr[start]+" + "+arr[end]+" + "+arr[p]+" = "+(arr[start]+arr[end]+arr[p]));
                    count += (end-p);
                    p = p + 1;
                }
                else end--;
            }
            start++;
        }
        return count;
    }

}