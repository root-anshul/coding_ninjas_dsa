package CN_week_6_strings;

public class permuntation_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="sinrtag";
		String str2= "string";
		if(str1.length()!=str2.length()) {
			System.out.println(false);
			return ;
		}
		
		int []count=new int[200];
		
		for(int i=0;i<str1.length();i++) {
		count[str1.charAt(i)]+=1;
		}
		
		for(int j=0;j<str2.length();j++) {
			count[str2.charAt(j)]-=1;
		}
		
		boolean ans=true;
		for(int i=0;i<count.length;i++) {
			if(count[i]!=0) {
				ans=false;
				System.out.println(ans);
				return;
			}
		}
		System.out.println(ans);

	}

}
