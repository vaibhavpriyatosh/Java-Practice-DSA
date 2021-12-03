import java.util.*;
class min_swap_k_tgth{
int minSwap(int arr[], int n, int k) {

        int count = 0;
        for (int i = 0; i < n; ++i)
            if (arr[i] <= k)
                ++count;

        int bad = 0;
        for (int i = 0; i < count; ++i)
            if (arr[i] > k)
                ++bad;
                
        int ans = bad;
        for (int i = 0, j = count; j < n; ++i, ++j) {

            if (arr[i] > k)
                --bad;

            if (arr[j] > k)
                ++bad;

            ans = Math.min(ans, bad);
        }
        return ans;
    }
}