class encription_2 {
    public static void main(String[] args) {
        
    }
    static String encryptString(String S){
        int count = 0;
        
        String ans="";
        
        char c = S.charAt(0);
        count = 1;
        
        for(int i=1 ; i<S.length() ; i++)
        {
            if(S.charAt(i)==S.charAt(i-1))
                count++;          // Counting number of continuous repeating Characters.
            else
            {
                ans+=c;     // appending the character
                String hx="";
                
                // Change the value of Count to HexaDecimal value.
                {
                    int rem=count%16;
                    
                    if(rem<10)
                        hx+=(char)('0'+rem);
                    else
                        hx+=(char)('a'+(rem-10));
                        
                    count/=16;
                }
                ans+=hx;        //appending the hex value of count.
                c=S.charAt(i);
                count=1;
            }
        }
        
        ans+=c;
        String hx="";
        while(count!=0)
        {
            int rem=count%16;
            
            if(rem<10)
                hx+=(char)('0'+rem);
            else
                hx+=(char)('a'+(rem-10));
                
            count/=16;
        }
        ans+=hx;
        
        String final_ans="";
        
        for(int i = ans.length()-1 ; i>=0 ; i--)
            final_ans+=ans.charAt(i);             // Reversing the answer.
            
        return final_ans;
    }
};