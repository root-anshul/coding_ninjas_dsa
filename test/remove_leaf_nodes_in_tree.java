package CN_week_16_Assignment.test;

public class remove_leaf_nodes_in_tree {


		/*	TreeNode structure 
		 * 
		 * class TreeNode<T> {
			T data;
			ArrayList<TreeNode<T>> children;

			TreeNode(T data){
				this.data = data;
				children = new ArrayList<TreeNode<T>>();
			}
		}*/

		public static TreeNode<Integer> removeLeafNodes(TreeNode<Integer> root) {
			/* Your class should be named Solution
			 * Don't write main().
			 * Don't read input, it is passed as function argument.
			 * Return output and don't print it.
		 	 * Taking input and printing output is handled automatically.
			*/
					if(root==null){
						return null;
					}		
					if(root.children.size()==0){
						return null;
					}

				for(int i=0;i<root.children.size();i++){
					TreeNode<Integer>child= root.children.get(i);

					if(child.children.size()==0){
						for(int j=i;j<root.children.size()-1;j++){
							root.children.set(j,root.children.get(j+1));

							root.children.remove(root.children.size()-1);
							i--;
						}
					}
					for(int i=0;
					i<root.children.size();
					i++){
						root.children.set(i,removeLeafNodes(root.children.get(i)));
					}
					return root;
				}
				public static void printTheTree(TreeNode<Integer>root){
					if(root==null){
						return ;
					}
					System.out.print(root.data+" :");
					for(int i=0;i<root.children.size();i++)
					System.out.print(root.children.get(i).data+" ");
									System.out.println();
					for(int i=0;i<root.children.size();i++)
						printTheTree(root.children.get(i));

		}
	
		
}
}
