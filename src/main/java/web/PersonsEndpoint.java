package web;

import day8.PersonDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/persons")
public class PersonsEndpoint {

		@Value("${min.age}")
		int minAge;
		
		@GetMapping()
		public List<PersonDto> all() {
				return Arrays.stream(new PersonDto[] {
								new PersonDto("Nick", 23),
								new PersonDto("Jack", 21),
								new PersonDto("Mustafa", 12),
				}).filter(p -> p.getAge() >= minAge)
				.collect(Collectors.toList());
		}
}
