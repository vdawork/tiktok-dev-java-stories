package day4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnitTestDemoTest {

		@Test
		void sum() {
				UnitTestDemo demo = new UnitTestDemo();
				int sum = demo.sum(1, 2);
				assertEquals(3, sum);
		}
}
