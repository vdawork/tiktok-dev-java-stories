package day6;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortCollection {
		public static void main(String[] args) {
				List<String> list = new LinkedList<>();
				list.add("3");
				list.add("1");
				list.add("2");
				Collections.sort(list);
				for (String s : list) {
						System.out.println(s);
				}
		}
}
