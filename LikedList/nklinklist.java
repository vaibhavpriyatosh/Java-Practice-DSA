class nklinklist
{
    public static int nknode(Node head, int k)
    {
        Node temp=head;
        int i=1;int j=0;
        
        while(temp!=null){
            temp=temp.next;
            j++;
        }
        
        i=j;
        j=j/k;
        
        
        if(i%k>0)j++;
        
        i=1;
        
        while(head!=null){
            if(j==i)
                return head.data;
                
            head=head.next;
            
            i++;
            
        }
    
    return 0;
        
    }
}
class Node
{
    int data;
    Node next;
    
    Node(int key)
    {
        data = key;
        next = null;
    }
}