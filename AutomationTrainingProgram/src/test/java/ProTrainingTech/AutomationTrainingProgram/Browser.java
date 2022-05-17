package ProTrainingTech.AutomationTrainingProgram;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import CommonCodeClass.Utility;
import PageObjectModel.ForgotPasswordPage;
import PageObjectModel.Home;

import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Browser extends Utility {
	
  @Test(priority = 2,dependsOnMethods = "verificationoftext")
  public void f() throws InterruptedException {
	  Home ob=new Home(driver);
	  ob.Email();
	  ob.Pssword();
	  Thread.sleep(6000);
	  ob.ForgotToPssword();
	  ForgotPasswordPage ob2=new ForgotPasswordPage(driver);
	  Thread.sleep(6000);
	  ob2.Cancel();
	  
	 
  }
  @Test(priority = 1)
  public void verificationoftext() throws InterruptedException, IOException {
	  Home ob=new Home(driver);
	  
	  ForgotPasswordPage ob2=new ForgotPasswordPage(driver);
	  Thread.sleep(6000);
	  ob.ForgotToPssword();
pictures();
	  Thread.sleep(6000);
String VerificationOfText=ob2.GetOfText();
pictures();
System.out.println(VerificationOfText);
pictures();
SoftAssert st=new SoftAssert();
st.assertEquals(VerificationOfText, "Please enter your email or mobile number to search for your account. it");
//st.Assert.assertEquals(VerificationOfText, "Please enter your email or mobile number to search for your account.", "Text is displaying");
System.out.println("This is afterassert");
ob2.Cancel();
st.assertAll();

  }
  
  
 
  
}
