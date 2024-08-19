package CN_week_6_strings;

public class reverse_string {
	public static void main(String[]args) {
		String str= "the sky is blue";
		String ans=reverse(str);
		System.out.println(ans);
//		System.out.println(str.substring(0));
		
	}
	public static String reverse(String str) {
		int i=str.length()-1;
		String ans="";
		while(i>=0) {
			while(i>=0 && str.charAt(i)==' ') {
				i--;
			}
			int j=i;
			if(i<0) {
				break;
			}
			while(i>=0 && str.charAt(i)!=' ') {
				i--;
			}
			if(ans.isEmpty()) {
				ans=ans.concat(str.substring(i+1,j+1));
			}
			else {
				ans=ans.concat(" "+str.substring(i+1,j+1));
			}
			
			i--;
		}
		return ans;
	}
	
}
