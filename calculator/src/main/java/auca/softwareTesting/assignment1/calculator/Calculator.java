package auca.softwareTesting.assignment1.calculator;

public class Calculator {

	public double add(double a, double b) {
		return a + b;
	}

	public double subtract(double a, double b) {
		return a - b;
	}

	public double multiply(double a, double b) {
		return a * b;
	}

	public double divide(double a, double b) {
		if (b == 0) {
			throw new ArithmeticException("you can never divide by zero");
		}
		return a / b;
	}

	public double square(double a) {
		if (a < 0) {
			throw new ArithmeticException("square root of negative number does not exist");
		}
		return Math.sqrt(a);
	}

	public double power(double a, double b) {
		return Math.pow(a, b);
	}
}