class swap_bit{
	 public static int swapBits(int n) 
    {
        
        int ev_bit = n & 0xAAAAAAAA;
     
        int od_bit = n & 0x55555555;
     
       
        ev_bit >>= 1;
         
      
        od_bit <<= 1;
         
      
        return (ev_bit | od_bit);
    }
    public static void main(String[] args) {
    	
    }
}