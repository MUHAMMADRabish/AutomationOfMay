package ProTrainingTech.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserSetup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub, how to lanuch chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MUHAMMAD Shahbaz Sal\\SDETWeekFebApril\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.navigate().to("https://www.amazon.com");
driver.manage().window().maximize();
//driver.navigate().back();
Thread.sleep(6000);
/*driver.navigate().forward();
String windowhandleids=driver.getWindowHandle();
System.out.println(windowhandleids);*/
WebElement Searchfield=driver.findElement(By.name("field-keywords"));
Searchfield.sendKeys("Computer");
Thread.sleep(6000);
WebElement SearchButton= driver.findElement(By.id("nav-search-submit-button"));
SearchButton.click();
	//driver.close();
//driver.findElement(By.className("nav-input nav-progressive-attribute"));
WebElement deallink=driver.findElement(By.linkText("Today's Deals"));
driver.findElement(By.partialLinkText("Today's"));
deallink.click();
	}
	

}
