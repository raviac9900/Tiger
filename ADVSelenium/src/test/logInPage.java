package test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import genric_script.Configaration;
import selenium.pom.AppointmentPage;
import selenium.pom.loginPage;

public class logInPage extends Configaration{
	@Parameters({"browser"})
	@Test
	public void ValidLogin(String browser)  {
	/*	loginPage L=new loginPage(driver);
		L.enterPassword("Doctor@Doctor");
		Thread.sleep(3000);
		L.enterUsername("kushal@gmail.com");
		L.submit();
		Thread.sleep(3000);
		AppointmentPage A=new AppointmentPage(driver);
		A.AppointmentDropDown();
		Thread.sleep(2000);
		A.AppointmentList();
		Thread.sleep(2000);
		A.AppointmentButton();
		Thread.sleep(2000);
		A.SelectDate("22/09/2022");
		Thread.sleep(2000);
		A.SelectTime("12.30");
		Thread.sleep(2000);
		A.SelectDoctorOption();
		Thread.sleep(2000);
		A.SelectDoctor("kushal");
		A.Submit();*/
		System.setProperty("webdriver.gecko.driver","./SELENIUM/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./SELENIUM/chromedriver.exe");
		if(browser.equals("fire_fox")) {
			driver=new FirefoxDriver();
			driver.get("https://www.google.com");
			}
		else
		{
			driver=new ChromeDriver();
			driver.get("https://www.facebook.com");
		}
		
	}

}
