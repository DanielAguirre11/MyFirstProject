package com.qaagility.controller;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcmulTest {

	@Test
	public void testMul() {
		Calcmul cal = new Calcmul();
		assertEquals(18, cal.mul());
	}

}
