package CN_week_16_BST_II;

public class create_and_insert_duplicate_node {

	public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return ;
		}
		BinaryTreeNode<Integer> newNode=new BinaryTreeNode<Integer> (root.data);
		BinaryTreeNode<Integer> save=root.left;
		root.left=newNode;
		newNode.left=save;
		
		insertDuplicateNode(root.left);
		insertDuplicateNode(root.right);
		
		
	}

	static void pairSum(BinaryTreeNode<Integer> root, int sum) {
			if(root==null) {
				return ;
			}
	}
	
	
	public static void main(String[] args) {
		
	
	}

}
