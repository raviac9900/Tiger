package genric_script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Configaration implements Factory {
	
	public WebDriver driver;
  
  public void Setup()
  {
	    System.setProperty(fire_key,fire_value);
	   driver=new FirefoxDriver();
	   driver.get("http://122.166.192.191:9007/");
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   
	  
  }
  
  
 public void Close() {
	  driver.quit();
  }

}
