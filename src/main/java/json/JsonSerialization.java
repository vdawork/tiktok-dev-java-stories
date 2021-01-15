package json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import day8.PersonDto;

public class JsonSerialization {
		public static void main(String[] args) throws JsonProcessingException {
				ObjectMapper om = new ObjectMapper();
				String person = om.writeValueAsString(
								new PersonDto("Dima", 34));
				System.out.println(person);
		}
}
