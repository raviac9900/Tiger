package selenium.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AppointmentPage {
	WebDriver driver;
	public AppointmentPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()=\"Appointment\"]")
	private WebElement Appoint;
	@FindBy(xpath="//span[text()=\"Appointment List\"]")
	private WebElement AppList;
	@FindBy(xpath="//button[contains(text(),\"Appointment\")]")
	private WebElement appbtn;
	@FindBy(xpath="//input[@name=\"date_timestamp\"]")
	private WebElement Date;
	@FindBy(xpath="//input[@name='time_timestamp']")
	private WebElement Time;
	@FindBy(xpath="//span[text()='Select Doctor']")
	private WebElement SelectD;
	@FindBy(xpath="//select[@name='doctor_id']")
	private WebElement selectDct;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement Sbmt;
	@FindBy(xpath="//button[@type='button']")
	private WebElement cls;
	
	public void AppointmentDropDown() {
		Appoint.click();
	}
	public void AppointmentList() {
		AppList.click();
	}
	public void AppointmentButton() {
		appbtn.click();
	}
	public void SelectDate(String date) {
		Date.sendKeys(date);
		Time.click();
	}
	public void SelectTime(String time) {
	  Time.sendKeys(time);
	  
	}
	public void SelectDoctorOption() {
		SelectD.click();
	}
	public void SelectDoctor(String name) {
		
		Select s=new Select(selectDct);
	     List<WebElement> opt = s.getOptions();
	     for(WebElement D:opt)
	     {
	    	 String Name = D.getText();
	    	 if(Name.contains(name)) {
	    		 D.click();
	    		 break;
	    	 }
	     }
		
		
	}
	public void Submit() {
		Sbmt.click();
	}
	

}
