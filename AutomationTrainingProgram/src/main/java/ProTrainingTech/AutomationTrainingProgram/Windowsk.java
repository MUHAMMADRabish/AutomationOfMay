package ProTrainingTech.AutomationTrainingProgram;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windowsk {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MUHAMMAD Shahbaz Sal\\SDETWeekFebApril\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");
		driver.manage().window().maximize();
		Actions ob=new Actions(driver);
		//
		WebElement newreleases= driver.findElement(By.linkText("New Releases"));
		ob.keyDown(Keys.SHIFT).build().perform();
		newreleases.click();
		ob.keyUp(Keys.SHIFT).build().perform();
		driver.getWindowHandle();//Current window handle
	Set<String> windowhandles=	driver.getWindowHandles();//Collect the window handle for both windows
	Iterator<String> iterator=windowhandles.iterator();
	String Parentwindow= iterator.next();
	String secondwindow=iterator.next();
	System.out.println("This is parent window="+Parentwindow);
	System.out.println("This is second window="+secondwindow);
	driver.switchTo().window(secondwindow);
	WebElement newwindowclick=driver.findElement(By.linkText("Camera & Photo Products"));
	Thread.sleep(6000);
	newwindowclick.click();
	}

}
