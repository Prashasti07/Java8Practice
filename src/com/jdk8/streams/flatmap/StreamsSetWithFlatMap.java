package com.jdk8.streams.flatmap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsSetWithFlatMap {

	public static void main(String[] args) {

		Employee emp1 = new Employee();

		emp1.setName("Prashasti");
		emp1.addDevices("iPhone8");
		emp1.addDevices("MacBook");
		emp1.addDevices("iPhone X");
		emp1.addDevices("Samsung10");

		Employee emp2 = new Employee();

		emp2.setName("Tom");
		emp2.addDevices("Lenove Wimdows10");
		emp2.addDevices("Samsung10");
		emp2.addDevices("iPhone9");
		emp2.addDevices("MacBook Air");

		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(emp1);
		employeeList.add(emp2);

		List<String> deviceList = employeeList.stream().map(x -> x.getDevices()) // Stream <Set<String>>
				.flatMap(x -> x.stream())// Stream<String>
				.distinct().collect(Collectors.toList());

		deviceList.forEach(x -> System.out.println(x));
	}

}
