package CN_week_7_oops;

public class array {
	public static void main(String[]args) {
		DynamicArray d= new DynamicArray();
		
		for(int i=0;i<100;i++) {
			d.add(i);
		}
		
		System.out.println(d.size());
		d.set(98, 10000);
		
		while(!d.isEmpty()) {
			System.out.println("value ="+d.removelast());
			System.out.println("size = "+ d.size());
		}
		
	}
}
