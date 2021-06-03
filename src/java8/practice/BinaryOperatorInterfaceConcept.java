package java8.practice;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorInterfaceConcept {

	public static void main(String[] args) {

		BinaryOperator<Integer> func = (x1, x2) -> x1 + x2;
		int result = func.apply(10, 20);
		System.out.println(result);

		// BiFunction Interface:
		BiFunction<Integer, Integer, Integer> func1 = (x1, x2) -> x1 + x2;
		int result1 = func1.apply(10, 20);
		System.out.println(result1);
	}

}
