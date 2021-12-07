import java.util.*;
class ctpl
{public static int countTripletsLessThan(int[] arr, int n, int val) {
        // sort the input array.
        Arrays.sort(arr);

        // Initialize result
        int ans = 0;

        int j, k;

        // to store sum
        int sum;

        // Fix the first element
        for (int i = 0; i < n - 2; i++) {

            j = i + 1;
            k = n - 1;

            while (j != k) {
                sum = arr[i] + arr[j] + arr[k];

                if (sum > val) k--;

                else {
                    ans += (k - j);
                    j++;
                }
            }
        }

        return ans;
    }
    public static int countTriplets(int arr[], int n, int a, int b) {

        
        int res;
        res = countTripletsLessThan(arr, n, b) -
              countTripletsLessThan(arr, n, a - 1);

        return res;
    }}