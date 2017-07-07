package bndtest.sample.internal.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import bndtest.sample.internal.InternalThing;

public class InternalThingTest {
	
	@Test
	public void testInternal() {
		InternalThing t = new InternalThing();
		assertNotNull(t);
	}

}
