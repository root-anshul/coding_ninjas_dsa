package CN_week_6_strings;

public class remove_occurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			String str= "aabccbaa";
			char c='a';
			
			String ans="";
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)!=c) {
					ans=ans+str.charAt(i);
				}
			}
			System.out.println(ans);
	}

}
