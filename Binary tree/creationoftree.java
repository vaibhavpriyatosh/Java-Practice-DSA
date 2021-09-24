import java.util.*;
class creationoftree{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		

		Node Root1=createNode();
		Node Root2=createNode();

		System.out.println(Root1);
		System.out.println(Root2);

		System.out.println("Printing LNR traversal");
		LNR_traversal(Root1);
	}

	static Node createNode(){

		Node Root=null;

		System.out.println("Enter Data : ");
		int data=sc.nextInt();

		if(data==-1)return null;

		Root=new Node(data);

		System.out.println("Enter Left Data for "+data);
		Root.left=createNode();

		System.out.println("Enter Right Data for "+data);
		Root.right=createNode();


		return Root;

	}
	static void LNR_traversal(Node root){
		Node temp=root;

		System.out.print(temp.data+" ");

		if(temp.left != null)
			LNR_traversal(temp.left);

		if(temp.right != null)
			LNR_traversal(temp.right);
		
	}
	public static boolean isSameTree(TreeNode p,TreeNode q){
		TreeNode temp1=p;
		TreeNode temp2=q;

		boolean b1=true,b2=true;

		if (temp1.left != null && temp2.left != null) 
			isSameTree(temp1.left,temp2.left);
		else if((temp1.left != null && temp2.left ==null)||(temp1.left == null && temp2.left !=null))
			return false;

		if (temp1.right != null && temp2.right != null) 
			isSameTree(temp1.right,temp2.right);
		else if((temp1.right != null && temp2.right ==null)||(temp1.right == null && temp2.right !=null))
			return false;

		return ((temp1.data==temp2.data) && b1 && b2);
		
	}
}

class Node{
	Node left;
	Node right;
	int data;
	public Node(int data){
		this.data=data;
	}
}
public boolean isSymmetric(TreeNode root) {
        
    }

class TreeNode{
	TreeNode left;
	TreeNode right;
	int data;
	public TreeNode(int data){
		this.data=data;
	}
}