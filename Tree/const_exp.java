
class const_exp
{
    
    public static Node constructTree(char postfix[])
    {
                Stack<Node> st=new Stack<>();
                
                for(char ch:postfix)
                {
                    if(Character.isAlphabetic(ch))
                    {
                        st.push(new Node(ch));
                    }
                    else
                    {
                        Node node=new Node(ch);
                        node.right=st.pop();
                        node.left=st.pop();
                        st.push(node);
                    }
                }
                
                return st.peek();
    }
    
}