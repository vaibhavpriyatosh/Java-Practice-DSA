class cows_produce{

	public static int TotalAnimal(long N){
		if(N==0)
        return 1;
    
		int count =1;
		for (long i=N-2;i>=0 ;i-- ) {
			count=count+TotalAnimal(i);
		}
		return (int)(count);

	}

	public static void main(String[] args) {
		long l=4;
		System.out.println(TotalAnimal(l));
	}
}