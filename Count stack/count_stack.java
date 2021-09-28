import java.util.*;
class count_stack{

	public static Stack<Integer> descending(Stack <Integer> s){

		int n=s.pop();

		if(s.isEmpty()){
			s.push(n);
			return s;
		}
		if(n<s.peek()){
			int temp=s.pop();
			s.push(n);
			n=temp;
		}
		s=descending(s);
		s.push(n);

		return s;
	}

	public static Stack<Integer> sort(Stack<Integer> s)
	{
		for (int i=0;i<s.capacity() ;i++ ) {
			s=descending(s);
		}
		return s;
	}

	public static void main(String[] args) {

		Stack <Integer> s=new Stack <> ();

		s.push(5);
		s.push(1);
		s.push(2);
		s.push(4);
		s.push(3);

		System.out.println("before - "+s);
		s=sort(s);
		System.out.println("after - "+s);

	}
}