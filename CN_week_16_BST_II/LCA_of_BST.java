package CN_week_16_BST_II;

public class LCA_of_BST {
	public static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {
if(root==null) {
			return -1;
		}
		if(a < root.data && b < root.data ) {
			return getLCA(root.left, a, b);
		}
		if(a>root.data && b > root.data) {
			return getLCA(root.right, a, b);
		}
		if(root.data == a || root.data == b) {
			return root.data;
		}
		int leftLca = getLCA(root.left, a, b);
		int rightLca = getLCA(root.right, a, b);
		if(leftLca==-1 && rightLca==-1) {
			return -1;
		}
		else if(leftLca==-1) {
			return rightLca;
		}
		else if(rightLca==-1) {
			return leftLca;
		}
		else {
			return root.data;
		}		
	}

}
