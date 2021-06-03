package java8.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteration {

	public static void main(String[] args) {

		ArrayList<String> tvSeries = new ArrayList<String>();
		tvSeries.add("Game Of Thrones");
		tvSeries.add("Breaking Bad");
		tvSeries.add("The Big Bang Theory");
		tvSeries.add("The Walking Dead");
		tvSeries.add("Prison Break");

		// 1. using Java 8 with for each loop and lambda expression

		tvSeries.forEach(shows -> {
			System.out.println(shows);
		});

		System.out.println("------------------------------------");

		// 2. using Iterator:

		Iterator<String> it = tvSeries.iterator();
		while (it.hasNext()) {
			String show = it.next();
			System.out.println(show);

		}
		System.out.println("------------------------------------");
		// 3.using iterator and java 8 lambda and forEachRemaining() method
		it = tvSeries.iterator();
		it.forEachRemaining(show -> {
			System.out.println(show);
		});

		System.out.println("------------------------------------");
		// 4. Iterate using forEach loop

		for (String show : tvSeries) {
			System.out.println(show);
		}
		System.out.println("------------------------------------");
		// 5. using for loop with order/index
		for (int i = 0; i < tvSeries.size(); i++) {
			System.out.println(tvSeries.get(i));
		}
		System.out.println("------------------------------------");
		// 6. using List Iterator

		ListIterator<String> tvSeriesListIte = tvSeries.listIterator(tvSeries.size());

		while (tvSeriesListIte.hasPrevious()) {
			String show = tvSeriesListIte.previous();
			System.out.println(show);
		}
	}

}
