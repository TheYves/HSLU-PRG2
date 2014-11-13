package ch.hslu.prg2.sw7.addressbook;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddressEntryTest {

	AddressEntry entry;

	@Before
	public void setUp() throws Exception {
		entry = new AddressEntry();
	}

	@Test
	public void testSetGivenName() throws Exception {
		try {
			entry.setGivenName(null);
			fail();
		} catch(IllegalArgumentException ex) {
			assertEquals(IllegalArgumentException.class, ex.getClass());
		}
		try {
			entry.setGivenName("Fredy 1");
			fail();
		} catch(IllegalArgumentException ex) {
			assertEquals(IllegalArgumentException.class, ex.getClass());
		}
		try {
			entry.setGivenName("Fredy Super Test Mega");
			fail();
		} catch(IllegalArgumentException ex) {
			assertEquals(IllegalArgumentException.class, ex.getClass());
		}
		entry.setGivenName("Markus");
	}

	@Test
	public void testSetFamilyName() throws Exception {

	}

	@Test
	public void testSetZipCode() throws Exception {

	}

	@Test
	public void testSetResidence() throws Exception {

	}

	@Test
	public void testSetPhoneNumber() throws Exception {

	}

	@Test
	public void testSetEmailAddress() throws Exception {

	}
}