package streams;

import day8.PersonDto;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample {
		public static void main(String[] args) {

				List<String> collect = Arrays.stream(
								new PersonDto[]{
												new PersonDto("Name1", 12),
												new PersonDto("Name2", 15)
								})
								.map(p -> p.getName())
								.collect(Collectors.toList());
				for (String s : collect) {
						System.out.println(s);
						clearScreen();
				}
		}

		public static void clearScreen() {
				System.out.print("\033\143");
		}
}
