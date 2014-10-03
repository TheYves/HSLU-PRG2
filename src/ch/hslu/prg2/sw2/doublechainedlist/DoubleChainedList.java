package ch.hslu.prg2.sw2.doublechainedlist;

/**
 * Created by Yves on 26.09.2014.
 */
public class DoubleChainedList<T> {

	/**
	 * Das letzte Element in der Liste
	 */
	private DoubleChainedListNode<T> last;

	/**
	 * Das erste Element in der Liste.
	 */
	private DoubleChainedListNode<T> first;

	/**
	 * Zeigt immer auf das zuletzt ausgegebene Element (zu Beginn null).
	 */
	private DoubleChainedListNode<T> current;

	public DoubleChainedList() {

	}

	public void insert(T object) {
		DoubleChainedListNode<T> prev = last;
		last = new DoubleChainedListNode<>(object, prev);
		if(prev != null) {
			prev.setNext(last);
		}
		if (first == null) {
			first = last;
		}
	}

	public T getNext() {
		if(current == null && first != null) {
			current = first;
			return current.getObject();
		} else if(current != null && current.getNext() != null) {
			current = current.getNext();
			return current.getObject();
		}
		return null;
	}

	public T getPrevious() {
		if (current != null && current.getPrev() != null) {
			current = current.getPrev();
			return current.getObject();
		}
		return null;
	}

	public T getFirst() {
		if (first == null) {
			return null;
		}
		return first.getObject();
	}

	public T getLast() {
		if (last == null) {
			return null;
		}
		return last.getObject();
	}

	public void goToLast() {
		current = last;
	}

	public void goToFirst() {
		current = null;
	}
}
