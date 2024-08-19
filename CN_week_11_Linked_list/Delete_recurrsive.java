package CN_week_11_Linked_list;

public class Delete_recurrsive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node_use obj =new Node_use();
		Node<Integer> head=obj.create();
		//Node<Integer> del=delete(head,10);
		Node<Integer> delrec=deleterec(head,5);
		obj.print(delrec);
	}

	private static Node<Integer> deleterec(Node<Integer> head, int pos) {
		
		if(pos==0) {
	Node<Integer> temp=new Node<Integer>(-1);
		temp=head.next;
		head.next=null;
		return temp;
		}
		if(head==null|| head.next==null) {
			return head;
		}
		Node<Integer> temp=deleterec(head.next,pos-1);
		head.next=temp;
		return head;
	}

//	private static  Node<Integer> delete(Node<Integer> head, int pos) {	
//		Node<Integer>prev=head;
//		Node<Integer>temp=head;
//		
//		for(int i=0;i<pos-1;i++) {
//			if(temp==null||temp.next==null) {
//				return head;
//			}
//			temp=temp.next;
//		}
//		prev=temp;
//		temp=temp.next;
//		prev.next=temp.next;
//		temp=temp.next;
//		return head;
//	
//	}

}
