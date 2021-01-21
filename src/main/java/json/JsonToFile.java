package json;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.databind.ObjectMapper;
import day8.PersonDto;

import java.io.File;
import java.io.IOException;

public class JsonToFile {
		public static void main(String[] args)  throws IOException {
				File f = new File("person1.json");
//				new ObjectMapper().createGenerator(f, JsonEncoding.UTF8)
//								.writeObject(new PersonDto("Vasya", 18));

		}
}
