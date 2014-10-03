package ch.hslu.prg2.sw1.bank;

public class LinkedList<T extends IPrintable> {

	private ListNode<T> head;

	public LinkedList() {
	}

	public boolean isFound(T object) {
		ListNode<T> node = head;

		while (node != null) {
			if (node.getObject().equals(object)) {
				return true;
			}
			node = node.getNext();
		}
		return false;
	}

	public void insert(T object) {
		if (!isFound(object)) {
			ListNode<T> node = new ListNode<>(head, object);
			head = node;
		}
	}

	public void print() {
		ListNode<T> node = head;

		while (node != null) {
			node.getObject().print();
			node = node.getNext();
		}
	}

	public double getFund() {
		ListNode<T> node = head;
		double fund = 0;

		while (node != null) {
			fund += node.getObject().getSaldo();
			node = node.getNext();
		}

		return fund;
	}

	public int length() {
		ListNode<T> node = head;
		int count = 0;

		while (node != null) {
			count++;
			node = node.getNext();
		}

		return count;
	}

}
