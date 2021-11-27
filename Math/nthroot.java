import java.util.*;
class nthroot    
    {
    public int NthRoot(int n, int m)
        {
        int low=1,high=m;
               
               while(low<=high){
                   int mid=(high+low)/2;
                   int nthpow=(int)Math.pow(mid,n);
                   if(nthpow==m)
                       return mid;
                   else if(nthpow>m)
                       high=mid-1;
                   else
                       low=mid+1;
               }
               return -1;
        }
    }