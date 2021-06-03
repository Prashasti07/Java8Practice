package java8.practice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExpressionAndMethodReferences {

	public static void main(String[] args) {

		List<String> namesList = Arrays.asList("Tom", "Peter", "Naveen", "Simon");
		// 1. Anonymous Class
		namesList.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});
		System.out.println("----------------------------");
		// 2. Lambda Expression
		namesList.forEach(names -> System.out.println(names));

		System.out.println("----------------------------");

		// 3. Method reference
		namesList.forEach(System.out::println);
	}

}
