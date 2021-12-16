import java.util.*;
class left_view_tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      ArrayList<Integer> arr=new ArrayList<>();
      traverse(root,arr,1);
      return arr;
    }
    public static void traverse(Node root,ArrayList<Integer> arr,int lvl){
        if(root==null)
            return;
            
        if(arr.size()<lvl)    
        arr.add(root.data);
        
        lvl++;
        traverse(root.left,arr,lvl);
        traverse(root.right,arr,lvl);
    }
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