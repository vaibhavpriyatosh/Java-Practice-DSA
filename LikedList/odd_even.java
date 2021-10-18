class odd_even{
	
	Node divide(int N, Node head){
        // code here
        Node oh, ot;
        Node eh, et;
        
        oh = ot = eh = et = null;
        
        Node curr = head;
        
        while(curr != null)
        {
            if(curr.data % 2 == 0)
            {
                if(eh == null)
                    eh = curr;
                else
                    et.next = curr;
                et = curr;
            }
            else
            {
                if(oh == null)
                    oh = curr;
                else
                    ot.next = curr;
                ot = curr;
            }
            
            curr = curr.next;
        }
        
        if(eh == null)
            return oh;
        if(oh == null)
            return eh;
        
        et.next = oh;
        ot.next = null;
        
        return eh;
    }
	public static void main(String[] args) {

		

	}
	static class Node{
	    int data;
	    Node next;
	    
	    Node(int x){
	        data = x;
	        next = null;
	    }
	}
}