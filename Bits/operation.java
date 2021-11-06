class operation{
	public static void main(String[] args) {
		
	}

    public static long divide(long dividend, long divisor)
    {
        // Calculate sign of divisor 
        // i.e., sign will be negative 
        // only iff either one of them 
        // is negative otherwise it 
        // will be positive 
        long sign = ((dividend < 0) ^ 
                    (divisor < 0)) ? -1 : 1; 
         
        // remove sign of operands 
        dividend = Math.abs(dividend); 
        divisor = Math.abs(divisor); 
         
        // Initialize the quotient 
        long quotient = 0, temp = 0; 
         
        // test down from the highest 
        // bit and accumulate the 
        // tentative value for 
        // valid bit 
        // 1<<31 behaves incorrectly and gives Integer
        // Min Value which should not be the case, instead 
          // 1L<<31 works correctly. 
        for (int i = 31; i >= 0; --i) 
        { 
         
            if (temp + (divisor << i) <= dividend) 
            { 
                temp += divisor << i; 
                quotient |= 1L << i; 
            } 
        } 
         
        return (sign * quotient); 
    }



	public static long Attemp1_divide(long a, long b)
    {
        int sign1=a>0?1:-1;
        int sign2=b>0?1:-1;
        
        int count=0;
        
        if(sign1 != sign2){
            if(sign1<0){
                
                while(a<=0){
                    count--;
                    a=a+b;
                }
                
            }
            else{
                while(a>=0){
                    count--;
                    a=a+b;
                }
            }
        }
        else{
            if(sign1<0){
                
                while(a<=0){
                    count++;
                    a=a-b;
                }
                
            }
            else{
                while(a>=0){
                    count++;
                    a=a-b;
                }
            }
        }
        
        if(count<0)
            return count+1;
        
        return count-1;
    }
}