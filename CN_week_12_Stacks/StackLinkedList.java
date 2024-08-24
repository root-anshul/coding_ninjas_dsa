package Stack_using_LinkedList;

public class StackLinkedList<T> {
	private Node<T>head;
	private	int size; 
	
	public StackLinkedList() {
		head=null;
		size=0;
	}
	int size() {
		int count=0;
		Node<T> temp=head;
		while(temp!=null) {
			count++;
			temp=temp.next;
		}
		return count;
	}
	
	T top() {
		if(head==null) {
			System.out.println("No element found");
			return null ;
		}
		else {
			return head.data;
		}
	}
	boolean isEmpty() {
		if(head==null) {
			return true;
		}else {
			return false;
		}
	}
	
	T pop() {
		T temp=head.data;
		head=head.next;
		return temp;
	}
	void push(T ele) {
		Node<T> nn=new Node(ele);
		nn.next=head;
		head=nn;
		
	}



}
