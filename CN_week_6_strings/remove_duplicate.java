package CN_week_6_strings;

public class remove_duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="aaaa";
		
		String ans="";
		
		if(ans.isEmpty()) {
			ans=ans+str.charAt(0);
		}
		int j=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=ans.charAt(j)) {
				ans=ans+str.charAt(i);
				j++;
			}
		}
		System.out.println(ans);
	}

}
