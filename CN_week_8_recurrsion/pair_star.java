package CN_week_8_recurrsion;

public class pair_star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abbbc";
		String ans=star(str);
		System.out.println(ans); 
	}

	private static String star(String str) {
		// TODO Auto-generated method stub
		String ans="";
		return print(str,0,1,ans)+str.charAt(str.length()-1);
	}

	private static String print(String str, int j, int i,String ans) {
		// TODO Auto-generated method stub
		if(i==str.length()) {
			return ans;
		}
		if(str.charAt(j)!=str.charAt(i)) {
			ans=ans+str.charAt(j);
		}
		if(str.charAt(j)==str.charAt(i)) {
			ans=ans+str.charAt(j)+"*";
		}
		return print(str,j+1,i+1,ans);
		
	}

}
