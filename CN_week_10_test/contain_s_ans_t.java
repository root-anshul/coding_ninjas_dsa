package CN_week_10_test;

public class contain_s_ans_t {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abchjsgsuohhdhyrikkknddg";
		String t="coding";
		
		boolean ans=checkSeq(s,t);
		System.out.println(ans);
	}
	public static boolean checkSeq(String s, String t) {
		return checkSequence(s,t,0,0);	
		
	}
	private static boolean checkSequence(String s, String t, int sidx, int tidx) {
		// TODO Auto-generated method stub
		if(tidx==t.length()) {
			return true;
		}
		
		if(sidx==s.length()) {
			return false;
		}
		if(t.charAt(tidx)==s.charAt(sidx)) {
			return checkSequence(s,t,sidx+1,tidx+1);
		}else {
			return checkSequence(s,t,sidx+1,tidx);
		}
		
		
	}
}
