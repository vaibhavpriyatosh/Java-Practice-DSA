class mirror_tree{
	public static void main(String[] args) {
		
	}
	void mirror(Node node) {
        if(node==null)
            return ;
        
        mirror(node.left);
        mirror(node.right);
        
        Node temp=node.left;
        
        node.left=node.right;
        node.right=temp;
        
        return;
    }
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
}