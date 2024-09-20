package com.OrangeHrm.testCases;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;
import com.OrangeHrm.pageObjects.WebElementsPage;
public class TC_TestCaseLogin_002 extends BaseClass
{
	@Test
	public void test() throws InterruptedException
	{
		driver.get(baseURL1);
		WebElementsPage wp=new WebElementsPage(driver);
		wp.setName("Vempalli Srikanth Reddy");
		Thread.sleep(3000);
		String email=(randomeString())+"@gmail.com";
		wp.setEmail(email);
		Thread.sleep(3000);
		wp.setPhoneNumber("6300807019");
		Thread.sleep(3000);
		wp.setAddress("Hyderabad");
		Thread.sleep(3000);
		wp.setGender();
		Thread.sleep(3000);
		wp.setDays();
		Thread.sleep(3000);
		wp.setCountry();
		Thread.sleep(3000);
		wp.setColor();
		Thread.sleep(3000);
		logger.info("data entered successfully....................");
	}
	public String randomeString()
	{
		String generatedString=RandomStringUtils.randomAlphabetic(8);
		return(generatedString);
	}
}
