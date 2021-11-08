class subtree_sum{
	public static void main(String[] args) {
		
	}
	int[] count(Node root,int x){
        
        int a[]={0,0};
        
        if(root==null)
            return a;
        
        int a1[]=count(root.right,x);
        int a2[]=count(root.left,x);
        
        a[1]=a1[1]+a2[1]+root.data;
        
        a[0]=a1[0]+a2[0];
        
        if(a[1]==x)
            a[0]=a[0]+1;
        
        return a;
        
    }
    int countSubtreesWithSumX(Node root, int X)
    {
	    int a[]=count(root,X);
	    
	    return a[0];
    }
}