package com.firelawnpackageone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage2 
{
	WebDriver driver;
	 public homepage2 (WebDriver driver)

     {

     PageFactory.initElements(driver, this);

     }

    

     @FindBy (xpath = "//button[@id='fl_login_btn']")

     WebElement login1;

    

     public void click_login1()

     {

           login1.click();

     }

    

     @FindBy (xpath="//input[@id='fl_email']")

     WebElement email1;

    

     public void type_email1()

     {

           email1.sendKeys("sathwik.bag@gmail.com");

     }

    

     @FindBy (xpath = "//input[@id='fl_password']")

     WebElement password1;

    

     public void type_password1()

     {

           password1.sendKeys("Password123*");

     }

    

     @FindBy (xpath = "(//span[@class='MuiButton-label'])[1]")

     WebElement loginbutton;

    

     public void click_loginbutton()

     {

           loginbutton.click();

     }



}


