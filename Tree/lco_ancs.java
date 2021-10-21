class lco_ancs{

	Node lca(Node root, int n1,int n2)
	{
		Node t=new Node(-1);

		if(root.left.data==n1 && root.right.data==n2){
			return root;
		}

		if(root.left == null && root.right == null){
			
			return t;
		}

		Node k1,k2;

		if(root.left !=null)
			k1=lca(root.left,n1,n2);
		else
			k1=t;

		if(root.right !=null)
			k2=lca(root.right,n1,n2);
		else
			k2=t;

		return k1>k2?k1:k2;

	}

	public static void main(String[] args) {
		
	}
}
class Node{
	Node left,rigth;
	int data;

	Node(int data){
		this.data=data;
		left=right=null;
	}

}