package CN_week_9_recurrsion_2;

public class print_keypad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=23;
		printkeypad(num,"");
	}

	private static void printkeypad(int num,String output) {
		// TODO Auto-generated method stub
		if(num==0) {
			System.out.println(output);
			return;
		}
		String smallans[]=helper(num%10);
		for(int i=0;i<smallans.length;i++) {
			printkeypad(num/10, smallans[i]+output);
		}
		
		
	}
	
	private static String[] helper(int n) {
		 if(n<=1 || n>10){
	         System.exit(0);
	     }
		
			if(n==2) {
				return new String[]{"a","b","c"};
			}else if(n==3) {
				return new String[]{"d","e","f"};
			}else if(n==4) {
				return new String[]{"g","h","i"};
			}else if(n==5) {
				return new String[]{"j","k","l"};
			}else if(n==6) {
				return new String[]{"m","n","o"};
			}else if(n==7) {
				return new String[]{"p","q","r","s"};
			}else if(n==8) {
				return new String[]{"t","u","v"};
			}else {
				return new String[]{"w","x","y","z"};
			}
	}

	private static int keypad(String n) {
		// TODO Auto-generated method stub
		int res=0;
		
		for(int i=0;i<n.length();i++) {
			res=res*10+n.charAt(i)-'0';
		}
		
		return res;
	}

}
