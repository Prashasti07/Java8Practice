package com.jdk8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterWithCollect {

	public static void main(String[] args) {

		List<String> productList = Arrays.asList("MacBook", "iPhone", "Shoes", "Battery Charger", "Bat");
		System.out.println(productList);
		System.out.println("----------------------------------------");
		productList.forEach(name -> System.out.println(name));
		System.out.println("----------------------------------------");
		List<String> result = productList.stream().filter(ele -> !ele.equals("iPhone")).collect(Collectors.toList());

		result.forEach(ele -> System.out.println(ele));
		System.out.println("----------------------------------------");
		result.forEach(System.out::println);
	}

}
