package CN_week_9_recurrsion_2;

public class check_AB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abba";
		System.out.println(str.substring(1));
		boolean ans=cheackab(str);
		System.out.println(ans);
	}

	private static boolean cheackab(String str) {
		// TODO Auto-generated method stub
		if(str.charAt(0)!='a') {
			return false;
		}
		
		return check(str);
	}

	private static boolean check(String str) {
		// TODO Auto-generated method stub
		 if (str.length()==0) 
	        {
	            return true;
	        }
	        
	    	if (str.charAt(0) != 'a')
	        {
	            return false;
	        }
	        	
	    	if (str.length() >= 3 && str.substring(0,3).equals("abb"))
	        {
	            return check(str.substring(3));
	        }
	        else
	        {
	            return check(str.substring(1));
	        }
	        
		}

}
