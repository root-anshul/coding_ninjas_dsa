package CN_week_13_queues;

public class QueueUse {
	public static void main(String[]args) {
		QueueUsingArray que=new QueueUsingArray();
		
		for(int i=1;i<=5;i++) {
			que.enqueue(i);
		}
		
		while(!que.isEmpty()) {
			System.out.println(	que.dequeue());
		
		}
	}
}
