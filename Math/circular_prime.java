class circular_prime{
	public static void main(String[] args) {
		
	}
	public static boolean is_prime(int n){
        
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
                return false; 
        }
        
        return true;
        
    }
    
    public int isCircularPrime(int n)
    {
        
        if(n==1)
        return 0;
        
        String s=n+"";
        
        for(int i=0;i<s.length();i++){
            if(!is_prime(Integer.parseInt(s))){
                return 0;
            }
            s=s.substring(1)+s.charAt(0);
        }
        
        return 1;
        
    }
}