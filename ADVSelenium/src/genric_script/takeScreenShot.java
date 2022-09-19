package genric_script;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class takeScreenShot {
   WebDriver driver;
	public void takeScreenShot() throws IOException {
		  TakesScreenshot ts = ( TakesScreenshot)driver;
		      File srs = ts.getScreenshotAs(OutputType.FILE);
		      File dst = new File("c://Sshots//act.jpeg");
		      FileUtils.copyFile(srs, dst);
		      
	}
 
}
