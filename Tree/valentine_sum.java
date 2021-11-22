import java.util.*;
class valentine_sum{
    static int sum;
    
    static void add_subtree(Node n, int dist){
        if( (n==null) || (dist<0) ) return;
        sum += n.data;
        add_subtree(n.left, dist-1);
        add_subtree(n.right, dist-1);
    }
    
    static int traverse(Node n, int target, int k){
        if(n==null) return -1;
        if(n.data==target)
        {
            add_subtree(n, k);
            // adding all nodes within range in the sub tree below
            return k-1;
        }
        
        int dist = traverse(n.left, target, k);
        if(dist>-1)
        // dist>-1 indicates target was found in left subtree
        {
            sum += n.data;
            add_subtree(n.right, dist-1);
            // adding values from right sub tree
            return dist-1;
        }
        
        dist = traverse(n.right, target, k);
        if(dist>-1)
        // dist>-1 indicates target was found in right subtree
        {
            sum += n.data;
            add_subtree(n.left, dist-1);
            // adding values from left sub tree
            return dist-1;
        }
        
        return -1;
    }
    
    static int sum_at_distK(Node root, int target, int k){
        sum = 0;
        traverse(root, target, k);
        return sum;
    }
}




