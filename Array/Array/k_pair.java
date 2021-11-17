import java.util.*;
class k_pair{

	public int find_min1(int[] a, int n, int k) {
        
        int max=0;
        for(int i=0;i<n ;i++){
             max=max+a[i];
        }
        
        int sum=n+(2*k-1);
        
        if(max<sum)
        return -1;
        
        return sum;
    }

    public int find_min(int[] a, int n, int k) {
        int sum = 0, complete_pairs = 0;
        for (int i = 0; i < n; i++) {
            complete_pairs += a[i] / 2;

            if (a[i] % 2 == 0)
                sum += (a[i] - 2) / 2;
            else
                sum += (a[i] - 1) / 2;
        }
        if (k > complete_pairs) return -1;

        if (k <= sum) return 2 * (k - 1) + n + 1;

        return 2 * sum + n + (k - sum);
    }

	public static void main(String[] args) {
		
	}
}