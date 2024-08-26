package CN_week_14_Trees;

import java.util.Scanner;

public class BinaryTreeUse {
	
	static Scanner in =new Scanner(System.in);
	
	public static void printTreeRecc(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return ;
		}
		String s = root.data+ ": ";
		
		if(root.left!= null) {
			s=s+"L"+root.left.data+", ";
		}
		if(root.right!=null) {
			s=s+"R"+root.right.data;
		}
		System.out.println(s);
		printTreeRecc(root.left);
		printTreeRecc(root.right);
	
	}
	
	public static BinaryTreeNode<Integer> takeInput(){
		System.out.println("Enter data ");
		int rootData=in.nextInt();
		if(rootData==-1) {
			return null;
		}
		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(rootData);
		root.left=takeInput();
		root.right=takeInput();
		
		return root;
	}
	
	public static BinaryTreeNode<Integer> takeInputLevelwise(){
		Scanner in =new Scanner(System.in);
		System.out.println("Enter root data");
		int rootdata=in.nextInt();
		if(rootdata==-1) {
			return null;
		}
		
		BinaryTreeNode<Integer>root=new BinaryTreeNode<Integer>(rootdata);
		QueueUsingLL< BinaryTreeNode<Integer>>pendingNodes=new QueueUsingLL<>();
		pendingNodes.enqueue(root);
		
		while(!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer>front=pendingNodes.dequeue();
			
			System.out.println("Enter left child of: "+front.data);
			int leftdata=in.nextInt();
			if(leftdata != -1) {
				BinaryTreeNode<Integer>leftchild=new BinaryTreeNode<Integer>(leftdata);
				pendingNodes.enqueue(leftchild);
				front.left=leftchild;
			}
			
			System.out.println("Enter right child of: "+front.data);
			int rightdata=in.nextInt();
			if(rightdata != -1) {
				BinaryTreeNode<Integer>rightchild=new BinaryTreeNode<Integer>(rightdata);
				pendingNodes.enqueue(rightchild);
				front.right=rightchild;
			}
		}
		return root;
	}//1 2 3 4 5 6 7 -1 -1 -1 -1 -1 -1 -1 -1
	
	public static int countNodes(BinaryTreeNode<Integer> root){
		if(root==null) {
			return 0;
		}
			int count=1;
			count=count+countNodes(root.left);
			count=count+countNodes(root.right);
			return count;
	}
	public static int sumOfNodes(BinaryTreeNode<Integer> root){
		if(root==null) {
			return 0;
		}
		int sum=root.data;
		
		
		sum=sum+sumOfNodes(root.left);
		sum=sum+sumOfNodes(root.right);
		
		return sum;
	}
	// 10 20 30 40 50 -1 -1 -1 -1 -1
	static boolean ans=false;
	public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {
		if(root==null) {
			return false;
		}
		
		if(root.data==x) {
			return true;
		}else {
			return isNodePresent(root.left,x) ||  isNodePresent(root.right,x);
		}
		
		
		
	}
		
//	5 6 10 2 3 -1 -1 -1 -1 -1 9 -1 -1
	
	public static void main(String[]args) {
		BinaryTreeNode<Integer> root=takeInputLevelwise();
//		printTree(root);
		System.out.println(isNodePresent(root,7));
	}
}
