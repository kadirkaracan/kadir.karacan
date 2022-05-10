package validparantheses;

import java.util.Stack;

public class validParantheses {

	public static void main(String[] args) {
		
		public static boolean validParantheses(String str) {
			Stack<Character> s= new Stack <Character>();
			//{ [ (
			for(char x:str.toCharArray()) {
				if (x=="{" || x== "[" || x=="(") {
					s.push(x);
				}
				else if (!s.empty() && (x=="]" && s.peek()== "[" || x=="}" && s.peek() =="{" || x==")" &&  s.peek()=="(" )){
					s.pop();
				}
				else {
					return false
				}
			}
			return s.isEmpty();
			
		}

	}

}
