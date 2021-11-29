class help_classmate {
	   public static int clas(int arr[],int index){
        for(int i=index+1;i<arr.length;i++){
            if(arr[i]<arr[index])
                return arr[i];
        }
        return -1;
    }
	public static int[] help_classmate(int arr[], int n) 
	{ 
	    
	    int array[]=new int[n];
	    
	    for(int i=0;i<n;i++){
	        array[i]=clas(arr,i);
	    }
	    
	    return array;
	} 
}