import java.util.*;

class implement{
	int front, rear;
	static int arr[] = new int[100005];
	

	static void fill_array(){
		arr[0]=3;arr[1]=4;arr[2]=7;arr[3]=5;arr[4]=2;arr[5]=-1;
	}

    static void push(int x){
    	int t=x;int i=0;
    	while(arr[i]!=-1){

    		++i;
    	}
    	arr[i]=t;
    	arr[i+1]=-1;
    }

    static void pull(){
    	int i=0;
    	System.out.println("1st element"+arr[i]);
    	while(arr[i]!=-1){
    		arr[i]=arr[i+1];
    		i++;
    	}
    }

	public static void main(String[] args) {
		fill_array();
		pull();int i=0;
		while(arr[i]!=-1){
			System.out.println(arr[i]);++i;
			
		}
	}
}
class MyQueue {

    int front, rear;
	int arr[] = new int[100005];

    MyQueue()
	{
		front=0;
		rear=0;
		arr[0]=-1;
	}
	
	//Function to push an element x in a queue.
	void push(int x)
	{
    	arr[rear]=x;
    	arr[++rear]=-1;

	} 

    //Function to pop an element from queue and return that element.
	int pop()
	{
		int k=arr[front];
    	front++;
    	if(k==-1)
    	    front--;
    	return k;
	} 
}