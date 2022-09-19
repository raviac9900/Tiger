package test;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import genric_script.Configaration;
import selenium.pom.AppointmentPage;
import selenium.pom.loginPage;

public class BookAppointmnet extends Configaration{
	@Test
	public void ValidLogin() throws InterruptedException {
		loginPage L=new loginPage(driver);
		L.enterUsername("kushal@gmail.com");
		Thread.sleep(3000);
		L.enterPassword("Doctor@Doctor");
		Thread.sleep(3000);
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
		A.Submit();
		// JavascriptExecutor js=(JavascriptExecutor)driver;
		 //js.executeScript("window.scrollIntoView")
		
	}

}
