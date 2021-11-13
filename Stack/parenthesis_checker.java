import java.util.*;

class parenthesis_checker{
	public static void main(String[] args) {
		
	}
	static boolean ispar(String x)
    {
        Stack <Character> stk=new Stack<Character>();
        
        int n=x.length();
        
        for(int i=0;i<n;i++){
            char c=x.charAt(i);
            if(c=='{'||c=='('||c=='[')
                stk.push(c);
            else{
                if(stk.empty())
                    return false;
                if(c==')'&& stk.peek()=='(')
                    stk.pop();
                else if(c==']'&& stk.peek()=='[')
                    stk.pop();
                else if(c=='}'&& stk.peek()=='{')
                    stk.pop();
                else
                    return false;
            }
        }
        
        return stk.empty();
        
    }
}