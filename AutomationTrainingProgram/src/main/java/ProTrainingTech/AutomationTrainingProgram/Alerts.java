package ProTrainingTech.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MUHAMMAD Shahbaz Sal\\SDETWeekFebApril\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
		WebElement simpleofalert=driver.findElement(By.name("alert"));
		simpleofalert.click();
		driver.switchTo().alert().accept();
		Thread.sleep(6000);
		WebElement confirmationOfAlert=driver.findElement(By.name("confirmation"));
		confirmationOfAlert.click();
		Thread.sleep(6000);
		driver.switchTo().alert().accept();
		Thread.sleep(6000);
		confirmationOfAlert.click();
		Thread.sleep(6000);
		driver.switchTo().alert().dismiss();
		WebElement promptofalert=driver.findElement(By.name("prompt"));
		promptofalert.click();
		driver.switchTo().alert().sendKeys("Accept");
		driver.switchTo().alert().accept();
		
	}

}
