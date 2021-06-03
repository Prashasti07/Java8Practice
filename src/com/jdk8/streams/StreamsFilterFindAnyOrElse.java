package com.jdk8.streams;

import java.util.Arrays;
import java.util.List;

public class StreamsFilterFindAnyOrElse {

	public static void main(String[] args) {

		// list of Customer object:

		List<Customer> customersList = Arrays.asList(

				new Customer("Tom", 30), new Customer("Steve", 31), new Customer("Peter", 34),
				new Customer("Simon", 23));

		// 1. filter-findAny
		Customer customer = customersList.stream() // Convert list to stream
				.filter(ele -> "Peter".equals(ele.getName())) // filter it for Peter
				.findAny()// if it finds then return the list
				.orElse(null);

		System.out.println(customer.getName() + " " + customer.getAge());
		System.out.println("--------------------------");

		// 2.Filter -> did not find any or else
		Customer customer1 = customersList.stream() // Convert list to stream
				.filter(ele -> "Prashasti".equals(ele.getName())) // filter it for Peter
				.findAny()// if it finds then return the list
				.orElse(null);

		System.out.println(customer1);
		System.out.println("--------------------------");

		// 3. Filter with multiple condition:

		Customer customer2 = customersList.stream().filter(x -> "Simon".equals(x.getName()) && 23 == x.getAge())
				.findAny().orElse(null);

		System.out.println(customer2.getName() + " " + customer2.getAge());

	}

}
