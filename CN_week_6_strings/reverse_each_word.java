package CN_week_6_strings;

public class reverse_each_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hello world";
		int j=0;
		int l=0;
		String ans="";
		int i=0;
		for(;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				j=i-1;
				String reverseWord="";
				for(int k=l;k<=j;k++) {
					reverseWord=str.charAt(k)+reverseWord;
				}
				ans+=reverseWord+" ";
				l=i+1;
			}
		}
		j=i-1;
		String reverseWord="";
		for(int k=l;k<=j;k++) {
			reverseWord=str.charAt(k)+reverseWord;
		}
		ans+=reverseWord;
		System.out.println(ans);
		
	}
		
	}


