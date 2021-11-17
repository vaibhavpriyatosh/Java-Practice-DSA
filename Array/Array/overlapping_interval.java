import java.util.*;
class overlapping_interval{
    public static void main(String[] args) {
        
    }
}

public static int[][] overlappedInterval_attempt1(int[][] Intervals)
    {
    	int n=Intervals.length;
    	int a[]=new int[1001];

    	int max=0;

    	for (int i=0;i<n ;i++ ) {
    		for (int j=0;j<2 ;j++ ) {
    			if(j==0)
    				a[Intervals[i][j]]--;
    			else
    				a[Intervals[i][j]]++;

    			if(max<Intervals[i][j])
    				max=Intervals[i][j];
    		}
    	}

    	LinkedList <int  []> ll=new LinkedList<>();int k=0;int count=0;

    	for (int i=0;i<=max ;i++ ) {

    		int pair[]=new int[2];

    		if(a[i]!=-1)
    			continue;
    		pair[0]=i;
    		count++;
    		k=0;
    		for(int j=i;j<=max;j++){
    			if(a[j]==-1)
    				k++;
    			else if(a[j]==1)
    				k--;
    			if(k==0){
    				pair[1]=j;
    				ll.add(pair);i=j;break;
    			}
    		}
    	}

    	int pair_interval[][]=new int[count][2];

    	for (int i=0;i<count ;i++ ) {
    		pair_interval[i]=ll.get(i);
    	}
    	

    	return pair_interval;
    }
    public static int[][] sort(int [][] nums){
        if(nums.length<=1){
            return nums;
        }
        int mid = nums.length/2;
        int [][] left = Arrays.copyOfRange(nums,0,mid);
        int [][] right = Arrays.copyOfRange(nums,mid,nums.length);
        return merge(sort(left),sort(right));
    }
    public static int[][] merge(int [][] a,int [][] b){
        int i=0,j=0,k=0;
        int [][] merged = new int[a.length + b.length][2];
        while(i<a.length && j<b.length){
            if(a[i][0]<b[j][0]){
                merged[k] = a[i];
                i++;
            }
            else {
                merged[k] = b[j];
                j++;
            }
            k++;
        }
        while(i<a.length){
            merged[k] = a[i];
            i++;
            k++;
        }
        while(j<b.length){
            merged[k] = b[j];
            j++;
            k++;
        }
        return merged;
    }
    public static int[][] convertToArray(List<List<Integer>> li){
        int m = li.size();
        int n = li.get(0).size();
        int [][] arr = new int[m][n];
        for(int i=0;i<m;i++){
            int [] el = new int[n];
            for(int j=0;j<n;j++){
                el[j] = li.get(i).get(j);
            }
            arr[i] = el;
        }
        return arr;
    }
    public static int[][] overlappedInterval(int[][] Intervals)
    {
        // Code here
        int n = Intervals.length;
        if(n==1) return Intervals;
        List<List<Integer>> merged = new ArrayList<>();
        Intervals = sort(Intervals);
        int prev = 0,curr = 1,p=0,currMax = Intervals[prev][1];
        List<Integer> ele = new ArrayList<>();
        ele.add(Intervals[prev][0]);
        ele.add(Intervals[prev][1]);
        merged.add(ele);
        while(curr<n){
            if(Intervals[curr][0]<=merged.get(p).get(1)){
                if(Intervals[curr][1]>merged.get(p).get(1)){
                    merged.get(p).set(1,Intervals[curr][1]);
                }
            }

            else {
                List<Integer> l = new ArrayList<>();
                l.add(0,Intervals[curr][0]);
                l.add(1,Intervals[curr][1]);
                merged.add(l);
                p++;
            }
            curr++;
        }
        return convertToArray(merged);
    }