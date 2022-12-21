package com.firelawnpackageone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage4 
{
	WebDriver driver;

    public homepage4 (WebDriver driver)

    {

    PageFactory.initElements(driver, this);

    }


    @FindBy (xpath = "(//a[@href='/electronics'])[1]")

    WebElement electronics;

   

    public void hover_electrnics()

    {

          electronics.click();

    }

   

    @FindBy (xpath = "//a[@href='/sub-category/camera']")

    WebElement cameras;

   

    public void click_cameras()

    {

          cameras.click();

    }

   

    @FindBy (xpath = "(//button[@tabindex=\"0\"])[2]")

    WebElement add_to_cart;

   

    public void click_addtocart()

    {

          add_to_cart.click();

    }

}
