package CN_week_11_Linked_list;

public class merge_sort_LL {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node_use obj = new Node_use();
		Node<Integer>head=obj.create();
		
		obj.print(ms(head));
		
		
	}
	
	public static Node<Integer> 
	middlepoint(Node<Integer>head){
		Node<Integer>slow=head;
		Node<Integer>fast=head.next;
		
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		//System.out.println(slow.data);
		return slow;
	}
	
	public static Node<Integer> ms( Node<Integer> head){
		if(head == null||head.next==null) {
			return head;
		}
		 Node<Integer> middle=middlepoint(head);
		 Node<Integer> right=middle.next;
		 middle.next =null;
		 Node<Integer>left=head;
		 left=ms(left);
		 right=ms(right);
		 return mergelist(left,right);
				 
	}

	public static Node<Integer> mergelist(Node<Integer> l1, Node<Integer> l2) {
		// TODO Auto-generated method stub
		Node<Integer> dummynode=new Node<Integer>(-1);
		Node<Integer> temp =dummynode;
		
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
		
		
		return dummynode.next;
	}
	
	

}
