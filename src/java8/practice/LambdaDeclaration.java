package java8.practice;

public class LambdaDeclaration {

	public static void main(String[] args) {

		// Lambda Expression

		WebPage w3 = (name, age) -> {
			System.out.println("hii " + name + " age: " + age);
		};
		WebPage w4 = (name, age) -> System.out.println("Hey " + name + " age: " + age);
		WebPage w5 = (n, age) -> System.out.println(n.length() + " age: " + age);

		w3.header("FB", 20);
		w4.header("Walmart", 100);
		w5.header("prashasti", 27);
	}

}
