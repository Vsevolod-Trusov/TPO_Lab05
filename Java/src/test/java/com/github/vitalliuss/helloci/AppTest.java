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


	@Test(timeout = 1000)
	public void whenGetTanThenReturnTanOfParameter() {
		Calculator calculator = new Calculator();
		assertEquals(0.0, calculator.getTan(0), 0.0000000000000001);
	}

	@Test
	public void whenGetSinThenReturnSinOfParameter() {
		Calculator calculator = new Calculator();
		assertEquals(1.0, calculator.getSin(90), 0.0000000000000001);
	}

	@Test
	public void whenGetCosThenReturnCosOfParameter() {
		Calculator calculator = new Calculator();
		assertEquals(0.0, calculator.getCos(90), 0.0000000000000001);
	}

	@Test
	public void whenGetCtgThenReturnCtgOfParameter() {
		Calculator calculator = new Calculator();
		assertEquals(0.0, calculator.getCtan(90), 0.0000000000000001);
	}
}