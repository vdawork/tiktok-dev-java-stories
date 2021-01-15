package day8;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class PersonDto {
		@JsonProperty("firstname")
		private String name;
		private int age;


}
