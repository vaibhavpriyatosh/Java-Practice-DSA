import java.util.*;
class spiral_traversal{

	public static int findK(int a[][], int n, int m, int k)
	{
        int i, k = 0, l = 0;
        int count = 0;


        while (k < m && l < n) {

            for (i = l; i < n; ++i) {
                count++;

                if (count == c)
                   return a[k][i];
            }
            k++;
            for (i = k; i < m; ++i) {
                count++;

                if (count == c)
                    return a[i][n - 1];
            }
            n--;

            if (k < m) {
                for (i = n - 1; i >= l; --i) {
                    count++;

                    if (count == c)

                        return a[m - 1][i];
                }
                m--;
            }

            /* check the first column from
                    the remaining columns */
            if (l < n) {
                for (i = m - 1; i >= k; --i) {
                    count++;

                    if (count == c)
                        return a[i][l];
                }
                l++;
            }
        }
        return -1;
    }

	public static void main(String[] args) {
		int a[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		findK(a,4,4,4);
	}
}