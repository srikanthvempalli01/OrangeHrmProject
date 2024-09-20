package com.OrangeHrm.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class WebElementsPage
{
	WebDriver ldriver;
	public WebElementsPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}

	@FindBy(xpath="//input[@id='name']") 
	WebElement personName;
	@FindBy(xpath="//input[@id='email']")  
	WebElement emailAddress;
	@FindBy(xpath="//input[@id='phone']")
	WebElement phoneNumber;
	@FindBy(xpath="//textarea[@id='textarea']") 
	WebElement addrss;
	@FindBy(xpath="//input[@id='male']") 
	WebElement gender;
	@FindBy(xpath="//div[@class='form-check form-check-inline']//input[@type='checkbox']")
	List<WebElement> daycheckboxes;
	@FindBy(xpath="//select[@id='country']") 
	WebElement countryName;
	@FindBy(xpath="//option[@value='green']")  
	WebElement colorName;
	
	public void setName(String name)
	{
		personName.sendKeys(name);
	}
	public void setEmail(String email)
	{
		emailAddress.sendKeys(email);
	}
	public void setPhoneNumber(String phone)
	{
		phoneNumber.sendKeys(phone);
	}
	public void setAddress(String address)
	{
		addrss.sendKeys(address);
	}
	public void setGender()
	{
		gender.click();
	}
	public void setDays()
	{
		for(int i=0;i<daycheckboxes.size();i++)
		{
			daycheckboxes.get(5).click();
			
		}
	}
	public void setCountry()
	{
		Select country=new Select(countryName);
		country.selectByIndex(3);
	}
	public void setColor()
	{
		colorName.click();
	}
	
}
