package day5;

import java.util.LinkedList;
import java.util.List;

public class CollectionsDemo1 {
		public static void main(String[] args) {
				List<String> list = new LinkedList<>();
				list.add("elm1");
				list.add("elm2");
				list.add("elm3");
				for (String s : list) {
						System.out.println(s);
				}
		}
}
