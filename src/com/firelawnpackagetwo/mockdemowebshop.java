package com.firelawnpackagetwo;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class mockdemowebshop
{
	WebDriver driver;
	@BeforeMethod
	public void Setup() {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();

}
	@Test (dataProvider = "logindata")
	public void register(String fname, String lname)
	{
		driver.findElement(By.xpath("//a[@href='/register']")).click();
		WebElement firstname = driver.findElement(By.xpath("(//input[@class='text-box single-line'])[1]"));
		
		firstname.clear();
		firstname.sendKeys(fname);
		
		WebElement lastname = driver.findElement(By.xpath("(//input[@class='text-box single-line'])[2]"));
		lastname.clear();
		lastname.sendKeys(lname);
	}
	
	@DataProvider(name="logindata")
	public String [][]getData() throws IOException
	{
	String path=".\\DataFiles\\logindata.xlsx";
	XLUtility xlutil=new XLUtility(path);

	int totalrows=xlutil.getRowCount("Sheet1");
	int totalcols=xlutil.getCellCount("Sheet1",2);

	String loginData[][]=new String[totalrows][totalcols];


	for(int i=1;i<=totalrows;i++) //1
	{
	for(int j=0;j<totalcols;j++) //0
	{
	loginData[i-1][j]=xlutil.getCellData("Sheet1", i, j);
	}
	}
	
	return loginData;

	}
	
	
	@AfterMethod
	public void endprogram() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
	}
}
