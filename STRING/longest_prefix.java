class longest_prefix{
 public int[] common(String s1,String s2,int k){
        int i=1;k++;
        int a[]={0,0};

  while(i<s1.length()&&k<s2.length()&&s1.charAt(i)==s2.charAt(k)){
            a[1]=i;i++;k++;
        }
        return a;
    }
    
    public int[] longestCommonPrefix(String s1, String s2){
        int n1=s1.length();
        int n2=s2.length();
        
        int a[]={-1,-1};
        String t="";
        int len=0;
        
        char c=s1.charAt(0);
        
        for(int i=0;i<s2.length();i++){
            if(c==s2.charAt(i)){
                int b[]=common(s1,s2,i);
                if(len<(b[1]-b[0]+1)||a[0]==-1){
                    len=b[1]-b[0]+1;
                    a=b;
                }
            }
        }
        
        return a;
    
    }
}