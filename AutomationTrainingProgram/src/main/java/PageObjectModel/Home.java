package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	WebDriver driver;
	@FindBy(name = "email") WebElement Ids;
	@FindBy(name = "pass") WebElement Psswd;
	@FindBy(linkText = "Forgot password?") WebElement Forgot;
	@FindBy(name = "login")WebElement login;
	
	public Home(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void Email(String ids ) {
		Ids.sendKeys(ids);
	}
	public void Pssword(String its) {
		Psswd.sendKeys(its);
	}
	public void ForgotToPssword() {
		Forgot.click();
	}
	public void sign() {
		login.click();
	}

}
