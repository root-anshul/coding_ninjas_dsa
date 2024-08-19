package CN_week_9_recurrsion_2;

public class replace_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abcdaaa";
		char ch1='a';
		char ch2='x';
		String ans=replace(str,ch1,ch2);
		System.out.println(ans);
	}

	private static String replace(String str, char ch1, char ch2) {
		// TODO Auto-generated method stub
		if(str.length()==0) {
			return null;
		}
		String ans="";
		return replace(str,ch1,ch2,0,ans);
		
	}

	private static String replace(String str, char ch1, char ch2, int i,String ans) {
		// TODO Auto-generated method stub
		if(i==str.length()) {
			return ans;
		}
		if(str.charAt(i)==ch1) {
			ans=ans+ch2;
		}else {
			ans=ans+str.charAt(i);
		}
		return replace(str,ch1,ch2,i+1,ans);
	}

}
