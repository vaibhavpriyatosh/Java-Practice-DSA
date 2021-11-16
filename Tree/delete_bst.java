class delete_bst{
	public static int chk_lft(Node root){
        if(root.right==null){
            
            Node temp=root;
            root=null;
            return temp.data;
            
        }
        return chk_lft(root.right);
    }
    public static Node replace(Node root){
        
        if(root.left!=null){
            if(root.left.right!=null)
                root.data=chk_lft(root.left);
            else{
                Node temp=root.right;
                root=root.left;
                root.right=temp;
            }
            
        }
        else if(root.right!=null){
            root=root.right;
            
        }
        else
            root=null;
        
        return root;
    }
    public static Node deleteNode(Node root, int X) {
        
        if(root==null)
            return root;
        if(root.data==X)
            return replace(root);
            
        deleteNode(root.right,X);
        deleteNode(root.left,X);
        
        return root;
    }
}
