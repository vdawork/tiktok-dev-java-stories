package json;

import com.fasterxml.jackson.databind.ObjectMapper;
import day8.PersonDto;

import java.io.File;
import java.io.IOException;

public class LoadFromJson {
		public static void main(String[] args) throws IOException {
				File file = new File("person.json");
				PersonDto personDto = new ObjectMapper()
								.readValue(file, PersonDto.class);
				System.out.println(personDto);
		}
}
