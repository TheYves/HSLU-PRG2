package ch.hslu.prg2.sw2.doublechainedlist;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class DoubleChainedListTest {

	private DoubleChainedList<String> list;

	@Before
	public void setUp() throws Exception {
		list = new DoubleChainedList<>();
	}

	@Test
	public void testInsert() throws Exception {
		list.insert("foo");
		Assert.assertEquals("foo", list.getFirst());
	}

	@Test
	public void testGetNext() throws Exception {
		list.insert("foo");
		list.insert("bar");
		Assert.assertEquals("foo", list.getNext());
		Assert.assertEquals("bar", list.getNext());
		Assert.assertNull(list.getNext());
	}

	@Test
	public void testGetPrevious() throws Exception {
		Assert.assertNull(list.getPrevious());
		list.insert("foo");
		list.insert("bar");
		Assert.assertNull(list.getPrevious());
		list.goToLast();
		Assert.assertNull(list.getNext());
		Assert.assertNull(list.getNext());
		Assert.assertNull(list.getNext());
		Assert.assertEquals("foo", list.getPrevious());
		Assert.assertNull(list.getPrevious());
	}

	@Test
	public void testGetFirst() throws Exception {
		list.insert("foo");
		list.insert("bar");
		Assert.assertEquals("foo", list.getFirst());
	}

	@Test
	public void testGetLast() throws Exception {
		list.insert("foo");
		list.insert("bar");
		Assert.assertEquals("bar", list.getLast());
	}

	@Test
	public void testGoToFirst() throws Exception {
		list.insert("foo");
		list.insert("bar");
		Assert.assertEquals("foo", list.getNext());
		list.goToFirst();
		Assert.assertEquals("foo", list.getNext());
		Assert.assertEquals("bar", list.getNext());
	}

	@Test
	public void testGoToLast() throws Exception {
		list.insert("foo");
		list.insert("bar");
		list.insert("muh");
		list.goToLast();
		Assert.assertNull(list.getNext());
	}
}