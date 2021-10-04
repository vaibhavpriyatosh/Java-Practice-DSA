class Max_sumofzero{

	int maxSubstring(String S) {
        int n=S.length();
        int max=0;
        int count =0;
        int j=0;

        for (int i=0;i<n ;i++ ) {
        	
        	if(S.charAt(i)=='0')
        		count++;
        	else
        		count--;

        	if(count < 0)
        		count=0;
        	
        	else if(count>max)
        		max=count;


        }


        if (max==0)
        	return -1;
        return max;

    }

	public static void main(String[] args) {
		System.out.println(maxSubstring("111111000001011110"));
	}
}