package com.firelawnpackageone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage3 
{
	WebDriver driver;

    public homepage3 (WebDriver driver)

    {

    PageFactory.initElements(driver, this);

    }

   

    @FindBy (xpath = "(//a[@href='/men'])[1]")

    WebElement men;

    public void hover_men()

    {
          men.click();
    }

    @FindBy (xpath = "//a[@href='/sub-category/men-tshirt']")

    WebElement t_shirts;

    public void click_t_shirts()

    {

          t_shirts.click();

    }

}
