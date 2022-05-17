package ProTrainingTech.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flights {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MUHAMMAD Shahbaz Sal\\SDETWeekFebApril\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://expedia.com/");
		driver.manage().window().maximize();
		WebElement selection=driver.findElement(By.id("d1-btn"));
		selection.click();
		Thread.sleep(6000);
		WebElement departure=driver.findElement(By.xpath("//*[@aria-label='May 10, 2022']"));
		departure.click();
		Thread.sleep(6000);
		WebElement Returns=driver.findElement(By.xpath("//*[@aria-label='Jun 26, 2022']"));
		Returns.click();
	}

}
