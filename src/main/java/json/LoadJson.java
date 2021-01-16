package json;

import com.fasterxml.jackson.databind.ObjectMapper;
import day8.PersonDto;

import java.io.IOException;
import java.net.URL;

public class LoadJson {
		public static void main(String[] args) throws IOException {
				URL url = new URL("https://api.mocki.io/v1/074152bd");
				ObjectMapper om = new ObjectMapper();
				PersonDto personDto = om.readValue(url, PersonDto.class);
				System.out.println(personDto);
		}
}
