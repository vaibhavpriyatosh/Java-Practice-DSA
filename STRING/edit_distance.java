import java.util.*;

class edit_distance{

	

	public static int editDistance(String s, String t) {
        if(s.equals(t))
        	return 0;int count =0;

        if(s.length()==t.length()){
        		
        		for (int i=0;i<s.length() ;i++ ) {
        			if(s.charAt(i)!=t.charAt(i))
        				count++;
        		}
        		return count;
        }
        else{

        	for(int i=0;i<t.length();i++){
        		if(i<s.length() && s.charAt(i)!=t.charAt(i)){
        			s=s.substring(0,i)+t.charAt(i)+s.substring(i);
        			count++;
        			
        		}
        	}
        	if(s.equals(t))
        		return count;
        	else
        		count=editDistance(s,t);
        }



        return count;
    }

	public static void main(String[] args) {
		System.out.println(editDistance("dceccabbb","bbefcdeabfbfa"));
	}
}