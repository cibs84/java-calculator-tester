package org.lessons.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	private static Calculator calculator;
	private float result;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		calculator = new Calculator();
	}

	@Test
	@DisplayName("verifica metodo add()") 
	void testAdd() {
		result = calculator.add(6,3);
		assertEquals(9, result, "Il risultato deve essere 9");
	}
	
	@Test
	@DisplayName("verifica metodo subtract()") 
	void testSubtract() {
		result = calculator.subtract(6,3);
		assertEquals(3, result, "Il risultato deve essere 3");
	}
	
	@Test
	@DisplayName("verifica metodo divide()") 
	void testDivide() {
		result = calculator.divide(6,3);
		assertEquals(2, result, "Il risultato deve essere 2");
	}
	
	@Test
	@DisplayName("verifica metodo multiply()") 
	void testMultiply() {
		result = calculator.multiply(6,3);
		assertEquals(18, result, "Il risultato deve essere 18");
	}
}
