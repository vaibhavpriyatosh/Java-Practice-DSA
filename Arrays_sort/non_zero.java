class non_zero{
	
	static int rightmostNonZeroDigit(int N, int[] A){
        int prod=1;
        long t=1;
        for (int i=0;i<N ;i++ ) {
        	t=t*A[i];
        }

        String s=t+"";

        int j=N-1;
        int h=0;
        while(j>=0 && s.charAt(j)=='0')
        	j--;

        if(j<0)

        	return -1;

        return Integer.parseInt(s.charAt(j)+"");



    }

	public static void main(String[] args) {
		
	}

}