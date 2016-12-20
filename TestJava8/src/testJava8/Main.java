package testJava8;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		System.out.println("Hello java 8");

		List<String> lst = new ArrayList<String>();
		lst.add("list1");
		lst.add("list2");

		lst.forEach(s -> System.out.println(s));

		System.out.println();

		lst.removeIf(s -> s == "list1");
		lst.forEach(s -> System.out.println(s));

		System.out.println();

		lst.add("list1");
		lst.add("list2");
		lst.replaceAll(s -> s.toUpperCase());
		lst.forEach(s -> System.out.println(s));
		lst.replaceAll(String::toLowerCase);
		lst.forEach(s -> System.out.println(s));

		System.out.println();

		lst.add("list  22");
		lst.add("list    22");
		lst.add("list  22");
		lst.add("list     22");
		lst.add("list        22");
		lst.sort((x, y) -> x.length() - y.length());// сортировка строк по
													// длинне
		lst.forEach(s -> System.out.println(s));

		int total = lst.stream().mapToInt(t -> t.length()).peek(System.out::println).sum(); // pee
																							// исп.
																							// как
																							// дебаггер
																							// брекпоинт

		// System.out.println(total);
		System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "2"); // установка
																							// количество
																							// потоков
		lst.parallelStream().forEach(t -> System.out.print(t.toString()));// использование
																			// паралельных
																			// потоков

	}
}
