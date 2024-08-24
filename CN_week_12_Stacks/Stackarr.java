package Stack_using_array;

public class Stackarr {
	private int data[];
	private int top;
	
	public Stackarr(int capacity) {
		data=new int[capacity];
		top=-1;
	}
	
	public boolean isEmpty() {
		if(top==-1) {
			return true;
		}else {
			return false;
		}
	}
	public void pop() {
		if(top==-1) {
			System.out.println("no element to pop");
		}else {
		int temp=data[top];
		System.out.println("popped element "+ temp );
		top--;
		}
	}
	public int size() {
		return top+1;
	}
	
	public void push(int ele) {
		if(top==size()-1) {
			int temp[]=data;
			data=new int[data.length*2];
		for(int i=0;i<temp.length;i++) {
			data[i]=temp[i];
		}
			
			
	}else {
		top++;
		data[top]=ele;
	}
	
	}
	
	public void peek() {
		if(top==-1) {
			System.out.println("please insert element" );
		}else {
		System.out.println("top most element is "+ data[top]);
		return;
	}
		}
	
}
