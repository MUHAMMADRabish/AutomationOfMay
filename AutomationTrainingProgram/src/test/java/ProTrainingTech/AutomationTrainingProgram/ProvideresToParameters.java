package ProTrainingTech.AutomationTrainingProgram;

import org.testng.annotations.Test;

import CommonCodeClass.Utility;
import PageObjectModel.Home;

import org.testng.annotations.DataProvider;

public class ProvideresToParameters extends Utility {
  @Test(dataProvider = "provides")
  public void f(String n, String s ) throws InterruptedException {
	  Home home=new Home(driver);
	  home.Email(n);
	  home.Pssword(s);
	  Thread.sleep(6000);
	  home.sign();
	  Thread.sleep(6000);
	  driver.navigate().back();
	  Thread.sleep(6000);
  }

  @DataProvider
  public Object[][] provides() {
    return new Object[][] {
      new Object[] { "John@gmail.com", "Silver" },
      new Object[] { "Shahbaz@gmail.com", "birdsto" },
      new Object[] { "Ali@gmail.com", "itw" },
    };
  }
}
