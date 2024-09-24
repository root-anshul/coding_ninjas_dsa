package CN_week_16_Assignment.test;
import java.util.ArrayList;
public class Longest_leaf_to_root_path {
	



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
		
		public static ArrayList<Integer> longestRootToLeafPath(BinaryTreeNode<Integer> root){
			// Write your code here
			if(root==null){
				return new ArrayList<>();
			}		
	ArrayList<Integer> left = longestRootToLeafPath(root.left);
	ArrayList<Integer> right= longestRootToLeafPath(root.right);
	if(left.size()>=right.size()){
		left.add(root.data);
		return left;
	}else{
		right.add(root.data);
		return right;
	}

		

		
		
	}
}
