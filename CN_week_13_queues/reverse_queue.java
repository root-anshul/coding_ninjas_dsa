package CN_week_13_queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverse_queue {

	public static void reverseQueue(Queue<Integer> input,int k) {
		Stack<Integer> st = new Stack<>();
		int i=0;
		while(i<k) {
            st.push(input.remove());
            i++;
        }
		
		while(st.size()>0) {
			input.add(st.pop());
		}
		
		
	}
	
	
	public static void main(String[]args) {
		Queue<Integer> input=new LinkedList<>();
		int i=0;
		while(i<90) {
			input.add(i+10);
			i=i+10;
		}

		for (int element : input) {
            System.out.print(element+" ");
        }
		
		reverseQueue(input,4);
	}

	
	
}
