package CN_week_14_Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class pratice {
	
	private static void printLevelWise( TreesNode<Integer> root) {
		String s=root.data+" ";
		System.out.println(s);
		
		QueueUsingLL<TreesNode<Integer>> pendingNode = new QueueUsingLL<>();
		pendingNode.enqueue(root);
		
		
		
		while(!pendingNode.isEmpty()) {
			TreesNode<Integer>frontNode=pendingNode.dequeue();
			
			
			for(int i=0;i<frontNode.children.size();i++) {
				pendingNode.enqueue(frontNode.children.get(i));
				System.out.print(frontNode.children.get(i).data+" ");
			}
			System.out.println();
		}
		
	}
	
	
	public static TreesNode<Integer> takeInput(){
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter root data");
		int rootdata=in.nextInt();
		
		TreesNode<Integer>root=new TreesNode<>(rootdata);
		QueueUsingLL<TreesNode<Integer>> pendingNode =new QueueUsingLL<>();
		pendingNode.enqueue(root);
		
		while(!pendingNode.isEmpty()) {
			
			TreesNode<Integer>frontNode=pendingNode.dequeue();
			
			System.out.println("Enter the child of "+frontNode.data);
			int numChild=in.nextInt();
			
			for(int i=0;i<numChild;i++) {
				System.out.println("Enter the "+(i+1)+"th number of node data " );
				int child=in.nextInt();
				
				TreesNode<Integer>childNode=new TreesNode<>(child);
				frontNode.children.add(childNode);
				pendingNode.enqueue(childNode);
			}
			
			
		}
		
		return root;
	}
	
	
	

	public static int sumofNodes(TreesNode<Integer> root) {
		int sum=0;
        Queue<TreesNode<Integer>> pendingNode= new LinkedList<>();
		pendingNode.add(root);
		sum=sum+root.data;
		
		
		while(!pendingNode.isEmpty()) {
			TreesNode<Integer>frontNode=pendingNode.poll();
			
			
			for(int i=0;i<frontNode.children.size();i++) {
				pendingNode.add(frontNode.children.get(i));
			sum=sum+frontNode.children.get(i).data;
			}
		
		}
		return sum;
	}
	
	private static void printrecc(TreesNode<Integer> root) {
		// TODO Auto-generated method stub
		String s=root.data+": ";
		for(int i=0;i<root.children.size();i++) {
			s=s+root.children.get(i).data+" ";
		}
		
		System.out.println(s);
		
		for(int i=0;i<root.children.size();i++) {
			printrecc(root.children.get(i));
		}
	}


	private static int biggestNode(TreesNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		
		int ans=root.data;
		
		for(int i=0;i<root.children.size();i++) {
			int largestChild =biggestNode(root.children.get(i));
			
			if(largestChild>ans) {
				ans=largestChild;
			}
		}
		return ans;
	}
	
	
	private static int numberOfNodes(TreesNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		int count=1;
		for(int i=0;i<root.children.size();i++) {
			count=count+numberOfNodes(root.children.get(i));
		}
		return count;
	}
	
	
	private static int biggerthanx(TreesNode<Integer> root,int x) {
		if(root==null) {
			return 0;
		}
		int count=0;
		if(root.data>x) {
			count++;
		}
		
		for(int i=0;i<root.children.size();i++) {
			count=count+biggerthanx(root.children.get(i),x);
			
		}
		return count; 
	}
	private static int heightOfTree(TreesNode<Integer> root) {
		if (root==null) {
			return 0;
		}
		int ans=0;
		for(int i=0;i<root.children.size();i++) {
				int childHeight=heightOfTree(root.children.get(i));
				ans=Math.max(ans, childHeight);
		}	
		return ans+1;
		
	}
	private static void depthOfTree(TreesNode<Integer> root,int k) {
		if(k<0) {
			return ;
		}
		if(k==0) {
			System.out.println(root.data);
		}
		for(int i=0;i<root.children.size();i++) {
			depthOfTree(root.children.get(i),k-1);
		}
	}
	
	private static int noOfLeafNodes(TreesNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		if(root.children.size()==0) {
			return 1;
		}
		int ans=0;
		for(int i=0;i<root.children.size();i++) {
			ans=ans+noOfLeafNodes(root.children.get(i));
					
		}
		return ans;
			
			//10 3 20 30 40 2 40 50 0 0 0 0 
	}
	
	private static boolean containXorNot(TreesNode<Integer> root,int x) {
		if(root==null) {
			return false;
		}
		if(root.data==x) {
			return true;
		}
		
		boolean ans=false;
		
		for(int i=0;i<root.children.size();i++) {
			ans=containXorNot(root.children.get(i),x);
		}
		return ans;
	}
	
	//pre-order traversal
	private static void preorder(TreesNode<Integer> root) {
		System.out.println(root.data+" ");
		for(int i=0;i<root.children.size();i++) {
			preorder(root.children.get(i));
		}
		
	}
	
	//post-order traversal
	private static void postorder(TreesNode<Integer> root) {
		for(int i=0;i<root.children.size();i++) {
			postorder(root.children.get(i));
		}
		System.out.println(root.data+" ");
	}
	
	
	public static int sum(TreesNode<Integer> root){
        int sum=root.data;
        for(int i=0;i<root.children.size();i++){
            sum+=root.children.get(i).data;
        }
        return sum;
    }
    
	public static TreesNode<Integer> maxSumNode(TreesNode<Integer> root){
		// Write your code here
        
        int sumRoot=sum(root);
        int max=Integer.MIN_VALUE;
        TreesNode<Integer> maxNode=null;
        for(int i=0;i<root.children.size();i++){
            TreesNode<Integer> maxNode1=maxSumNode(root.children.get(i));
            int sum=sum(maxNode1);
            if(sum>max){
                max=sum;
                maxNode=maxNode1;
            }
        }
        if(sumRoot>max){
            return root;
        }
        return maxNode;
	}
	
	public static void replaceWithDepthValue(TreesNode<Integer> root){
		
		
		depthofnode(root,0);
		
	}
	
	public static void depthofnode(TreesNode<Integer> root,int depth) {
		
		
		root.data=depth;
		
		for(int i=0;i<root.children.size();i++) {
			depthofnode(root.children.get(i),depth+1);
		}
	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreesNode<Integer>root= takeInput();
		System.out.println();
		replaceWithDepthValue(root);
		printrecc(root);
//		printLevelWise(root);
//		int ans=sumofNodes(root);
//		System.out.println(ans);
//		int ans= biggestNode(root);
//		System.out.println("Biggest Node is: "+ans);
//		int noOfnodes=numberOfNodes(root);
//		System.out.println("Number of Nodes is: "+noOfnodes);
//		depthOfTree(root,2);
//		TreesNode<Integer> ans=maxSumNode(root);
//		System.out.println(ans);
		
	}


}
