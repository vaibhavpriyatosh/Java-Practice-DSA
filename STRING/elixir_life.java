class elixir_life{

	public static int maxFrequency(String S)
    {
    	int n=S.length();

    	int max=0,count=0;
    	for (int i=1;i<=n ;i++ ) {
    		
    		String pre=S.substring(0,i);
    		String suf=S.substring(n-i,n);
    		count=0;
    		if(pre.equals(suf)){

    			if(max==0 && pre.length()==n){
    				return 1;
    			}
    			count=2;
    			for (int j=i;j<n-i-i ;j++ ) {
    				if(pre.equals(S.substring(j,j+i)))
    					count++;
    			}
    		}
    		if(max<count)
    			max=count;
    	}



    	return max;

    }

	public static void main(String[] args) {
		System.out.println(maxFrequency("ababaaaab"));
	}
}