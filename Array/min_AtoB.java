import java.util.*;
class min_AtoB{
	
	static int LISLength(int[] v) {
        if (v.length == 0) // boundary case
            return 0;
 
        int[] tail = new int[v.length];
        int length = 1; // always points empty slot in tail
        tail[0] = v[0];
 
        for (int i = 1; i < v.length; i++) {
 
            if (v[i] > tail[length - 1]) {
                // v[i] extends the largest subsequence
                tail[length++] = v[i];
            }
            else {
                int idx = Arrays.binarySearch(
                    tail, 0, length - 1, v[i]);
 
                // binarySearch in java returns negative
                // value if searched element is not found in
                // array
 
                // this negative value stores the
                // appropriate place where the element is
                // supposed to be stored
                if (idx < 0)
                    idx = -1 * idx - 1;
 
                // replacing the existing subsequene with
                // new end value
                tail[idx] = v[i];
            }
        }
        return length;
    }
    
    static int minInsAndDel(int[] A, int[] B, int N, int M) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i=0; i<M; i++) {
            mp.put(B[i],i);
        }
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i=0; i<N; i++) {
            if(mp.containsKey(A[i]))
                arr.add(mp.get(A[i]));
        }
        
        int[] res = new int[arr.size()];
        for(int i=0; i<arr.size(); i++)
            res[i] = arr.get(i);
        
        int ans = (N-LISLength(res)) + (M-LISLength(res));

        return ans;
    }  
	public static void main(String[] args) {
		int a[]={1, 4};
		int b[]={1, 4};
		System.out.println(minInsAndDel(a,b,a.length,b.length));
	}
}