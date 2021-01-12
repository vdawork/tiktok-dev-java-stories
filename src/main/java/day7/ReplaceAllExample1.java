package day7;

public class ReplaceAllExample1 {
		public static void main(String[] args) {
				String phone = "+3 8(097) 343-34-34";
				phone = phone.replaceAll("[^0-9]", "");
				System.out.println(phone);
		}
}
