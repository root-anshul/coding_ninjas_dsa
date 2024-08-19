package CN_week_6_strings;

public class count_words {
	public static void main(String[] args) {
		String str= "this is a sample string"; 
		int count=0;
		int i=0;
		StringBuilder sb =new StringBuilder();
		
		while(i <str.length()) {
			if(str.charAt(i)==' ') {
				count++;
			}
			i++;
		}
		System.out.println(count+1);
		
		
	}
}
