package CN_week_16_BST_II;

public class LCA_of_BinaryTress {
	static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {

		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
if(root==null) {
				return -1;
			}
			if(root.data==a || root.data==b) {
				return root.data;
			}
			int leftLca = getLCA(root.left, a, b);
			int rightLca = getLCA(root.right, a, b);
			if(leftLca==-1 && rightLca ==-1) {
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
