package CN_week_6_strings;

public class compress_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="xxxxx";
		int count=1;
		int i=1;
		int j=0;
		String ans="";
		ans=ans+str.charAt(0);
		while(i<str.length()) {
			if(str.charAt(i)==ans.charAt(j)) {
				count++;
				i++;
			}
			else if(str.charAt(i)!=ans.charAt(j)){
				if(count>1) {
					ans=ans+count;
					count=1;
				}
				ans=ans+str.charAt(i);
				j=ans.length()-1;
				i++;
			}
		}
		if(count>1) {
		ans=ans+count;
		}
		System.out.println(ans);
		
	}

}
