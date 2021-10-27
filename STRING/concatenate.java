import java.util.*;
class concatenate{

	String convert_attempt1(String s, int n)
    {
        String str[]=new String[n];
        
        
        int num=s.length();
        
        int k=0;
        while(k<num){
            for(int i=0;i<n&&k<num;k++){
                if(str[i]==null)
                    str[i]="";
                str[i]=str[i]+s.charAt(k);
                i++;
            }
            for(int i=n-2;i>0&&k<num;k++){
                str[i]=str[i]+s.charAt(k);
                i--;
            }
        }
        return String.valueOf(str);
    }

    String convert(String s, int n)
    {
        //code here
        if (n <= 1)
        {
            return s;
        }
 
        StringBuilder result = new
                             StringBuilder();
 
        // Iterate rowNum from 0 to n - 1
        for (int rowNum = 0; rowNum < n; rowNum++)
        {
            int i = rowNum;
            boolean up = true;
           
            // Iterate i till s.length() - 1
            while (i < s.length())
            {
 
                result = result.append(s.charAt(i));
               
                // Check is rowNum is 0 or n - 1
                if (rowNum == 0 || rowNum == n - 1)
                {
                    i += (2 * n - 2);
                }
                else
                {
                    if (up)
                    {
                        i += (2 * (n - rowNum) - 2);
                    }
                    else
                    {
                        i += rowNum * 2;
                    }
                    up ^= true;
                }
            }
        }
        return result.toString();
        
    }

	public static void main(String[] args) {
		
	}
}