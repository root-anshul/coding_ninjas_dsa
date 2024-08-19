package CN_week_9_recurrsion_2;

public class print_subseq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abc";
		
		print(str,"");
	}

	private static void print(String str,String output) {
		// TODO Auto-generated method stub
		if(str.length()==0) {
			if(output.length()==0) {
			System.out.println("(blank space)"+output);
			}else {
				System.out.println(output);
			}
			return;
		
		}
		print(str.substring(1),output);
		print(str.substring(1),output+str.charAt(0));
	}

}
