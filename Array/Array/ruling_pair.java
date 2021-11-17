class ruling_pair{
	 static int sum_digit(int n){
        
        int sum=0;
        
        while(n!=0){
            sum=sum+n%10;
            n=n/10;
        }
        
        return sum;
    }
	static int RulingPair(int arr[], int n) { 
	    
	    int n1[]=new int[100];
	    int n2[]=new int[100];
	    
	    int max=0;
	    
	    for(int i=0;i<n;i++){
	        
	        int dgt=sum_digit(arr[i]);
	        
	        if(n1[dgt]<arr[i]){
	            n2[dgt]=n1[dgt];
	            n1[dgt]=arr[i];
	        }
	        else if(n2[dgt]<arr[i])
	            n2[dgt]=arr[i];
	        
	    
	        if( n2[dgt]!=0){
	            if(max<n1[dgt]+n2[dgt])
	                max=n1[dgt]+n2[dgt];
	        }
	        
	    }
	    
	    if(max==0)
	        return -1;
	    return max;
	    
	}
	public static void main(String[] args) {
		
	}
}