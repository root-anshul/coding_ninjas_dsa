package CN_week_6_strings;

public class string_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abcdcba";
		
		int i=0;
		int j=str.length()-1;
		
		while(i<=j) {
			if(str.charAt(i)!=str.charAt(j)) {
				System.out.println(false);
				break;
			}
			else {
				System.out.println(true);
				
			}
			i++;
			j--;
		}
	
		
	}

}
