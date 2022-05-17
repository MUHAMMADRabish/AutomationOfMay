package ProTrainingTech.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ilocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MUHAMMAD Shahbaz Sal\\SDETWeekFebApril\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
	WebElement searchit=	driver.findElement(By.xpath("//input[@aria-label='Search']"));
	searchit.sendKeys("Computer");
			WebElement searchicon=driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/form/div/div/span/input"));
	searchicon.click();	
	WebElement linkid =driver.findElement(By.xpath("//a[text()='Books']"));
	linkid.click();
		
		
	}

}
