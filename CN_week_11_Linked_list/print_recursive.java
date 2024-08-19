package CN_week_11_Linked_list;

public class print_recursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node_use obj =new Node_use();
		Node<Integer> head=obj.create();
		print(head);
	}

	private static void print(Node<Integer> head) {
		Node<Integer>temp=head;
		if(temp==null) {
			return;
		}
		print(temp.next);
		System.out.print(temp.data+" ");
	}

}
