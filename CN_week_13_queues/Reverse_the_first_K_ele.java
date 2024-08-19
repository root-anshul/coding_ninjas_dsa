package CN_week_13_queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Reverse_the_first_K_ele {
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
		System.out.println();
		System.out.println("======");
		Queue<Integer> ans=reverseQueue(input,4);
		System.out.println();
		for (int element : ans) {
            System.out.print(element+" ");
        }
	}

	private static Queue<Integer> reverseQueue(Queue<Integer> input, int k) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		Queue<Integer> ans=new LinkedList<>();
		int i=0;
		while(i<k) {
			st.push(input.remove());
			i++;
		}
		while(st.size()>0) {
			ans.add(st.pop());
		}
		while(input.size()>0) {
			ans.add(input.remove());
		}
		return ans;
	}
}
