package day4selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Validation {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\DELL\\Desktop\\Eclipspractice\\workspace\\Seleniumclass\\executables\\geckodriver.exe");
		FirefoxDriver fdriver=new FirefoxDriver();
		
		
		fdriver.get("https://demo.actitime.com");
		fdriver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
		

		//identify username field
		WebElement userNameInputField=fdriver.findElement(By.id("username"));
		System.out.println("User name is displayed or not? "+userNameInputField.isDisplayed());
		System.out.println("User name is functional or not? "+userNameInputField.isEnabled());
		
		String defaultValueInUserNameInputField=userNameInputField.getAttribute("placeholder");
		System.out.println("Default value of user name input field: "+defaultValueInUserNameInputField);
		System.out.println("Default value validation for user name input field status: "+defaultValueInUserNameInputField.equals("Username"));
		
		WebElement pwdField=fdriver.findElement(By.name("pwd"));
		System.out.println(" password field is displayed or not? "+ pwdField.isDisplayed());
		System.out.println("password field enabled or not? "+ pwdField.isEnabled());
		
		String defaultValueOfwdField=pwdField.getAttribute("placeholder");
		System.out.println("default value of paasword field: "+defaultValueOfwdField);
		System.out.println("default value validation of password field :"+defaultValueOfwdField.equals("Password"));
		

		//check box
		WebElement checkbox=fdriver.findElement(By.id("keepLoggedInCheckBox"));
		System.out.println(checkbox.isDisplayed());
		System.out.println(checkbox.isEnabled());
		boolean res=checkbox.isSelected();
		System.out.println(res==false);
		
		//identify keepLoggedInLabel 
		WebElement keepLoggedInLabelCheckBoxText=fdriver.findElement(By.id("keepLoggedInLabel"));
		System.out.println(keepLoggedInLabelCheckBoxText.isDisplayed());
		System.out.println(keepLoggedInLabelCheckBoxText.isEnabled());
		String checkBoxTextName=keepLoggedInLabelCheckBoxText.getText();
		System.out.println(checkBoxTextName);

		
		
	}

}
