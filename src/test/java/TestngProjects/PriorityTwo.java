package TestngProjects;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class PriorityTwo {
	
	@Test
	@Parameters({"Name"})
	private void MethodEight(String name) {
		System.out.println("name");

	}
	@Test
	private void MethodNine() {
		System.out.println("9");

	}
	@Test
	private void MethodTen() {
		System.out.println("10");

	}
	@Test
	private void MethodEleven() {
		System.out.println("11");

	}
	@Test
	private void MethodTweleve() {
		System.out.println("12");

	}

}
