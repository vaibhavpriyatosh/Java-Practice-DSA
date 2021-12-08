import java.util.*;
class neartozero
{
    public static int closestToZero (int arr[], int n)
    {
        Arrays.sort(arr);  // sorting the array
    	int i = 0, j = n - 1;
    	int sum = arr[i] + arr[j]; // initializing sum
    	int diff = Math.abs (sum); // initializing the result
    
    	while (i < j)
    	{
    	    // if we have zero sum, there's no result better. Hence, we return
    		if (arr[i] + arr[j] == 0) 
    			return 0;
    			
    		// if we get a better result, we update the difference
    		if (Math.abs (arr[i] + arr[j]) < Math.abs (diff))
    		{
    			diff = (arr[i] + arr[j]);
    			sum = arr[i] + arr[j];
    		}
    		else if (Math.abs (arr[i] + arr[j]) == Math.abs (diff))
    		{
    		    sum = Math.max(sum,arr[i] + arr[j]);
    		}
            
            // if the current sum is greater than zero, we search for a smaller sum
    		if (arr[i] + arr[j] > 0)
    			j--;
    		// else, we search for a larger sum
    		else
    			i++;
    	}
    	return sum;
    }
}