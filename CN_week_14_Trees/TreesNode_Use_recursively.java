package CN_week_14_Trees;

import java.util.Scanner;


//Taking input and printing it recursively 


public class TreesNode_Use_recursively {
	static Scanner in =new Scanner(System.in);
	
	public static TreesNode<Integer> takeInput(){
		
		System.out.println("Enter the data ");
		int n =in.nextInt();
		TreesNode<Integer>root= new TreesNode<Integer>(n);

		System.out.println("Enter the child count for "+n);
		int childcount =in.nextInt();
		for(int i=0;i<childcount;i++) {
			TreesNode<Integer>child= takeInput();
			root.children.add(child);
		}
		return root;
		
	}
	public static void print(TreesNode<Integer> root) {
		// TODO Auto-generated method stub
		String s= root.data + ": ";
		
		for(int i =0;i<root.children.size();i++) {
			s=s+root.children.get(i).data+", ";
		}
		System.out.println(s);
		for(int i=0;i<root.children.size();i++) {
			print(root.children.get(i));
		}
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreesNode<Integer>root=takeInput();
		
		print(root);
		
		
	}


	

}
