package day8;

public class PersonDto {
		private String name;
		private int age;

		public PersonDto(String name, int age) {
				this.name = name;
				this.age = age;
		}

		public String getName() {
				return name;
		}

		public int getAge() {
				return age;
		}

		@Override
		public String toString() {
				return "PersonDto{" +
								"name='" + name + '\'' +
								", age=" + age +
								'}';
		}
}
