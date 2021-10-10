import java.util.*;
class vlaid_pair{
	static long ValidPair_attempt1(int a[], int n) 
	{ 
	    int count=0;
	    Arrays.sort(a);
	    for(int i=0;i<n;i++){
	        for(int j=n-1;j>i;j--){
	            if(a[i]+a[j]>0){
	                count ++;
	            }
	            else
	                break;
	        }
	    }
	    
	    return count;
	}
	static int grtr_zero(int a[],int start,int end,int k){
		int n=a.length;
		int y=start;
		int mid=y+1;

		while(start<=end && mid>=y){
			mid=(start+end)/2;
			

			if(a[mid]+k>0){
				if(mid==y || mid==n-1)
					return mid;
				else if(a[mid-1]+k<=0)
					return mid;
				else
					end=mid-1;
				continue;
			}
			else
				start=mid+1;

		}
		return -1;

	}

	static long ValidPair(int a[], int n) 
	{ 
	    long count=0;
	    Arrays.sort(a);
	    
	    for (int i=0;i<n ;i++ ) {
	    	int k=grtr_zero(a,i+1,n-1,a[i]);
	    	if(k==-1)
	    		continue;
	    	
	    	int t=n-k;

	    	count=count+t;

	    }
	    
	    return count;
	}
	public static void main(String[] args) {
		
	}
}