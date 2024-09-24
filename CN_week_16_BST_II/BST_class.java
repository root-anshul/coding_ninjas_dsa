package CN_week_16_BST_II;

import CN_week_14_Trees.BinaryTreeNode;

public class BST_class {

	public BinaryTreeNode<Integer>root;
	
	
	
	private boolean helperhasData(BinaryTreeNode<Integer>root,int data){
		if(root==null) {
			return false;
		}
		if(root.data==data) {
			return true;
		}
		else if(data>root.data) {
			return helperhasData(root.right,data);
		}else {
			return helperhasData(root.left,data);
		}
	}
	
	
	public boolean hasData(int data) {
		return helperhasData(root,data);
	}
	
	public void insert(int data){
				
			root = insertHelper(root,data);
		
	}
	
	public void delete(int data){
		deleteHelper(root, data);
	}
	
	
	private BinaryTreeNode<Integer>insertHelper(BinaryTreeNode<Integer>root,int data){
		if(root==null) {
			BinaryTreeNode<Integer> newnode=new BinaryTreeNode<Integer>(data);
			return newnode;
		}
		
		if(data>root.data) {
			 BinaryTreeNode<Integer>right= insertHelper(root.right,data);
			 root.right=right;
		}else {
			BinaryTreeNode<Integer>left=insertHelper(root.left,data);
			root.left=left;
		}
		return root;
	}
	
	private BinaryTreeNode<Integer>deleteHelper(BinaryTreeNode<Integer>root,int data){
		if(root==null) {
			return null;
		}
		
		
		if(data<root.data) {
			root.left = deleteHelper(root.left,data);
			return root;
		}else if(data>root.data) {
			root.right=deleteHelper(root.right, data);
			return root;
		}else {
			if(root.left==null && root.right==null) {
				return null;
			}else if(root.left==null) {
				return root.right;
			}else if(root.right==null) {
				return root.left;
			}else {
				BinaryTreeNode<Integer>minNode=root.right;
				while(minNode.left!=null) {
					minNode=minNode.left;
				}
				root.data=minNode.data;
				root.right=deleteHelper(root.right,minNode.data);
				return root;
				
			}
			}
	}
		public void printTree() {
			printTreeRecc(root);
		}
		
		private static void printTreeRecc(BinaryTreeNode<Integer> root) {
			if(root==null) {
				return ;
			}
			String s = root.data+":";
			
			if(root.left!= null) {
				s=s+"L:"+root.left.data+",";
			}
			if(root.right!=null) {
				s=s+"R:"+root.right.data;
			}
			System.out.println(s);
			printTreeRecc(root.left);
			printTreeRecc(root.right);
		}
		
		public static void main(String []args) {
			
		}
	
}
