package TestngProjects;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class GroupingOne {
	 @Test(groups= {"sanityone"})
	  private void Method1() {
		  System.out.println("test 1");
	  }

	  @Test (groups= {"smoke"})
	  private void Method2() {
		  System.out.println(" test 2");
	  }

	  @Test(groups= {"sanitytwo"})
	  private void Method3() {
		  System.out.println("test 3");
	  }

	  @Test(groups= {"smoke"})
	  private void Method4() {
		  System.out.println("test 4");
	  }

	  @Test(groups= {"Regression"})
	  private void Method5() {
		  System.out.println("test 5");
	  }

	  @Test(groups= {"team A"})
	  private void Method6() {
		  System.out.println("test 6");
	  }

}
