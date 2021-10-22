class top_view{
	public static void main(String[] args) {
		
	}
	class Solution
{
    static LinkedList<Integer> leftside(Node root,LinkedList<Integer> ll){
        if(root.left == null){
            ll.add(root.data);
            
            if(root.right !=null){
                if(root.right.left!=null){
                    if(root.right.left.left!=null){
                        leftside(root.right.left.left,ll);
                    }                    
                }
            }
            return ll;
        }
            
        leftside(root.left,ll);
        ll.add(root.data);
        return ll;
    }
    
    static LinkedList<Integer> rightside(Node root,LinkedList<Integer> ll){
        if(root.right == null){
            ll.add(root.data);
            
            if(root.left !=null){
                if(root.left.right!=null){
                    if(root.left.right.right!=null){
                        rightside(root.left.right.right,ll);
                    }                    
                }
            }
            return ll;
        }
            
        ll.add(root.data);
        rightside(root.right,ll);
        
        return ll;
    }
    
    // static LinkedList<Integer> leftside(Node root,LinkedList<Integer> ll){
    //     if(root == null)
    //         return ll;
            
    //     leftside(root.left,ll);
    //     ll.add(root.data);
    //     return ll;
    // }
    
    // static LinkedList<Integer> rightside(Node root,LinkedList<Integer> ll){
    //     if(root == null)
    //         return ll;
            
    //     ll.add(root.data);
    //     rightside(root.right,ll);
        
    //     return ll;
    // }
    
    static ArrayList<Integer> topView1(Node root)
    {
        ArrayList <Integer> al=new ArrayList<>();
        LinkedList <Integer> ll=new LinkedList<>();
        
        if(root==null)
        return al;
        
        if(root.left != null)
           leftside(root.left,ll); 
        
        
        
        ll.add(root.data);
        
        if(root.right != null)
            rightside(root.right,ll);
        
        al.addAll(ll);
        
        return al;
        
    }
    class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

    class qObj
{
    Node node;
    int level;
    qObj(Node n,int l)
    {
        node=n;
        level=l;
    }
}

class Solution
{
    //Function to return a list of nodes visible from the top view 
    //from left to right in Binary Tree.
    public static ArrayList<Integer> topView(Node root)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        
        //creating empty queue for level order traversal.
        Queue<qObj> q=new LinkedList<qObj>();
        q.add(new qObj(root,1));
        
        //creating a map to store nodes at a particular horizontal distance.
        Map<Integer,Integer> map=new TreeMap<Integer,Integer>();
       
        while(!q.isEmpty())
        {
            qObj popped=q.poll();
            if(!map.containsKey(popped.level))
            map.put(popped.level,popped.node.data);
            
            //if left child of popped.node exists, pushing it in
            //the queue with the horizontal distance.
            if(popped.node.left!=null)
            q.add(new qObj(popped.node.left,popped.level-1));
            
            //if right child of popped.node exists, pushing it in
            //the queue with the horizontal distance.
            if(popped.node.right!=null)
            q.add(new qObj(popped.node.right,popped.level+1));
        }
        
        //traversing the map and storing the nodes in list 
        //at every horizontal distance.
        for(Map.Entry<Integer,Integer> e:map.entrySet())
        {
           ans.add(e.getValue());
        }
        
        //returning the output list.
        return ans;
    }
}
}