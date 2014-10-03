package ch.hslu.prg2.sw2.stack;

import java.util.ArrayList;

/**
 * Created by Yves on 26.09.2014.
 */
public class Stack<T> {

	private ArrayList<T> stack;

	public Stack() {
		stack = new ArrayList<>();
	}

	public void push(T object) {
		stack.add(object);
	}

	public T pop() {
		if (!isEmpty()) {
			return stack.remove(stack.size() - 1);
		} else {
			return null;
		}
	}

	public boolean isEmpty() {
		return stack.isEmpty();
	}

	public boolean isFull() {
		return false;
	}

}
