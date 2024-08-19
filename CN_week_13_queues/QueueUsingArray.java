package CN_week_13_queues;

public class QueueUsingArray {
	private int data[];
	int front;
	int rear;
	int size;
public QueueUsingArray(){
	data=new int[10];
	front=-1;
	rear=-1;
	size=0;
}

public QueueUsingArray(int capacity) {
	data=new int[capacity];
	front=-1;
	rear=-1;
	size=0;
}
int size(){
	 return size;
 }
 
boolean isEmpty() {
	return size==0;
}
int front() {
	if(front ==-1) {
		return -1;
	}else {
		return data[front];
	}
}

void enqueue(int ele) {
	
	if(size==data.length) {
		doublCapacity();
	}
	
	
	if(size==0) {
		front=0;
	}
	
	rear++;
	if(rear==data.length) {
		rear=0;
	}
	
	data[rear]=ele;
	size++;
}

//dynamic queue

private void doublCapacity() {
	// TODO Auto-generated method stub
	int temp[]=data;
	data= new int[2*temp.length];
	int idx=0;
	for(int i=0;i<temp.length;i++) {
		data[idx]=temp[i];
		idx++;
	}
	for(int i=0;i<=front-1;i++) {
		data[idx]=temp[i];
		idx++;
	}
	front =0;
	rear=temp.length-1;
	
}



int dequeue() {
	int temp=data[front];
	front++;
	if(front==data.length) {
		front=0;
	}
	size--;
	
	if(size==0) {
		front=-1;
		rear=-1;
	}
	
	return temp;
	
}


}















