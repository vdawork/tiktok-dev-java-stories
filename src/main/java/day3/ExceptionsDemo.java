package day3;

public class ExceptionsDemo {
		public static void main(String[] args) {
				String str = null;
				try {
					str.toLowerCase();
				} catch(Throwable th) {
					th.printStackTrace();
				}

		}
}
