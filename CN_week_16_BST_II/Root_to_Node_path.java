package CN_week_16_BST_II;

import java.util.ArrayList;

public class Root_to_Node_path {
	
	
	public static ArrayList<Integer>getRootToNodePath(BinaryTreeNode<Integer>root,int data){
		
		if(root==null) {
			return null;
		}
		if(root.data==data) {
			ArrayList<Integer>output=new ArrayList<Integer>();
			output.add(data);
			return output;
		}
		
		ArrayList<Integer>leftoutput=getRootToNodePath(root.left,data);
		if(leftoutput!=null) {
			leftoutput.add(root.data);
			return leftoutput;
		}
		
		ArrayList<Integer>rightoutput=getRootToNodePath(root.right,data);
		if(rightoutput!=null) {
			rightoutput.add(root.data);
			return rightoutput;
		}
		else {
			
		return null;
		}
	}
	
	
	
	public static void main(String[]args) {
	
	}
	
}
