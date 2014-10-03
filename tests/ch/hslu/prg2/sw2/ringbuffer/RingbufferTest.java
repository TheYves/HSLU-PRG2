package ch.hslu.prg2.sw2.ringbuffer;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RingbufferTest {

	Ringbuffer buffer;

	@Before
	public void setUp() throws Exception {
		buffer = new Ringbuffer(3);
	}

	@Test
	public void testEnqueue() throws Exception {
		Assert.assertNull(buffer.dequeue());
		buffer.enqueue("1");
		buffer.enqueue("2");
		buffer.enqueue("3");
		buffer.enqueue("4");
		Assert.assertEquals("1", buffer.dequeue());
		Assert.assertEquals("2", buffer.dequeue());
		Assert.assertEquals("3", buffer.dequeue());
		Assert.assertNull(buffer.dequeue());
	}

	@Test
	public void testDequeue() throws Exception {
		Assert.assertNull(buffer.dequeue());
		buffer.enqueue("1");
		buffer.enqueue("2");
		buffer.enqueue("3");
		buffer.enqueue("4");
		Assert.assertEquals("1", buffer.dequeue());
		Assert.assertEquals("2", buffer.dequeue());
		Assert.assertEquals("3", buffer.dequeue());
		Assert.assertNull(buffer.dequeue());
	}

	@Test
	public void testRing() throws Exception {
		buffer.enqueue("1");
		buffer.enqueue("2");
		buffer.enqueue("3");
		buffer.dequeue();
		buffer.dequeue();
		buffer.enqueue("4");
		buffer.enqueue("5");
		Assert.assertEquals("3", buffer.dequeue());
		Assert.assertEquals("4", buffer.dequeue());
		Assert.assertEquals("5", buffer.dequeue());
		Assert.assertNull(buffer.dequeue());
	}

	@Test
	public void testIsEmpty() throws Exception {
		Assert.assertTrue(buffer.isEmpty());
		buffer.enqueue("1");
		Assert.assertFalse(buffer.isEmpty());
	}

	@Test
	public void testIsFull() throws Exception {
		Assert.assertFalse(buffer.isFull());
		buffer.enqueue("foo");
		buffer.enqueue("foo");
		buffer.enqueue("foo");
		Assert.assertTrue(buffer.isFull());
	}
}