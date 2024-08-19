package CN_week_9_recurrsion_2;

public class string_permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abc";
		String []ans=check(str);
		for(int i=0;i<ans.length;i++) {
			System.out.println(ans[i]);
		}
	}

	private static String[] check(String str) {
		// TODO Auto-generated method stub
		String[]ans=null;
		return helper(str,ans,0);
	}

	private static String[] helper(String str,String []ans,int i) {
		// TODO Auto-generated method stub
		if(i==str.length()-1) {
			return ans;
		}
		
		return null;
	}

}
