package ch.hslu.prg2.sw1.bank;

public class ListNode<T extends IPrintable> {

	private T object;
	private ListNode<T> next;

	public ListNode(ListNode<T> next, T object) {
		this.object = object;
		this.next = next;
	}

	public T getObject() {
		return object;
	}

	public ListNode<T> getNext() {
		return next;
	}

	public void setObject(T object) {
		this.object = object;
	}

	public void setNext(ListNode<T> next) {
		this.next = next;
	}

}
