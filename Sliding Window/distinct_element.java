class distinct_element{
	public static void main(String[] args) {
		
	}
	ArrayList<Integer> countDistinct(int A[], int n, int k)
    {
        ArrayList<Integer> al =new ArrayList<>();
        int start=0,end=k;

        int arr[]=new int[100001];
			int count=0;
			for(int i=start;i<end;i++){
				
					arr[A[i]]++;
				if(arr[A[i]]==1){
					count++;
				}
			}
			al.add(count);

        for(int i=k;i<n;i++){

	        arr[A[i]]++;
	        
	        
	        if(arr[A[i]]==1){
	            count++;
	        }
	        arr[A[i-k]]--;
	        
	        
	        if(arr[A[i-k]]==0){
	            count--;
	        }
	        
	        al.add(count);
        }
        return al;

    }
}