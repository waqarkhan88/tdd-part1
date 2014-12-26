package com.sibisoft.tdd.training.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sibisoft.tdd.training.Dollar;
import com.sibisoft.tdd.training.Franc;

public class MoneyTest {

	@Test
	public void testMultiplication() {
		Dollar five= new Dollar(5);
		assertEquals(new Dollar(10), five.times(2));
		assertEquals(new Dollar(15), five.times(3));
	}
	
	@Test
	public void testEquality() {
		assertTrue(new Dollar(5).equals(new Dollar(5)));
		assertFalse(new Dollar(5).equals(new Dollar(6)));
		assertTrue(new Franc(5).equals(new Franc(5)));
		assertFalse(new Franc(5).equals(new Franc(6)));
	}
	
	@Test
	public void testFrancMultiplication() {
		Franc five= new Franc(5);
		assertEquals(new Franc(10), five.times(2));
		assertEquals(new Franc(15), five.times(3));
	}

}