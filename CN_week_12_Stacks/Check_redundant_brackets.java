package CN_week_12_Stacks;

import java.util.Stack;

public class Check_redundant_brackets {
public static void main(String[]args) {
	Stack<Character>st=new Stack<>();
	String str="(x+y*(a-b))";
	int count=0;
	
	for(int i=0;i<str.length();i++) {
	if(str.charAt(i)==')') {
		while(st.peek()!='(') {
			st.pop();
			count++;
		}
		
		st.pop();
		
	}else {
		st.push(str.charAt(i));
	}
	
	}
	if(count>=1 || !st.isEmpty()) {
		System.out.println(true);
	}else {
		System.out.println(false);
	}
	
}
}
