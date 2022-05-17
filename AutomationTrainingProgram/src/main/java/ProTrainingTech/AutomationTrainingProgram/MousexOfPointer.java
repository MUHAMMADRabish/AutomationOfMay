package ProTrainingTech.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MousexOfPointer {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MUHAMMAD Shahbaz Sal\\SDETWeekFebApril\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
		Actions ob =new Actions(driver);
		WebElement Signin=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		ob.moveToElement(Signin).build().perform();
		Thread.sleep(6000);
		WebElement GiftOfCard=driver.findElement(By.linkText("Prime Membership"));
		ob.moveToElement(GiftOfCard).click().build().perform();
	}

}
