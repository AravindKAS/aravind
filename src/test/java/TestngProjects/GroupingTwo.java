package TestngProjects;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class GroupingTwo {
	 @Test(groups= {"sanitythree"})
	  private void Method7() {
		  System.out.println("test 7");
	  }

	  @Test (groups= {"smoke"})
	  private void Method8() {
		  System.out.println(" test 8");
	  }

	  @Test(groups= {"sanityfour"})
	  private void Method9() {
		  System.out.println("test 9");
	  }

	  @Test(groups= {"smoke"})
	  private void Method10() {
		  System.out.println("test 10");
	  }

	  @Test(groups= {"sanityfive"})
	  private void Method11() {
		  System.out.println("test 11");
	  }

	  @Test(groups= {"Regression"})
	  private void Method12() {
		  System.out.println("test 12");
	  }

}
