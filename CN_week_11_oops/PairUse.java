package CN_week_11_oops;

public class PairUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Pair<Integer,String> p= new Pair<>(10,"abc");
//		p.setfirst(300);
//		p.setsecond("ddd");
//		System.out.println(p.getsecond());
//		System.out.println(p.getfirst());
		
		Pair<Integer,String> p= new Pair<>();
		Pair<Pair<Integer,String> ,String> p1= new Pair<>();
		p1.setsecond("abcdef");
	}

}
