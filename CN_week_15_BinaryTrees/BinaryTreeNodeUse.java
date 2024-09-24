package CN_week_15_BinaryTrees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import CN_week_14_Trees.BinaryTreeNode;
import CN_week_14_Trees.QueueUsingLL;

public class BinaryTreeNodeUse {
	
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
	}
	
	public static boolean isBalanced(BinaryTreeNode<Integer> root){
		if(root==null) {
			return true;
		}
		
		int left=height(root.left);
		int right=height(root.right);
		
		if(Math.abs(left-right)>1) {
			return false;
		}
		
		boolean leftTree=isBalanced(root.left);
		boolean righTree=isBalanced(root.right);
		
		return leftTree && righTree;
	}
	
	private static int height(BinaryTreeNode<Integer> root) {
		// TODO Auto-generated method stub
		if(root==null) {
			return 0;
		}
		int left=height(root.left);
		int right=height(root.right);
		
		return 1+ Math.max(left, right);
		
	}

	public static BinaryTreeNode<Integer> removeLeafNodes(BinaryTreeNode<Integer> root){
		if(root==null) {
			return null;
		}
		if(root.left==null && root.right==null) {
			return null;
		}
		
		root.left=removeLeafNodes(root.left);
		root.right=removeLeafNodes(root.right);
		
		return root;
	}
	
	public static int diameter(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		int option1 = height(root.left)+height(root.right);
		int option2 = diameter(root.left);
		int option3= diameter(root.right);
		
		int max= Math.max(option1, Math.max(option2, option3));
		return max;
		
	}
	
	public static Pair<Integer,Integer> diameterBetter(BinaryTreeNode<Integer> root){
		if(root==null) {
			Pair<Integer,Integer> output=new Pair<>();
			output.first=null;
			output.second=null;
			return output;
		}
		Pair<Integer,Integer> lo=diameterBetter(root.left);
		Pair<Integer,Integer> ro=diameterBetter(root.right);
		
		int height= 1+ Math.max(lo.first, ro.first);
		int option1=lo.first+ro.first;
		int option2=lo.second;
		int option3=ro.second;
		int diameter=Math.max(option1, Math.max(option2, option3));
		
		Pair<Integer,Integer>ans=new Pair<>();
		ans.first=height;
		ans.second=diameter;
		
		return ans;
		
	}
	public static void mirrorBinaryTree(BinaryTreeNode<Integer> root){
		
		if(root==null) {
			return;
		}
		
		BinaryTreeNode<Integer> temp=root.left;
		root.left=root.right;
		root.right=temp;
		
		mirrorBinaryTree(root.left);
		mirrorBinaryTree(root.right);
		
	}
	public static void preOrder(BinaryTreeNode<Integer> root) {
		
		if(root==null) {
			return;
		}
		
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
		
	
	}
	public static void postOrder(BinaryTreeNode<Integer> root) {

		if(root==null) {
			return;
		}
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
		
	}
	public static void inOrder(BinaryTreeNode<Integer> root) {
		
		if(root==null) {
			return;
		}
		
		postOrder(root.left);
		System.out.print(root.data+" ");
		postOrder(root.right);
		
		
	}
	
	public static BinaryTreeNode<Integer> buildTreeHelper(int in[],int pre[],int inS,
			int inE,int preS,int preE ){
		if(inS> inE) {
			return null; 
		}
		int rootdata=pre[preS];
		int rootInIndex=-1;
		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(rootdata);
		
		for(int i=inS;i<=inE;i++) {
			if(in[i]==rootdata) {
				rootInIndex=i;
				break;
			}
		}
		
		if(rootInIndex==-1) {
			return null;
		}
		
		int leftinS=inS;
		int leftinE=rootInIndex-1;
		int leftpreS=preS+1;
		int leftpreE=leftinE-leftinS+leftpreS;
		int rightinS=rootInIndex+1;
		int rightinE=inE;
		int rightpreS=leftpreE+1;
		int rightpreE=preE;
		
		root.left=buildTreeHelper(in,pre,leftinS,leftinE,leftpreS,leftpreE);
		root.right=buildTreeHelper(in, pre, rightinS, rightinE, rightpreS, rightpreE);
		return root;
	}
	

		public static BinaryTreeNode<Integer> buildTreePostin(int[] postOrder, int[] inOrder) {
			//Your code goes here
	        BinaryTreeNode<Integer> root = buildTree(postOrder, inOrder, 0 ,postOrder.length-1, 0, inOrder.length-1);
	    	return root;
		}
	    
	    public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder,int siPost, int eiPost, int siIn, int eiIn) {
			// TODO Auto-generated method stub
	    	
	    	//Base case - If number of elements in the post-order is 0
	    	if (siPost>eiPost)
	    	{
	    		return null;
	    	}
	    	
	    	//Defining the root node for current recursion
	    	int rootData=postOrder[eiPost];
	    	BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
	    	
	    	//Finding root data's location in Inorder (Assuming root data exists in Inorder)
	    	int rootIndex=-1;
	    	for (int i=siIn;i<=eiIn;i++)
	    	{
	    		if (rootData==inOrder[i])
	    		{
	                rootIndex=i;
	    			break;
	    		}
	    	}
	    	    	
	    	//Defining index limits for Left Subtree Inorder
	    	int siInLeft=siIn;
	    	int eiInLeft=rootIndex-1;
	    	
	    	//Defining the index limits for Left Subtree Preorder
	    	int siPostLeft=siPost;
	    	int leftSubTreeLength = eiInLeft - siInLeft + 1;
	    	int eiPostLeft=(siPostLeft)+(leftSubTreeLength-1);
	    	
	    	//Defining index limits for Right Subtree Inorder
	    	int siInRight=rootIndex+1;
	    	int eiInRight=eiIn;
	    	
	    	//Defining index limits for Right Subtree Preorder
	    	int siPostRight=eiPostLeft+1;
	    	int eiPostRight=eiPost-1;
	    	
	        BinaryTreeNode<Integer> rightChild = buildTree(postOrder, inOrder, siPostRight, eiPostRight, siInRight, eiInRight);
	    	BinaryTreeNode<Integer> leftChild = buildTree(postOrder, inOrder, siPostLeft, eiPostLeft, siInLeft, eiInLeft);
	    	
	    	root.left=leftChild;
	    	root.right=rightChild;
	    	return root;
		}
	    
	    
	    public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
			//Your code goes here
	        if (root==null)
	            return;

	        BinaryTreeNode<Integer> duplicateNode = new BinaryTreeNode<Integer>(root.data);
	        //duplicateNode.data=root.data;
	        BinaryTreeNode<Integer> temp=root.left;
	        root.left=duplicateNode;
	        duplicateNode.left=temp;
	        insertDuplicateNode(root.left.left);
	        insertDuplicateNode(root.right);
	        
		}
	    
//	    private static Pair<Integer,Integer> maxMin=new Pair<Integer,Integer>(Integer.MAX_VALUE,Integer.MIN_VALUE);

//		public static Pair<Integer,Integer> getMinAndMax(BinaryTreeNode<Integer> root) {
			//Your code goes here
//	        getMinAndMaxHelper(root);
//	        return maxMin;     
	        
	        
//		}
	    
//	    private static void getMinAndMaxHelper(BinaryTreeNode<Integer> root)
//	    {
//	        if (root==null)
//	        {
//	            return;
//	        }
//	        
//	        int rootData=root.data;
//	        int maxVal=maxMin.maximum;
//	        if (rootData>maxVal)
//	        {
//	            maxMin.maximum=root.data;
//	        }
//	        
//	        int minVal=maxMin.minimum;
//	        if (rootData<minVal)
//	        {
//	            maxMin.minimum=root.data;
//	        }
//	        getMinAndMaxHelper(root.left);
//	        getMinAndMaxHelper(root.right);
//	    }
	
	
	public static BinaryTreeNode<Integer> buildTree(int in[],int pre[]){
		return buildTreeHelper(in,pre,0,in.length-1,0,pre.length-1);
	}
	
	
	public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
		//Your code goes here
        String arr="";
        rootToLeafPathsSumToK(root,k,arr);
	}
    
    public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k,String arr)
    {
        if (root==null)
        {
            return;
        }
        
        int rootData=root.data;
        //System.out.println("Root data: "+rootData);
        //System.out.println("k: "+k);
        //System.out.println("Old Arraylist: "+arr);
        arr=arr+rootData+" ";
        if(k==rootData && root.left==null && root.right==null)
        {
            //System.out.print("Path found: ");
            //for (int i=0;i<arr.length();i++)
               //System.out.print(arr.charAt(i)+" ");
            //System.out.println();
            System.out.println(arr);
            return;
        }
        //System.out.println();
        
        rootToLeafPathsSumToK(root.left,k-rootData,arr);
        rootToLeafPathsSumToK(root.right,k-rootData,arr);
    }
    public static void nodesAtDistanceK(BinaryTreeNode<Integer> root, int node, int k) {
	    //Your code goes here
        print(root,node,k);
        
        
	}
    
    private static int print(BinaryTreeNode<Integer> root, int node, int k)
    {
        //If tree is empty return -1
        if (root==null)
            return -1;
        
        int rootData=root.data;
        if (rootData==node)
        {
            printNodesAtDistanceK(root, k);
            return 0;
        }
        
        int leftSubTreeDist=0,rightSubTreeDist=0;
        
        leftSubTreeDist=print(root.left,node,k);
        if (leftSubTreeDist!=-1)
        {
            if(leftSubTreeDist+1==k)
            {
                System.out.println(rootData);
            }
            else
            {
                rightSubTreeDist=k-(leftSubTreeDist+1)-1;
                printNodesAtDistanceK(root.right, rightSubTreeDist);
            }
            return leftSubTreeDist+1;
        }
        
        rightSubTreeDist=print(root.right,node,k);
        if (rightSubTreeDist!=-1)
        {
            if(rightSubTreeDist+1==k)
            {
                System.out.println(rootData);
            }
            else
            {
                leftSubTreeDist=k-(rightSubTreeDist+1)-1;
                printNodesAtDistanceK(root.left, leftSubTreeDist);
            }
            return rightSubTreeDist+1;
        }
        return -1;
    }
    
    private static void printNodesAtDistanceK(BinaryTreeNode<Integer> root, int k)
    {
        if (root==null || k<0)
        	return;
        
        if (k == 0)  
        { 
            System.out.println(root.data); 
            return; 
        }
        
        printNodesAtDistanceK(root.left,k-1);
        printNodesAtDistanceK(root.right,k-1);
    }
	public static boolean searchInBST(BinaryTreeNode<Integer> root, int k) {
		if(root==null){
			return false;
		}
		if(root.data==k){
		return true;
		}

	if(root.data>k){
		return searchInBST(root.left,k);
	}
	 else if(root.data<k){
		return searchInBST(root.right,k);
	}
	else{
		return false;
	}
	}
	private static ArrayList<Integer> arr = new ArrayList<Integer>();
    
    public static void elementsInRangeK1K2(BinaryTreeNode<Integer> root,int k1,int k2)
    {
        elementsInRangeK1K2Helper(root,k1,k2);
        Collections.sort(arr);
        for (int i:arr)
            System.out.print(i+" ");
    }
	public static void elementsInRangeK1K2Helper(BinaryTreeNode<Integer> root,int k1,int k2){
        
        //Base case - if root=null
        if (root==null)
            return;
        
        int rootData=root.data;
        if (rootData<k1)
        {
            elementsInRangeK1K2Helper(root.right,k1,k2);
        }
        else if (rootData>k2)
        {
            elementsInRangeK1K2Helper(root.left,k1,k2);
        }
        else
        {
            //System.out.print(rootData+" ");
            arr.add(rootData);
            elementsInRangeK1K2Helper(root.right,k1,k2);
            elementsInRangeK1K2Helper(root.left,k1,k2);
        }
		
	}
	
	public static boolean isBST(BinaryTreeNode<Integer> root) {

		if (root==null) {
            return true;
		}
		
		int leftmax=maximum(root.left);
		int rightmin=minimum(root.right);
		
		if(root.data<=leftmax) {
			return false;
		}
		if(root.data>rightmin) {
			return false;
		}
		
		boolean isLeftBST=isBST(root.left);
		boolean isRightBST=isBST(root.right);
		
		if(isLeftBST && isRightBST) {
			return true;
		}else {
			return false;
		}
		
	}


	private static int minimum(BinaryTreeNode<Integer> root) {
		// TODO Auto-generated method stub
		int min=Integer.MAX_VALUE;
		if(root==null) {
			return min;
		}
		int left=minimum(root.left);
		int right=minimum(root.right);
		
		min=Math.min(root.data, Math.min(left, right));
		return min;
	}

	private static int maximum(BinaryTreeNode<Integer> root) {
		// TODO Auto-generated method stub
		int max=Integer.MIN_VALUE;
		if(root==null) {
			return max;
		}
		int left=maximum(root.left);
		int right=maximum(root.right);
		
		max=Math.max(root.data, Math.max(left, right));
		return max;
	}

	
	public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr){
		if(arr.length==1) {
			BinaryTreeNode<Integer>root=new BinaryTreeNode<>(arr[0]);
			return root;
		}
		return helperArrayToBST(arr,0,arr.length-1);
	}
	
	private static BinaryTreeNode<Integer>  helperArrayToBST(int[] arr,int si,int ei){
		  if(si>ei) {
	            return null;
		  }
		if(arr.length==0) {
			return null;
		}
		
		int mid =(si+ei)/2;
		
		BinaryTreeNode<Integer>root=new BinaryTreeNode<>(arr[mid]);
		root.left =helperArrayToBST(arr,si,mid-1);
		
		root.right=helperArrayToBST(arr,mid+1,ei);
		return root;
		

		
	}

	
	
	
	public static void main(String []args) {
		
	}
}













