package java8.practice;

import java.util.function.Function;

public class FunctionInterfaceConcept {

	public static void main(String[] args) {

		Function<String, Integer> func = x -> x.length();
		int length = func.apply("This is java 8");
		System.out.println(length);

		// Chaining function:

		Function<Integer, Integer> func2 = x -> x * 2;
		int leng1 = func.andThen(func2).apply("This is Naveen here");

		System.out.println(leng1);
	}

}
