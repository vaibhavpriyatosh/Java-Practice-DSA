import java.util.*;
class unique_path{
	public static void main(String[] args) {
		System.out.println(NumberOfPath(14,13));
	}
	public static int numpath(int i,int j,int a,int b){
        if(i==a-1&&j==b-1)
            return 1;
            
            int t1=0,t2=0;
        
        if(i+1<a)
         t1=numpath(i+1,j,a,b);
        
        if(j+1<b)
         t2=numpath(i,j+1,a,b);
        
        return t1+t2;
        
    }
    public static int NumberOfPath(int a, int b) 
    {
        return numpath(0,0,a,b);
    }
}