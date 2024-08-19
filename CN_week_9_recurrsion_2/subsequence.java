package CN_week_9_recurrsion_2;

public class subsequence {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String str="xyz";
	String ans[]=sub(str);
	for(int i=0;i<ans.length;i++) {
		System.out.print(ans[i]+" ");
	}
	}
	public static String []sub(String str){
		if(str.length()==0) {
			String ans[]= {""};
			return ans;
		}
		String []small=sub(str.substring(1));
		String ans[]=new String[2*small.length];
		for(int i=0;i<small.length;i++) {
			ans[i]=small[i];
		}
		
		for(int i=0;i<small.length;i++) {
			ans[i+small.length]=str.charAt(0)+small[i];
		}
		return ans;
	}
	
}
