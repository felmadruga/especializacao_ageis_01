package br.edu.uniritter.examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test() {
		assertEquals(2, new Calculator().add(1, 1));
	}

}
