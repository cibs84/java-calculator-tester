package org.lessons.java;

public class Calculator {
	public float add(float num1, float num2) {
		return num1 + num2;
	}

	public float subtract(float num1, float num2) {
		return num1 - num2;
	}

	public float divide(float num1, float num2) throws DivisionException {
		if (num1 == 0 && num2 == 0) {
			throw new DivisionException("0 : 0 restituisce un risultato indeterminato"); 
		} else if (num2 == 0){
			throw new DivisionException("Non è possibile dividere per zero");
		}
		return num1 / num2;
	}

	public float multiply(float num1, float num2) {
		return num1 * num2;
	}
}
