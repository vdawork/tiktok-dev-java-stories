package web;

import day8.PersonDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persons")
public class PersonsEndpoint {
		@GetMapping()
		public PersonDto[] all() {
				return new PersonDto[] {
								new PersonDto("Nick", 23),
								new PersonDto("Jack", 21),
								new PersonDto("Mustafa", 12),
				};
		}
}
