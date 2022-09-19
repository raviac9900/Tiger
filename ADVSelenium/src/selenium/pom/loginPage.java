package selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	
		
	WebDriver driver;
	
@FindBy(id="email")
private WebElement userName;
@FindBy(id="password")
private WebElement passWord;
@FindBy(xpath="//button[@type='submit']")
private WebElement submit;
public loginPage(WebDriver driver)
{     this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void enterUsername(String user)
{
	userName.sendKeys(user);
}
public void enterPassword(String pass)
{
	passWord.sendKeys(pass);
}
public void submit() {
	submit.click();
}

}
