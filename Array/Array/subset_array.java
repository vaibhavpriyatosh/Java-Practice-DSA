import java.util.*;
class subset_array{
	
	 public String isSubset( long a1[], long a2[], long n, long m) {
        
        HashMap<Long,Integer> freq = new HashMap<>();
        for(int i=0;i<n;i++){
            if(!freq.containsKey(a1[i])) freq.put(a1[i],1);
            else {
                int count = freq.get(a1[i]);
                freq.put(a1[i],count+1);
            }
        }
        for(int i=0;i<m;i++){
            if(!freq.containsKey(a2[i])) return "No";
            else {
                int count = freq.get(a2[i]);
                count--;
                if(count<0) return "No";
                else freq.put(a2[i],count);
            }
        }
        return "Yes";
        
    }

	public static void main(String[] args) {
		
	}
}