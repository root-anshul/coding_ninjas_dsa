package CN_week_11_Linked_list;

import java.util.Scanner;

public class merge_2_LL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Node<Integer> head1=create();
		 Node<Integer> head2=create();
//		 System.out.println(head1+" "+ head2 );
		 Node<Integer> ans=merge(head1,head2);
//		 System.out.println(ans);
		 print(ans);
		 
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

public static Node<Integer> merge(Node<Integer> head1, Node<Integer> head2){
	Node<Integer>l1=head1;
	Node<Integer>l2=head2;
	Node<Integer>dummynode=new Node<Integer>(-1);
	Node<Integer>temp=dummynode;

	
	while(l1!=null && l2!=null) {
		if(l1.data<l2.data) {
			temp.next=l1;
			temp=l1;
			l1=l1.next;
		
			
		}else  {
			temp.next=l2;
			temp=l2;
			l2=l2.next;
						
		}
	}
	if(l1!=null) {
		temp.next=l1;
	}else {
		temp.next=l2;
	}
	
	if(head1.data>head2.data) {
		return head2;
	}else {
		return head1;
	}
}
}
