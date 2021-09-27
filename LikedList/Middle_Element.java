import java.util.*;
class Middle_Element{

	static int getMiddle(Node head)
    {
        Node middle=head;int count =1;int i=1;
        
         Node temp=head;
         while(temp.next != null){
             
             if(Math.round(count/2)==i){
                i++;        
                middle=middle.next;
             }
             
           
             
             count++;
             temp=temp.next;
         }
         if(count %2 ==0)
             middle=middle.next;
         return middle.data;
    }

	public static void main(String[] args) {
		List <Integer> ll=new LinkedList <> ();
		ll.add(1);ll.add(2);ll.add(3);ll.add(4);ll.add(5);
		System.out.println(getMiddle(ll));
	}
}
