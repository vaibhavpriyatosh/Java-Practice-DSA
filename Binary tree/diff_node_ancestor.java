class Node
{
    int data;
    Node left, right;
    
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
class diff_node_ancestor
{
    //Function to return the maximum difference between any 
    //node and its ancestor.
    int maxDiff(Node root)
    {
        int n1=m_diff(root.right,root.data,-20000);
        int n2=m_diff(root.left,root.data,-20000);
        
        return n1>n2?n1:n2;
    }
    public static int m_diff(Node root,int ancestor,int diff){
        
        if(root==null)return diff;
            
        diff=diff>(ancestor-root.data)?diff:(ancestor-root.data);
        
        ancestor=ancestor>(root.data)?ancestor:root.data;
        
        int n1=m_diff(root.right,ancestor,diff);
        int n2=m_diff(root.left,ancestor,diff);
        
        return n1>n2?n1:n2;
    }
}
