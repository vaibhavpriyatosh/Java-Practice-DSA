import java.util.*;
class Kandane{

	static int maxsumofarray(int arr[]){
		int n=arr.length;
		int curr_same=0;
		int max_sum=0;
		for (int i=0;i<n ;i++ ) {
			curr_same=curr_same+arr[i];
			if(curr_same<0){
				curr_same=0;
				continue;
			}
			
			if(curr_same>max_sum)
				max_sum=curr_same;
		}

		return max_sum;
	}

	static int maxsumofarray_neg(int arr[]){
		int n=arr.length;
		int curr_same=arr[0];
		int max_sum=arr[0];
		for (int i=1;i<n ;i++ ) {
			if(curr_same+arr[i]<arr[i])
				curr_same=arr[i];
			else
				curr_same=curr_same+arr[i];
			
			if(curr_same>max_sum)
				max_sum=curr_same;
		}

		return max_sum;
	}


	public static void main(String[] args) {
		int arr[]={-2,-4,-5,-5,-3,-99,-9};
		System.out.println(maxsumofarray_neg(arr));
		
	}
}