package CN_week_15_BinaryTrees;

public class QueueUsingLL<T> {
	Node<T> front;
	Node<T> rear;
	int size;
	
	public QueueUsingLL() {
		size=0;
	}
	
	int size() {
		return size;
	}
	
	boolean isEmpty() {
		return size==0;
	}
	
	T front() {
		if(size==0) {
			System.out.println("Queue is Empty");
		return null;
		}else {
			return front.data;
		}
	}
	
	void enqueue(T ele) {
		Node<T>nn=new Node<>(ele);
	
		
		if(size==0) {
			front=nn;
			rear=nn;
		}else {
			rear.next=nn;
			rear=nn;
		}
		size++;
		
	}
	
	T dequeue() {
		if(size==0) {
			System.out.println("Queue is Empty");
		return null;
		}
		
		T temp =front.data;
		front=front.next;
		
		if(size==1) {
			rear=null;
		}
		
		size--;
		return temp;
		
		
	}
}
	
	
	
	
	
	
	
