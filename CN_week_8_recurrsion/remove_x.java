package CN_week_8_recurrsion;

public class remove_x {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="xx";
		String ans=remove(str);
		System.out.println(ans);
	}

	private static String remove(String str) {
		// TODO Auto-generated method stub
		String ans="";
		return removex(str,0,ans);
		
	}

	private static String removex(String str, int i,String ans) {
		// TODO Auto-generated method stub
		if(i==str.length()) {
			return ans;
		}
		if(str.charAt(i)!='x') {
			ans=ans+str.charAt(i);
		}
		return removex(str,i+1,ans);
	}

}
