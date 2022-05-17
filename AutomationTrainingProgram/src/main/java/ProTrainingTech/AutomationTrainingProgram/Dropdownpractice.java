package ProTrainingTech.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownpractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MUHAMMAD Shahbaz Sal\\SDETWeekFebApril\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement createanaccount=driver.findElement(By.linkText("Create new account"));
		createanaccount.click();
		Thread.sleep(6000);
		WebElement month=driver.findElement(By.id("month"));
		Select ob=new Select(month);
		ob.selectByValue("1");
		WebElement dateof=driver.findElement(By.name("birthday_day"));
		Select it=new Select(dateof);
		it.selectByVisibleText("6");
		WebElement Year=driver.findElement(By.name("birthday_year"));
		Select years=new Select(Year);
		years.selectByIndex(6);
	}

}
