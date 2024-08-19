package CN_week_11_Linked_list;

import java.util.Scanner;

public class middle_point {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Node<Integer> head=create();
		 Node<Integer>slow=middle(head);
		 System.out.println(slow.data);
		
		
	}
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
public static Node<Integer> middle(Node<Integer> head){
	Node<Integer>slow=head;
	Node<Integer>fast=head;
	if(head.next.next==null) {
		return head;
	}
	while(fast.next.next!=null && fast.next!=null ) {
		
		slow=slow.next;
		fast=fast.next.next;
		
	}
	return slow;
	
}
}
