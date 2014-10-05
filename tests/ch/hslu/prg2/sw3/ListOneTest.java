package ch.hslu.prg2.sw3;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class ListOneTest {

	private ListOne list;

	@Before
	public void setUp() throws Exception {
		list = new ListOne();
	}

	@Test
	public void testListOne() {
		Assert.assertEquals(0, list.size());
		Assert.assertEquals(false, list.exists(1));
		Assert.assertEquals(false, list.remove(new Integer(1)));
		Assert.assertEquals(false, list.removeValue(1));
		Assert.assertEquals(false, list.removeValues(1));

		list.add(1);
		list.add(1);
		list.add(2);

		Assert.assertEquals(3, list.size());
		Assert.assertEquals(true, list.removeValues(1));
		Assert.assertEquals(1, list.size());
		Assert.assertEquals(false, list.exists(1));
		Assert.assertEquals(true, list.exists(2));
	}
}