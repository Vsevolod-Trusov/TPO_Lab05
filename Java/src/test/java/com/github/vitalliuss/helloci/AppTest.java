package com.github.vitalliuss.helloci;


import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Unit test for simple App.
 * @author vitali_shulha
 */
public class AppTest
{
	@Test
	public void whenGetAmountThenReturnAmountOTwoParameters() {
		Calculator calculator = new Calculator();
		assertEquals(5, calculator.getAmount(2, 3));
	}

	@Test
	public void whenGetDifferenceThenReturnDifferenceOTwoParameters() {
		Calculator calculator = new Calculator();
		assertEquals(-1, calculator.getDifference(2, 3));
	}

	@Test
	public void whenGetProductThenReturnProductOTwoParameters() {
		Calculator calculator = new Calculator();
		assertEquals(6, calculator.getProduct(2, 3));
	}

	@Test
	public void whenGetQuotientThenReturnQuotientOTwoParameters() {
		Calculator calculator = new Calculator();
		assertEquals(0.6666666666666666, calculator.getQuotient(2, 3), 0.0000000000000001);
	}

	@Test
	public void whenGetRemainderThenReturnRemainderOTwoParameters() {
		Calculator calculator = new Calculator();
		assertEquals(2, calculator.getRemainder(2, 3));
	}

	@Test(expected = IllegalArgumentException.class)
	public void whenGetQuotientThenThrowException() {
		Calculator calculator = new Calculator();
		calculator.getQuotient(2, 0);
	}
}