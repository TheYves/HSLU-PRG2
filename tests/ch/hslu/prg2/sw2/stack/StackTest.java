package ch.hslu.prg2.sw2.stack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StackTest {

	private Stack<String> stack;

	@Before
	public void setUp() throws Exception {
		stack = new Stack<>();
	}

	@Test
	public void testPush() throws Exception {
		Assert.assertNull(stack.pop());
		stack.push("1");
		stack.push("2");
		stack.push("3");
		Assert.assertEquals(stack.pop(), "3");
		Assert.assertEquals(stack.pop(), "2");
		Assert.assertEquals(stack.pop(), "1");
		Assert.assertNull(stack.pop());
	}

	@Test
	public void testPop() throws Exception {
		Assert.assertNull(stack.pop());
		stack.push("1");
		stack.push("2");
		stack.push("3");
		Assert.assertEquals(stack.pop(), "3");
		Assert.assertEquals(stack.pop(), "2");
		Assert.assertEquals(stack.pop(), "1");
		Assert.assertNull(stack.pop());
	}

	@Test
	public void testIsEmpty() throws Exception {
		Assert.assertTrue(stack.isEmpty());
		stack.push("foo");
		Assert.assertFalse(stack.isEmpty());
		stack.pop();
		Assert.assertTrue(stack.isEmpty());
		stack.push("foo");
		Assert.assertFalse(stack.isEmpty());
	}

	@Test
	public void testIsFull() throws Exception {
		Assert.assertFalse(stack.isFull());
	}
}