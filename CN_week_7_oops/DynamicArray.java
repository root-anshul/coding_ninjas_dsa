package CN_week_7_oops;

public class DynamicArray {
private int nextindex;
private int data[];

public DynamicArray(){
	nextindex=0;
	data=new int[5];
}

public void add(int ele) {
	if(nextindex==data.length) {
		restruct();
	}
	data[nextindex]=ele;
	nextindex++;
	
}

 public void restruct() {
	int temp[]=data;
	data=new int[data.length*2];
	for(int i=0;i<temp.length;i++) {
		data[i]=temp[i];
	}
}

public void set(int index, int ele) {
	 if(index>nextindex) {
		 return ;
	 }else if(index<nextindex) {
		 data[index]=ele;
	 }else {
		 data[index]=ele;
	 }
 }
 public int size() {
	 return nextindex;
 }
 public int removelast() {
	if(size()==0) {
		return -1;
	}
	 int value=data[nextindex-1];
	 data[nextindex-1]=0;
	 nextindex--;
	 return value;
 }
 public boolean isEmpty() {
	 if(size()==0) {
		 return true;
	 }else {
	 return false;
 }
	}

}
