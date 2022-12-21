package com.firelawnpackageone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage1
{
	public homepage1 (WebDriver driver)

    {

    PageFactory.initElements(driver, this);

    }



    @FindBy (xpath = "//button[@id='fl_login_btn']")

    WebElement login;

   

    public void click_login()

    {

          login.click();

    }



    @FindBy (xpath = "(//span[@class='MuiButton-label'])[2]")

    WebElement createaccount;

   

    public void click_createaccount()

    {
          createaccount.click();
    }



    @FindBy (xpath = "//input[@id='fl_firstName_Shopper']")

    WebElement firstname;
    public void type_firstname()

    {
          firstname.sendKeys("sathwik");
    }

    @FindBy (xpath = "//input[@id='fl_lastName_Shopper']")

    WebElement lastname;


    public void type_lastname()

    {

          lastname.sendKeys("bag");

    }

    @FindBy (xpath = "//input[@id='fl_male_Shopper']")

    WebElement selectmale;

   

    public void click_male()

    {

          selectmale.click();

    }

    @FindBy (xpath = "//input[@id='fl_phoneNumber_Shopper']")

    WebElement phonenumber;

    public void type_phonenumber()

    {

          phonenumber.sendKeys("9966552910");

    }


    @FindBy (xpath = "//input[@id='fl_email_Shopper']")

    WebElement email;
    public void type_email()

    {

          email.sendKeys("sathwik.bag@gmail.com");

    }

    @FindBy (xpath = "//input[@id='fl_password_Shopper']")

    WebElement password;

    public void type_password()

    {

          password.sendKeys("Password123*");

    }
    @FindBy (xpath = "//input[@id='fl_confirmPassword_Shopper']")

    WebElement confirmpassword;

   

    public void type_confirmpassword()

    {

          confirmpassword.sendKeys("Password123*");

    }



    @FindBy (xpath = "(//input[@class='jss17'])[4]")

    WebElement agreeterms;

   

    public void click_terms()

    {

          agreeterms.click();

    }



    @FindBy (xpath = "//button[@id='fl_btnDisabled_Shopper']")

    WebElement register;

   

    public void click_register()

    {

          register.click();

    }

    }

