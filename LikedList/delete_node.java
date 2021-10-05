import java.io.*;
import java.util.Scanner; 
class Node {
    int data;
    Node next;
    Node(int d) {
        this.data = d;
        this.next = null;
    }
}
 class delete_node{
    public static Node cur2=null;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            Node head=null;
            Node cur=null;
        int n=sc.nextInt();
        int p=sc.nextInt();
        cur=null;
        for(int i=0;i<n;i++)
        {
            int d=sc.nextInt();
            Node ptr=new Node(d);
            if(head==null)
            {
                head=ptr;
                cur=ptr;
            }
            else
            {
                cur.next=ptr;
                cur=ptr;
            }
        }
        cur2=head;
        while(p-->0)
        {
            cur2=cur2.next;
        }
        GfG g=new GfG();
        g.deleteNode(cur2);
        while(head!=null)
        {
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
        }
    }
}


 // } Driver Code Ends
//User function Template for Java
class GfG{
    void deleteNode(Node node) {
        
        Node temp=node;
        Node temp1=node;
        int count=0;
        
        if(temp.next !=null)
        temp.data=temp.next.data;
    	temp=temp.next;


        while (temp.next !=null){
        	temp.data=temp.next.data;
        	temp=temp.next;
        	temp1=temp1.next;
        	count++;
        } 

        temp1.next=null;
 
    }
}