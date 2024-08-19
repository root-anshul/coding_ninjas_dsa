package CN_week_3;

import java.util.Scanner;

public class pat_3 {
	public static void main(String[]args) {
		Scanner in=new Scanner(System.in);
		int n=7;
		
		
//		int i=0;
//		while(i<n) {
//			int j=0;
//			while(j<n) {
//				System.out.print(n);
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
//		pat_4(n);
//		System.out.println("==============");
//		pat_5(n);
//		System.out.println("==============");
//		pat_6(n);
//		pat_7(n);
//		pat_8(n);
//		pat_9(n);
		//pat_10(n);
		//pat_11(n);
//		pat_12(n);
//		pat_13(n);
//		pat_14(n);
//		pat_15(n);
//		pat_16(n);
//		pat_17( n);
//		pat_18(n);
//		pat_19(n);
//		pat_20(n);
//		pat_21(n); 
//		pat_22( n);
//		pat_23( n);
//		pat_24( n);
//		pat_25( n);
		
	}
	
	public static void pat_4(int n) {
		int i=0;
		while(i<=n) {
			int j=1;
			while(j<=i) {
				System.out.print(j);
				j++;
			}
			System.out.println();
			i++;
		}
	}
	public static void pat_5(int n) {
		int i=1;
		while(i<=n) {
			int t=i;
			int j=1;
			while(j<=i) {
				System.out.print(t);
				t++;
				j++;
			}
			
			System.out.println();
			i++;
			
		}
	}
	public static void pat_6(int n) {
		int i=1;
		int t=1;
		while(i<=n) {
			int j=1;
			
			while(j<=i) {
				System.out.print(t);
				t++;
				j++;
			}
		
			System.out.println();
			i++;
		}
	}
	public static void pat_7(int n) {
		int i=1;
		while(i<n) {
			int j=1;
			while(j<=i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
	}
	public static void pat_8(int n) {
		int i=1;
		int t=1;
		while(i<=n) {
			int j=1;
			
			while(j<=i) {
				System.out.print(t);
				j++;
			}
			t++;
			System.out.println();
			i++;
			
		}
	}
	public static void pat_9(int n) {
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=i) {
				System.out.print(i-j+1);
				j++;
			}
			System.out.println();
			i++;
		}
	}
	public static void pat_10(int n) {
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=i) {
				System.out.print((char)('A'+i-1));
				j++;
			}
			System.out.println();
			i++;
		}
	}
	public static void pat_11(int n) {
		int i=1;
		while(i<=n) {
			int j=1;
			char ch=(char) ('A'+i-1);
			//System.out.println(ch);
			while(j<=i) {
				System.out.print(ch);
				ch=(char)(ch+1);
				j++;
			}
			System.out.println();
			i++;
		}
	}
	public static void pat_12(int n) {
		int i=1;
		while(i<=n) {
			int j=1;
			char ch=(char)('A'+n-i);
			while(j<=i) {
				System.out.print(ch);
				ch=(char)(ch+1);
				j++;
			}
			System.out.println();
			i++;
		}
	}
	public static void pat_13(int n) {
		int i=1;
		while(i<=n) {
			int j=1;
			char ch=(char)('A'+n-1);
			while(j<=i) {
				System.out.print(ch);
				ch=(char)(ch-1);
				j++;
			}
			System.out.println();
			i++;
		}
		
		
	}
	public static void pat_14(int n) {

		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=n-i) {
				System.out.print(" ");
				j++;
			}
			j=1;
			while(j<=i) {
			System.out.print("*");
				j++;
			}	
			System.out.println();
			i++;
		}
	}
	public static void pat_15(int n) {
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=n-i) {
				System.out.print(" ");
				j++;
			}
			j=1;
			while(j<=i) {
				System.out.print(j);
				j++;
			}
			System.out.println();
			i++;
		}
		
	}
	
	public static void pat_16(int n) {
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=n-i+1) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
			
		}
	}
	
	
	public static void pat_17(int n) {
		int i=1;
		while(i<=n) {
			
			int j=1;
			while(j<i) {
				System.out.print(" ");
				j++;
			}
			j=1;
			while(j<=n-i+1) {
				System.out.print("*");
				j++;
			}
			
			
			
			System.out.println();
			i++;
		}
	}
	
	
	public static void pat_18(int n) {
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=n-i+1) {
				System.out.print(n-i+1);
				j++;
			}
			System.out.println();
			i++;
		}
	}
	public static void pat_19(int n) {
		int i=1;
		while(i<=n) {
			int j=1;
			
			while(j<=n-i) {
				System.out.print(" ");
				j++;
			}
			j=1;
			while(j<=i) {
				System.out.print(j);
				j++;
			}
			j=1;
			int p=i-1;
			while(j<=i-1) {
				System.out.print(p);
				p--;
				j++;
			}
			System.out.println();
			i++;
		}
	}
	
	
	public static void pat_20(int n) {
		int i=0;
		while(i<n) {
			int j=0;
			while(j<n-i-1) {
				System.out.print(" ");
				j++;
			}
			j=0;
			while(j<2*i+1) {
				System.out.print("*");
				j++;
			}
			j=0;
			while(j<n-i-1) {
				System.out.print(" ");
				j++;
			}
			System.out.println();
			i++;
			
		}
	}
	public static void pat_21(int n) {
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=n-i) {
				System.out.print(" ");
				j++;
			}
			j=1;
			int p=i;
			while(j<=i) {
				System.out.print(p);
				p++;
				j++;
			}
			j=1;
			p=2*i-2;
			while(j<=2*i-2) {
			
				System.out.print(p);
				p--;
				j=j+2;
			}
			
			System.out.println();
			i++;
		}
	}
	
	
	
	public static void pat_22(int n) {
		int i=1;
		int n1=(n+1)/2;
		int n2=n1-1;
		while(i<=n1) {
			int j=1;
			while(j<=n1-i) {
				System.out.print(" ");
				j++;
			}
			j=1;
			while(j<=2*i-1) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		//System.out.print(i);
		i=n2;
		
		while(i>=1) {
			int j=1;
			while(j<=n2-i+1) {
				System.out.print(" ");
				j++;
			}
			j=1;
			while(j<=2*i-1) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i--;
		}
	}
	
	public static void pat_23(int n) {
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=i-1) {
				System.out.print(" ");
				j++;
			}
			j=1;
			while(j<=n) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
	}
	public static void pat_24(int n) {
		int i=1;
		int sum=0;
		while(i<=n) {
		
			int j=1;
			sum=sum+i;
			while(j<=i) {
				System.out.print(j);
				if(j==i) {
					System.out.print("=");
				}else {
					System.out.print("+");
				}
			j++;
			}
			System.out.print(sum);
			System.out.println();
			i++;
		}
	
	}
	public static void pat_25(int n) {
		System.out.print("*");
		System.out.println();
		for(int i=1;i<=2*n-1;i++) {
			System.out.print("*");
			if(i<=n) {
				for(int j=1;j<=i;j++) {
					System.out.print(j);
				}
				for(int j=i-1;j>=1;j--) {
					System.out.print(j);
				}
			}else {
				for(int j=1;j<=(2*n)-i;j++) {
					System.out.print(j);
				}
				for(int j=(2*n-1)-i;j>=1;j--) {
					System.out.print(j);
				}
			}
			System.out.print("*");

			System.out.println();
		}
//		System.out.println();
		System.out.print("*");		
	}

	
}
