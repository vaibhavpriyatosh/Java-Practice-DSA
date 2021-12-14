import java.util.*;
class rev_string
{
    
    public static String rev_word(String s){
        s=s+'.';
        
        Stack<String> stack=new Stack<>();
        
        int start=0;
        
        for(int i=0;i<s.length();i++){
            while(s.charAt(i)!='.')i++;
            stack.push(s.substring(start,i));
            start=i+1;
        }
        s="";
        while(!stack.isEmpty())
            s="."+reverse(stack.pop())+s;
        
        return s.substring(1);
        
    }
   
    String reverseWords(String S)
    {
        return rev_word(S);
    }
    
    static String reverse(String s){
        int n=s.length();
        String temp="";
        for(int i=0;i<n;i++){
            temp=s.charAt(i)+temp;
        }
        return temp;
    } 
}