package CommonCodeClass;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;

public class Utility {
  public WebDriver driver;
  @Parameters({"browser"})//CHrome
  @BeforeClass
  public void beforeClass(String browsers) {
	  if(browsers.equalsIgnoreCase("Chrome")) {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\MUHAMMAD Shahbaz Sal\\SDETWeekFebApril\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
			 driver=new ChromeDriver();
			 driver.navigate().to("https://www.facebook.com");
				driver.manage().window().maximize();
		  
	  }else if(browsers.equalsIgnoreCase("Edge")) {
		  System.setProperty("webdriver.edge.driver", "C:\\Users\\MUHAMMAD Shahbaz Sal\\SDETWeekFebApril\\AutomationTrainingProgram\\Drivers\\msedgedriver.exe");
			 driver=new EdgeDriver();
			 driver.navigate().to("https://www.facebook.com");
				driver.manage().window().maximize();
		  
	  }else if(browsers.equalsIgnoreCase("Firefox")) {
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\MUHAMMAD Shahbaz Sal\\SDETWeekFebApril\\AutomationTrainingProgram\\Drivers\\geckodriver.exe");
		  driver=new FirefoxDriver();
		  driver.navigate().to("https://www.facebook.com");
			driver.manage().window().maximize();
		  
	  }
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
  public void pictures() throws IOException {
	  Date dt=new Date();
	  System.out.println(dt);
	String it=  dt.toString().replace(" ", "_").replace(":", "_");
	System.out.println(it);
	  
	  File WebShots= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(WebShots, new File("C:\\Users\\MUHAMMAD Shahbaz Sal\\SDETWeekFebApril\\AutomationTrainingProgram\\Pictures\\PicturesOfWeb"+it+".jpg"));
		
  }

}
