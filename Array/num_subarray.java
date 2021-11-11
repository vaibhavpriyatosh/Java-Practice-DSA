import java.util.*;
class num_subarray{
    // Function to find number of subarrays having
    // sum less than or equal to x.
    public long countSub(int arr[], int n, long x)
    {
        
        // Starting index of sliding window.
        int st = 0;
     
        // Ending index of sliding window.
        int end = 0;
     
        // Sum of elements currently present
        // in sliding window.
        long sum = 0;
     
        // To store required number of subarrays.
        long cnt = 0;
     
        // Increment ending index of sliding
        // window one step at a time.
        while (end < n) {
     
            // Update sum of sliding window on
            // adding a new element.
            sum += (long)arr[end];
     
            // Increment starting index of sliding
            // window until sum is greater than x.
            while (st <= end && sum > x) {
                sum -= (long)arr[st];
                st++;
            }
     
            // Update count of number of subarrays.
            cnt += (end - st + 1);
            end++;
        }
        return cnt;
    }
    public long countSubarray(int N, int A[],long L,long R) {
        // Number of subarrays having sum less
        // than or equal to R.
        long Rcnt = countSub(A, N, R);
     
        // Number of subarrays having sum less
        // than or equal to L-1.
        long Lcnt = countSub(A, N, L - 1);
        return Rcnt - Lcnt;
    }
}