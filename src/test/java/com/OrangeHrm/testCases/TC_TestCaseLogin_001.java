package com.OrangeHrm.testCases;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.OrangeHrm.pageObjects.LoginPage;
import com.OrangeHrm.utilities.XLUtils;
public class TC_TestCaseLogin_001 extends BaseClass
{
	@Test(dataProvider="loginData")
	public void loginTest(String username,String password) throws InterruptedException
	{
		driver.get(baseURL);
		logger.info("url is opened");
		LoginPage lp=new LoginPage(driver);
		lp.setUsername(username);
		logger.info("enter username");
		Thread.sleep(5000);
		lp.setPassword(password);
		logger.info("enter password");
		Thread.sleep(5000);
		lp.clickLogin();
		Thread.sleep(5000);
		if(driver.getPageSource().contains("Dashboard"))
		{
			Assert.assertTrue(true);
			logger.info("login successfully");
			lp.clickDropdown();
			lp.clickLogout();
			logger.info("logout successfully");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("login failed");
		}		
	}
	@DataProvider(name="loginData")
	public String[][] getData() throws IOException
	{
		
	    String path=System.getProperty("user.dir")+"/src/test/java/com/OrangeHrm/testData/LoginData.xlsx";
		int rowCount=XLUtils.getRowCount(path,"Sheet1");
		int colCount=XLUtils.getCellCount(path,"sheet1",1);
		String loginData[][]=new String[rowCount][colCount];
		for(int i=1;i<=rowCount;i++)
		{
			for(int j=0;j<colCount;j++)
			{
				loginData[i-1][j]=XLUtils.getCellData(path,"Sheet1", i, j);
			}
		}
		return loginData;  
	}
}
