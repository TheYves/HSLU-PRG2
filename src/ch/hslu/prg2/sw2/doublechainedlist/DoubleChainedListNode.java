package ch.hslu.prg2.sw2.doublechainedlist;

/**
 * Created by Yves on 26.09.2014.
 */
class DoubleChainedListNode<T> {

	private T object;
	private DoubleChainedListNode<T> prev;
	private DoubleChainedListNode<T> next;

	public DoubleChainedListNode(T object, DoubleChainedListNode<T> previous) {
		this.object = object;
		this.prev = previous;
	}

	public T getObject() {
		return object;
	}

	public DoubleChainedListNode<T> getPrev() {
		return prev;
	}

	public void setPrev(DoubleChainedListNode<T> prev) {
		this.prev = prev;
	}

	public void setNext(DoubleChainedListNode<T> next) {
		this.next = next;
	}

	public DoubleChainedListNode<T> getNext() {
		return next;
	}
}
