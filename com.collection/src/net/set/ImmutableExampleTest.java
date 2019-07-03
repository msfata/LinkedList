package net.set;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class ImmutableExampleTest {

	@Test
	void test() {
		ImmutableExample ie = new ImmutableExample("Hi How Are You?");
		assertEquals(ie.getMessage(), "Hi How Are You?");
	}

}
