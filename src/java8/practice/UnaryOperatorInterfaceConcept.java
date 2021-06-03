package java8.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorInterfaceConcept {

	public static void main(String[] args) {

		UnaryOperator<Integer> func = x -> x * 7;
		int result = func.apply(10);
		System.out.println(result);

		Function<Integer, Integer> func1 = x -> x * 10;
		int result1 = func1.apply(10);
		System.out.println(result1);

		List<String> langList = new ArrayList<String>();
		langList.add("Java");
		langList.add("Ruby");
		langList.add("Python");
		langList.add("JavaScript");

		System.out.println(langList);

		langList.replaceAll(ele -> ele + " Prashasti");
		System.out.println(langList);
	}

}
