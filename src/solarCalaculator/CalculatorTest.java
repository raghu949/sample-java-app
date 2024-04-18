package solarCalaculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void calciAddTest() {
				assertEquals(30,calculatorDev.sum(10, 20));
	}
	@Test
	public void calciSubTest() {
				assertEquals(-10,calculatorDev.subtract(10, 20));
	}
	@Test
	public void calciMulTest() {
				assertEquals(200,calculatorDev.multiply(10, 20));
	}
	@Test
	public void calciDivTest() {
				assertEquals(0,calculatorDev.divide(10, 20));
	}

}
