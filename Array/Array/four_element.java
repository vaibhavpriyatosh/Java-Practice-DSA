import java.util.*;
class four_element{
	public static void main(String[] args) {
		
	}
	 boolean find4Numbers(int A[], int n, int X) 
    {
        int l, r;
        Arrays.sort(A);
		boolean flag=false;
        for (int i = 0; i < n - 3; i++) 
        {
            for (int j = i + 1; j < n - 2; j++) 
            {
                l = j + 1;
                r = n - 1;
                while (l < r) 
                {
                    if (A[i] + A[j] + A[l] + A[r] == X) 
                    {
						flag=true;
                        l++;
                        r--;
                    } 
                    else if (A[i] + A[j] + A[l] + A[r] < X)
                        l++;
                    else
                        r--;
                }
            }
        }
        return flag;
	}
}