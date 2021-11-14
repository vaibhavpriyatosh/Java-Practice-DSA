class count_reversal_paranthesis{
	public static void main(String[] args) {
		
	}
	int countRev (String s)
    {
        // if length is odd, we can't balance
        if (s.length () % 2 == 1) return -1;
        
        // number of opening and closing braces
        int op = 0, cl = 0;
    
        int res = 0; // ans
        for (int i = 0; i < s.length (); ++i)
        {
            if (s.charAt (i) == '{') op++;
            else cl++;
        
            // if cl exceeds op, then we balance the brackets till that point
            if (cl > op)
            {
                res += cl - op;
                int temp = cl;
                cl = op;
                op = temp;
            }
        }
        
        
        // finally, the we reverse the half of brakcets that form the unbalance
        // to balance the unbalanced pairs
        res += (Math.abs (cl - op)) / 2;
        return res;
    }
}