package CN_week_6_strings;

public class max_frequency_of_char {
	public static void main(String[] args) {
		String str="aabbbcccc";
		char ch='a';
		int count[]=new int[256];
		int max=0;
		for(int i=0;i<str.length();i++) {
			count[str.charAt(i)]++;
			max=Math.max(max, count[str.charAt(i)]);
			
		}	
		for(int i=0;i<count.length;i++) {
			if(count[i]==max) {
				ch=(char)i;
				break;
			} 
			
		}
		
		System.out.println(ch);
	
	}
}
