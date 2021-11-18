import java.util.*;
class pair 
{
  int first, second;
  public pair(int start, int finish)
  {
    this.first = start;
    this.second = finish;
  }
}

class activit_session
{
    //Function to find the maximum number of activities that can
    //be performed by a single person.
    public static int activitySelection(int start[], int end[], int n)
    {
        pair [] x = new pair[n];
        
        //pushing the pair of starting and finish day in a list.
        for(int i = 0; i < n; i++){
            x[i]  = new pair(start[i],end[i]);
        }
        
        //comparator function used in sorting the list of pairs 
        //according to increasing order of the finish day.
        Arrays.sort(x,new Comparator<pair>() {
                @Override
                public int compare(pair s1, pair s2)
                {
                    return s1.second - s2.second;
                }
        });
        
        int last = 0;
        int res = 0;
        for (int i = 0; i < n; i++) 
        {
            //if the starting day of this activity is greater than or equal
            //to the finish day of previously selected day then 
            //we increment the counter and update last.
            if (x[i].first > last) 
            {
                res++;
                last = x[i].second;
            }
        }
        //returning the counter.
        return res;
    }
}