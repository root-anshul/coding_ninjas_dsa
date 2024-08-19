package CN_week_2Darrays;

import java.util.ArrayList;

public class query_and_mat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][]= {{0,0,0},
					  {0,0,0},
					  {0,0,0}};
		int n=3;
		int m=3;
		int count=0;
	
		String[]str= {"2C1","1R1","1R1","2R1"};
		//System.out.println(str.length);
		
		ArrayList<Integer> ans=new ArrayList<>();
		//System.out.println(ans.size());
		for(int i=0;i<str.length;i++) {
			String s=str[i];
				
				if(s.charAt(0)=='1') {
					if(s.charAt(1)=='R') {
						for(int j=0;j<n;j++) {
							if(arr[s.charAt(2)-'0'][j]==1) {
								arr[s.charAt(2)-'0'][j]=0;
							}else {
							arr[s.charAt(2)-'0'][j]=1;
						}
					}
					}else if(s.charAt(1)=='C') {
						for(int j=0;j<m;j++) {
							if(arr[j][s.charAt(2)-'0']==1) {
								arr[j][s.charAt(2)-'0']=0;
							}else {
							arr[j][s.charAt(2)-'0']=1;
							}
						}
					}
				
				}
				
				else if(s.charAt(0)=='2') {
				
					
					if(s.charAt(1)=='C') {
						for(int j=0;j<m;j++) {
							if(arr[j][s.charAt(2)-'0']==0) {
								count++;
							}
							
						}
						
							ans.add(count);
							count=0;
							
					}else if(s.charAt(1)=='R') {
						for(int j=0;j<n;j++) {
							if(arr[s.charAt(2)-'0'][j]==0) {
								count++;
							}
						}
						
							ans.add(count);
							count=0;
					}
				}
				
			}
		int[] res = new int[ans.size()];
	    for (int i=0; i < res.length; i++)
	    {
	        res[i] = ans.get(i).intValue();
	    }
	    for (int i=0; i < res.length; i++) {
	    	System.out.println(res[i]);
	    }
//	    return res;
		}
		
	

}           
