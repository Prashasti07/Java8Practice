package java8.practice;

import java.util.function.Supplier;

public class SupplierInterfaceConcept {

	public static void main(String[] args) {

		// Takes no argument and returns result

		getText(() -> "Java");

	}

	public static void getText(Supplier<String> text) {
		System.out.println(text.get().length());

	}
}
