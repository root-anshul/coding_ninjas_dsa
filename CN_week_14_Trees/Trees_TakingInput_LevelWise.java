package CN_week_14_Trees;

import java.util.Queue;
import java.util.Scanner;

import javax.swing.tree.TreeNode;

//taking input of number of child each node then moving forward

public class Trees_TakingInput_LevelWise {

	public static TreesNode<Integer> takeInput() {
		Scanner in =new Scanner (System.in);
		
		System.out.println("Enter root data");
		int rootdata=in.nextInt();
		
		QueueUsingLL<TreesNode<Integer>> pendingNodes = new QueueUsingLL<>();
		TreesNode<Integer> root = new TreesNode<Integer>(rootdata);
		pendingNodes.enqueue(root);
		
		while(!pendingNodes.isEmpty()) {
			TreesNode<Integer> frontNode= pendingNodes.dequeue();
			
			System.out.println("Enter the child of: "+frontNode.data);
			int numChild=in.nextInt();
			
			for(int i=0;i<numChild;i++) {
				System.out.println("Enter "+ (i+1) + "th child of node "+ frontNode.data);
				int child=in.nextInt();
				
				TreesNode<Integer> childNode = new TreesNode<>(child);
				frontNode.children.add(childNode);
				pendingNodes.enqueue(childNode);
				
			}
		}
		
		return root;
		
	}
	public static void main(String[]args) {
		TreesNode<Integer>root= takeInput();
		printrecc(root);
	}
	private static void printrecc(TreesNode<Integer> root) {
		// TODO Auto-generated method stub
		String s =root.data+": ";
		for(int i=0;i<root.children.size();i++) {
			s=s+root.children.get(i).data+" ";
		}
		System.out.println(s);
		
		for(int i=0;i<root.children.size();i++) {
			printrecc(root.children.get(i));
		}
		
	}
	
}
