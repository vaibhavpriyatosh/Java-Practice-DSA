import java.util.*;
class max_knegotiation {

    public static long maximizeSum(long a[], int n, int k)
    {
        Arrays.sort(a);
        
        int i=0;
        
        while(i<n && k>0 && a[i]<0){
            a[i]=-1*a[i];
            i++;k--;
        }
        
        if(k!=0){
            if(k%2==1){
                Arrays.sort(a);
                a[0]=-1*a[0];
            }
        }
        
        long sum=0;
        
        for(i=0;i<n;i++){
            sum+=a[i];
        }
        
        return sum;
        
    }
}