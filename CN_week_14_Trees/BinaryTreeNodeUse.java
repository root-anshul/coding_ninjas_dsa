package CN_week_14_trees;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTreeNodeUse {
	static Scanner in =new Scanner (System.in);
	
	static int count=0;
	
	public static  int numbNodes(BinaryTreeNode<Integer> root) {
		if(root==null){
			return 0;
		}
		
		int leftNode=numbNodes(root.left);
		int rightNode=numbNodes(root.right);
		return 1+leftNode+rightNode;
	}
	public static  int NodeWithLargestdata(BinaryTreeNode<Integer> root) {
		
		if(root==null) {
			return -1;
		}
		
		int leftNode=NodeWithLargestdata(root.left);
		int rightNode=NodeWithLargestdata(root.right);
		return Math.max(root.data, Math.max(leftNode, rightNode));
		
	}

	public static  int NodesGreaterThanX(BinaryTreeNode<Integer> root,int x) {
		if(root==null) {
		return -1;	
		}
		if(root.data>x) {
			count++;
		}
		NodesGreaterThanX(root.left,x);
		NodesGreaterThanX(root.right,x);
		return count;
	}
	
	public static  void printTreeLevelWise(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return;
		}
		
		Queue<BinaryTreeNode<Integer>>pendingNodes=
				new LinkedList<BinaryTreeNode<Integer>>();
		pendingNodes.add(root);
		
		while(!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer>front=pendingNodes.poll();
			
			System.out.print(front.data+":");
			
			if(front.left!=null) {
				pendingNodes.add(front.left);
				System.out.print("L:"+front.left.data+",");
			}else {
				System.out.print("L:-1,");
			}
			
			 if(front.right!=null) {
				 pendingNodes.add(front.right);
				System.out.print("R:"+front.right.data);
			}else {
				System.out.print("R:-1");
			}
			 System.out.println();
		}
		
	}
		
	
	 public static  void printTree(BinaryTreeNode<Integer> root) {
		 if(root==null) {
			 return;
		 }
		 
		 String s=root.data+": ";
		 if(root.left!=null) {
			 s=s+"L"+root.left.data+", ";
		 }
		 if(root.left!=null) {
			 s=s+"R"+root.right.data+", ";
		 }
		System.out.println(s);
		printTree(root.left);
		printTree(root.right);
		 
	 }
	
	 public static  BinaryTreeNode<Integer> takeInput() {
		 System.out.println("Enter root data");
		 int data=in.nextInt();
		 if(data==-1) {
			 return null;
		 }
		 
		 BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(data);
		 Queue<BinaryTreeNode<Integer>> pendingNodes= new LinkedList<BinaryTreeNode<Integer>>();
	
		 pendingNodes.add(root);
		 
		 while(!pendingNodes.isEmpty()) {
			 BinaryTreeNode<Integer> frontNode = pendingNodes.poll();
			 
			 System.out.println("Enter the left child of: "+frontNode.data);
			 int leftChild=in.nextInt();
			 if(leftChild!=-1) {
				 BinaryTreeNode<Integer> child=new BinaryTreeNode<>(leftChild);
				 pendingNodes.add(child);
				 frontNode.left=child;
			 }
			 System.out.println("Enter the right child of: "+frontNode.data);
			 int rightChild=in.nextInt();
			 if(rightChild!=-1) {
				 BinaryTreeNode<Integer> child=new BinaryTreeNode<>(rightChild);
				 pendingNodes.add(child);
				 frontNode.right=child;
			 }
		 }
		 return root;
		 
	 }
	 
	//height of a node
	 public static int height(BinaryTreeNode<Integer> root) {
		 if(root==null) {
			 return 0;
		 }
	int	leftTree=height(root.left);
	int	rightTree=height(root.right);
		if(leftTree>rightTree) {
			return leftTree+1;
		}else {
			return rightTree+1;
		}
		 
	 }
	 
	
	 
	 public static int noOfLeafs(BinaryTreeNode<Integer> root) {
		 if(root==null) {
			 return 0;
		 }
		if(root.left ==null&&root.right==null) {
			return 1;
		}
		 int left=noOfLeafs(root.left);
		 int right=noOfLeafs(root.right);
		 return left+right;
	 }
	
	 public static void depth(BinaryTreeNode<Integer> root,int k) {
		 if(root==null) {
			 return;
		 }
		 if(k==0) {
			 System.out.println(root.data);
			 return;
		 }
		 depth(root.left,k-1);
		 depth(root.right,k-1);
		 
	 }
	 
	 public static void changeToDepthTree(BinaryTreeNode<Integer> root) {
		 if(root==null) {
			 return;
		 }
		 depthChange(root,0);
	 }
	 public static void depthChange(BinaryTreeNode<Integer> root,int depth) {
		 if(root==null) {
			 return;
		 }
		 root.data=depth;
		 depth(root.left,depth+1);
		 depth(root.right,depth+1);
		 
	 }
	public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {
		 if(root==null) {
			 return false;
		 }
		if(root.data==x) {
			return true;
		}else {
			return isNodePresent(root.left,x)||isNodePresent(root.right,x);
		}
		
	}
	
	public static void printNodesWithoutSibling(BinaryTreeNode<Integer> root) {
		 if(root==null) {
			 return;
		 }
		 if(root.left==null && root.right==null) {
			 return;
		 }
		 if(root.left==null) {
			 System.out.print(root.right.data+" ");
			 printNodesWithoutSibling(root.right);
		 }else if(root.right==null) {
			 System.out.print(root.left.data+" ");
			 printNodesWithoutSibling(root.left);
		 }else {
			 printNodesWithoutSibling(root.left);
			 printNodesWithoutSibling(root.right);
		 }
			 
	}
	
	public static void main(String[]args) {
		 BinaryTreeNode<Integer> root=takeInput();
		 printTreeLevelWise(root);
		 System.out.println("Total Nodes: "+numbNodes(root));
		 System.out.println("Largest Node: "+NodeWithLargestdata(root));
		 System.out.println(NodesGreaterThanX(root,2)); 
}
}
