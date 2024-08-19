package CN_week_11_Linked_list;
import java.util.ArrayList;
import java.util.Scanner;

public class Node_use {
	
	
	public static Node<Integer> create() {
		
		Node<Integer> head=null;
		Node<Integer> tail=null;
		Scanner in =new Scanner(System.in);
		int data=in.nextInt();
		
		while(data!=-1) {
			Node<Integer>newnode=new Node<>(data);
			if(head==null) {
				head=newnode;
				tail=newnode;
			}else {
				tail.next=newnode;
				tail=tail.next;
				
			}
			data=in.nextInt();
		}
		return head;
	}
	
	public static void print(Node<Integer>head){
		
		while(head!=null) {
			System.out.print(head.data+" ");
			head=head.next;
		}
	}
		public static void printNode(Node<Integer>head,int i){
			if(head==null) {
				return;
			}
			Node<Integer>temp=head;
			while(temp!=null&&i>0) {
				i--;
				temp=temp.next;
				
			}
			if(temp!=null) {
			System.out.println(temp.data);
			}
	}
	
		public static Node<Integer> insert(Node<Integer>head,int pos,int data) { 
			Node<Integer>newnode=new Node<>(data);
			
			if(pos==0) {
				newnode.next=head;
				return newnode;
			}
			
			Node<Integer>temp=head;
			int i=0;
			while(i<pos-1) {
				temp=temp.next;
				i++;
			}
		
			newnode.next=temp.next;
			temp.next=newnode;
			
			return head;
		}

		public static Node<Integer> delete(Node<Integer>head,int pos) { 
			if(pos==0) {
				head=head.next;
				return head;
			}
			int i=0;
			
		

			 Node<Integer>temp=head;
			 Node<Integer>curr=head;
			while(i<pos-1) {
				curr=temp.next;
				if( curr.next==null) {
					return head;
				}
				temp=temp.next;
						i++;
			}
			
			if(curr.next==null) {
				temp.next=null;
			} 
			temp.next=curr.next;
			curr.next=null;
			return head;
			
		}
		public static int length(Node<Integer>head) {
			Node<Integer> temp=head;
			int count=1;
			while(temp.next!=null) {
				count++;
				temp=temp.next;
			}
			System.out.println(count);
			return count;
		}
		//3 4 5 2 6 1 9 -1
		public static int findnode(Node<Integer>head ,int n) {
			Node<Integer>temp=head;
			int count=0;
			while(temp!=null) {
				if(temp.data==n) {
					//System.out.println(count);
					return count;
				}else {
					count++;
				}
				temp=temp.next;
			}
			return -1;
		}
		
		public static Node<Integer> removeDuplicates(Node<Integer> head) {
			Node<Integer> temp = head;
			if(temp==null)
			{
				return null;
			}
			else if(temp.next==null)
			{
				return head;
			}
			while(temp!=null && temp.next!=null)
			{
				if((temp.data).equals(temp.next.data))
				{
					temp.next=temp.next.next;
				}
				else
				{
					temp=temp.next;
				}
						
			}
			
			return head;		
					
		}
		
		public static Node<Integer> reverse(Node head) {
			if(head==null) {
				return null;
			}
			if(head.next==null) {
			//System.out.println(head.data);
			return head;
			}
			Node<Integer> temp=head;
			Node<Integer> prev=null;
			
			while(temp!=null) {
				Node<Integer>front=temp.next;
				temp.next=prev;
				prev=temp;
				temp=front;
			}
			//front.next=prev;
			return prev;
			
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer>head=create();
		//Node<Integer>ans=removeDuplicates(head);
//		printNode(head,i);
//		head=insert(head,0,100);
//		head=delete(head,8);
//		length(head);
//		int ans=findnode(head,5);
//		System.out.println(ans);

		Node<Integer>head1=reverse(head);
 		print(head1);
		
		
	}

}
