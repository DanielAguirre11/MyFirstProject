package com.qaagility.controller;

import static org.junit.Assert.*;

import org.junit.Test;

public class CounterTest {

	@Test
	public void testSafeDivision() {
		Counter count = new Counter();
		assertEquals(Integer.MAX_VALUE,count.safeDivision(0, 0));
	}
	
	@Test
	public void testSafeDivisionNormal() {
		Counter count = new Counter();
		assertEquals(6/3,count.safeDivision(6, 3));
	}

}
