package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage {
	WebDriver driver;
	@FindBy(linkText = "Cancel") WebElement Fogotlink;
	@FindBy(xpath = "//*[contains(text(),'Please enter your email')]") WebElement ForgotPageText;
	
	
	public ForgotPasswordPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void Cancel() {
		Fogotlink.click();
		
	}
	public String GetOfText() {
	String ForgotPageVerify=	ForgotPageText.getText();
	return ForgotPageVerify;
		
	}

}
