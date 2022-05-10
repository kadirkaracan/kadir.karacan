package validparantheses;

import java.util.*;

import javax.swing.text.ChangedCharSetException;

public class validParantheses {

	public static boolean validParantheses(String str) {
		Stack<Character>s= new Stack<Character>();
		//{ [ (
		for (char x:str.toCharArray()) {
			if (x=='{' ||  x=='[' || x=='(') {
				s.push(x);
			}
			else if (!s.empty() && (x==']' && s.peek() =='[' || x=='}' && s.peek() =='{' || x==')' && s.peek() =='(')) {
				s.pop();
			}
			else {
				return false;
			}
		}
		return s.isEmpty();
	}
		
	
			
		}

	


