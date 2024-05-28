package CollectionDemo;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		
		Stack<String> s = new Stack<String>();///LIFO
		s.push("abhay");
		s.push("mihika");
		s.push("mitansh");
		
		System.out.println(s);
		
		s.pop();//remove last object came should be removed
		System.out.println(s);
		
		System.out.println(s.peek());// return top of the stack element. if empty then give EmptyStackException
	
	}

}
