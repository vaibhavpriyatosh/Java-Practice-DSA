import java.util.*;

class histogram{

	public static long[] minimum(long hist[],long start,long end){

		long min=hist[(int)start];
		long min_index=0;
		long a[]=new long[2];

		for (long i=start;i<=end ;i++ ) {
			if(hist[(int)i]<min){
				min=hist[(int)i];
				min_index=i;
			}
		}
		a[0]=min;a[1]=min_index;
		return a;
	}

	public static long getMaxArea_1(long hist[], long n) 
    {
        long start=0,end=n-1;

        
        long max=0;

        long count=1;
        long a[]=new long[2];
        a=minimum(hist,0,n-1);

        long min=a[0],min_index=a[1];


        while(start<end){
        	min=a[0];
        	min_index=a[1];
        	long area=(end-start+1)*min;
        	if(max<area)
       			max=area;
        	if(end-min_index >= min_index-start){
       			start=min_index+1; 
       			a=minimum(hist,start,end);		
        	}
        	else{
        		end=min_index-1;
        		a=minimum(hist,start,end);
        	}
        	count++;
        }
        return max;

    }

     public static long getMaxArea(long hist[], long n) 
    { 
        Stack<Long> s = new Stack<Long>(); 
        
        long max_area = 0, area_with_top; 
        long tp=0, i = 0;
        
        while (i < n) 
        { 
            if(!s.empty())tp=s.peek();
            if (s.empty() || hist[(int)tp] <= hist[(int)i]) {
                s.push(i++); 
            }
            
            else 
            { 
                tp = s.peek();
                s.pop(); 
                
                //calculating the area with hist[tp] stack as smallest bar.
                area_with_top=hist[(int)tp]*(s.empty() ? i : i-s.peek()-1); 
                
                //updating maximum area, if needed.
                if(max_area < area_with_top) 
                    max_area = area_with_top; 
            } 
        } 
        
        //now popping the remaining bars from stack and calculating 
        //area with every popped bar as the smallest bar.
        while (s.empty() == false) 
        { 
            tp = s.peek(); 
            s.pop(); 
            area_with_top=hist[(int)tp]*(s.empty()? i : i-s.peek()-1); 
            
            //updating maximum area, if needed.
            if (max_area < area_with_top) 
                max_area = area_with_top; 
        } 
        //returning the maximum area.
        return max_area; 
    } 

	public static void main(String[] args) {
		long hist[]={6,2,5,4,5,1,6};

		System.out.println(getMaxArea(hist,hist.length));
	}
}