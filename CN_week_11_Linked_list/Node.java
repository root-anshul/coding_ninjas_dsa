package CN_week_11_Linked_list;

public class Node<T> {
	T data;
	Node<T>head;
	Node<T> next;
	
	Node(T data){
		this.data=data;
		this.next=null;
		
	}
}
