package com.qaagility.controller;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator cal = new Calculator();
		assertEquals(9 ,cal.add());
	}

}
