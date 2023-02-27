package TestngProjects;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PriorityOneTest {

  @Test(priority=1)
  @Parameters({"username"})
  private void MethodFiveTest(String name) {
    System.out.println("name");
  }

  @Test(priority=3)
  private void MethodFourTest() {
	  System.out.println("two");
  }

  @Test(priority=6)
  private void MethodOneTest() {
	  System.out.println("three");
  }

  @Test(priority=5)
  private void MethodSevenTest() {
	  System.out.println("four");
  }

  @Test(priority=4)
  private void MethodSixTest() {
	  System.out.println("five");
  }

  @Test(priority=7)
  private void MethodThreeTest() {
	  System.out.println("six");
  }

  @Test(priority=2)
  private void MethodTwoTest() {
	  System.out.println("seven");
  }
}
