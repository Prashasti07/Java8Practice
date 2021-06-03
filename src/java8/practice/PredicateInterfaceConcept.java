package java8.practice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import java.util.stream.Collectors;

public class PredicateInterfaceConcept {

	public static void main(String[] args) {

		Predicate<Integer> func = x -> x > 5;

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		List<Integer> colList = list.stream().filter(func).collect(Collectors.toList());

		System.out.println(colList);

		List<Integer> l1 = list.stream().filter(x -> x > 5 && x < 9).collect(Collectors.toList());

		System.out.println(l1);

		// perdicate with negate()

		List<String> nameList = Arrays.asList("Naveen", "Navee", "Nave", "Java", "Jav", "Ja", "J");

		Predicate<String> nameExp = x -> x.startsWith("Nav");
		List<String> newNamesList = nameList.stream().filter(nameExp.negate()).collect(Collectors.toList());
		System.err.println(newNamesList);
	}

}
