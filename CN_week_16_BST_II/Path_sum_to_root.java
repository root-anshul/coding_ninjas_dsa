package CN_week_16_BST_II;

public class Path_sum_to_root {
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

}
