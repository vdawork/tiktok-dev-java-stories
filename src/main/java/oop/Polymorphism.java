package oop;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Polymorphism {
		public static void main(String[] args) {
				doWork(new LinkedHashSet<>());
				doWork(new TreeSet<>());
		}

		private static void doWork(Set<String> strings) {
				System.out.println(strings.getClass());
				strings.add("3");
				strings.add("2");
				strings.add("1");
				for (String string : strings) {
						System.out.println(string);
				}
		}

}
