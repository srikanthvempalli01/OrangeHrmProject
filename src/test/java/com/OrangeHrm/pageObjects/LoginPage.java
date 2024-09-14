package com.OrangeHrm.pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	WebDriver ldriver;
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="//input[@placeholder='Username']") 
	WebElement user;
	@FindBy(xpath="//input[@placeholder='Password']") 
	WebElement passwd;
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement login;
	@FindBy(xpath="//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']") 
	WebElement drpdwn;	
	@FindBy(xpath="//a[normalize-space()='Logout']") 
	WebElement logout;
		
	public void setUsername(String username)
	{
		user.sendKeys(username);
	}
	public void setPassword(String password)
	{
		passwd.sendKeys(password);
	}
	public void clickLogin()
	{
		login.click();
	}
	public void clickDropdown()
	{
		drpdwn.click();
	}
	public void clickLogout()
	{
		logout.click();
	}
	
	
}
