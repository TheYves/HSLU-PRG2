package ch.hslu.prg2.sw2.ringbuffer;

/**
 * Created by Yves on 26.09.2014.
 */
public class Ringbuffer {

	private String[] buffer;
	private int in = 0;
	private int out = 0;
	private int maxItems;
	private int count = 0;

	public Ringbuffer(int maxItems) {
		buffer = new String[maxItems];
		this.maxItems = maxItems;
	}

	public void enqueue(String item) {
		if(count < maxItems) {
			buffer[in] = item;
			count++;
			in = getNextIndex(in);
		}
	}

	public String dequeue() {
		if(count > 0) {
			String string = buffer[out];
			out = getNextIndex(out);
			count--;
			return string;
		}
		return null;
	}

	private int getNextIndex(int current) {
		current++;
		if(current == maxItems) {
			current = 0;
		}
		return current;
	}

	public boolean isEmpty() {
		return count == 0;
	}

	public boolean isFull() {
		return count == maxItems;
	}

}
