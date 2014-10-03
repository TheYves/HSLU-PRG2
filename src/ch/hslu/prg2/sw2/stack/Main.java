package ch.hslu.prg2.sw2.stack;

/**
 * Created by Yves on 26.09.2014.
 */
public class Main {
	public static void main(String[] args){
		Stack<String> stack = new Stack<>();
		stack.push("Erster");
		stack.push("Zweiter");
		stack.push("Dritter");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}
