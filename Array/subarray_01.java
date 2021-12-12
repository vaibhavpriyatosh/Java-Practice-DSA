import java.util.*;
class subarray_01
{
    //Function to count subarrays with 1s and 0s.
    static int countSubarrWithEqualZeroAndOne(int arr[], int n)
    {
        //using a map to store frequency of values obtained for prefix sum.
        Map<Integer,Integer> um = new HashMap<>(); 
        
        int curr_sum = 0; 
      
        //iterating over the array.
        for (int i = 0; i < n; i++) { 
            
            //calculating prefix sum by considering 0 as -1 and adding 1 if 
    	    //value of arr[i] is 1 or adding -1 if it is 0.
            curr_sum += (arr[i] == 0) ? -1 : arr[i]; 
            
            //updating the value in map.
            um.put(curr_sum, um.get(curr_sum)==null?1:um.get(curr_sum)+1); 
        } 
      
        int count = 0; 
          
        //iterating over the map.
        for (Map.Entry<Integer,Integer> itr : um.entrySet()) 
        { 
            //if value of any element in map is more than 1, then we 
    	    //update the count of subarrays.
    	    //count=(value*(value-1))/2 where value is value of key in map.
            if (itr.getValue() > 1) 
                count += ((itr.getValue()* (itr.getValue()- 1)) / 2); 
        } 
        
        //adding frequency of sum 0 in the map to the final result.
        if (um.containsKey(0)) 
            count += um.get(0); 
      
        //returning the count of subarrays.
        return count; 
    }
}
