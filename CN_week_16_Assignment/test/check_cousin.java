package CN_week_16_Assignment.test;
import java.util.ArrayList;

public class check_cousin {
	


	

		/*	Binary Tree Node class
		 * 
		 * class BinaryTreeNode<T> {
			T data;
			BinaryTreeNode<T> left;
			BinaryTreeNode<T> right;

			public BinaryTreeNode(T data) {
				this.data = data;
			}
		}
		 */

		public static boolean isCousin(BinaryTreeNode<Integer> root, int p, int q) {
			// Write your code here
			return !isSiblings(root,p,q )&& level(root,0,p) == level(root,0,q);
		}

	public static boolean isSiblings(BinaryTreeNode<Integer>root,int p,int q){
	if(root==null){
		return false;
	}	

	if(root.left!= null && root.right!=null ){
		if(root.left.data==p && root.right.data==q){
			return true;
		}
	}
	return isSiblings(root.left,p,q)|| isSiblings(root.right,p,q);
	}
	public static int level(BinaryTreeNode<Integer> root,int k,int node1){
		if(root==null){
			return -1;
		}

		if(root.data==node1){
			return k;
		}
		int left=level(root.left,k+1,node1);
		int right= level(root.right,k+1,node1);
		if(left==-1){
			return right;
		}
		if(right==-1){
			return left;
		}



	return -1;


	}



	
}
