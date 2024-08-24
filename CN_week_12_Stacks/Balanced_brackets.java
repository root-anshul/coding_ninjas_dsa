package Stack_using_LinkedList;

import java.util.Stack;

public class Balanced_brackets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=")()()(";	
		
		Stack<Character> stack=new Stack<>();
		for(int i=0;i<str.length();i++) {
		if(str.charAt(i)=='(') {
		stack.push(str.charAt(i));
		}
		if(str.charAt(i)==')') {
			stack.pop();
			}
	}
		if(stack.isEmpty()) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}

}
}