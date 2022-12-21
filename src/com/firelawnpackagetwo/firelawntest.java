package com.firelawnpackagetwo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.firelawnpackageone.homepage1;
import com.firelawnpackageone.homepage2;
import com.firelawnpackageone.homepage3;
import com.firelawnpackageone.homepage4;

public class firelawntest
{
	 WebDriver driver;

     @BeforeMethod

     public void TC00()

     {

    	 System.setProperty("webdriver.chrome.driver", "./firedriver1/chromedriver.exe");
    	 
           driver = new ChromeDriver();

           driver.get("https://www.firelawn.com/");

           driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

           //driver.manage().window().maximize();

     }

    

         @Test

         public void TC01()

         {

         homepage1 hp1 = new homepage1(driver);

        

         hp1.click_login();

         hp1.click_createaccount();

        

         hp1.type_firstname();

         hp1.type_lastname();

         hp1.click_male();

         hp1.type_email();

         hp1.type_phonenumber();

         hp1.type_password();

         hp1.type_confirmpassword();

         hp1.click_terms();

        

        hp1.click_register();

   }

        

         @Test

        public void TC02()
        {

               homepage2 hp2 = new homepage2(driver);

              

              hp2.click_login1();

              hp2.type_email1();

               hp2.type_password1();

              hp2.click_loginbutton();

         }

          

           @Test

           public void TC03()

           {

                  homepage3 hp3 = new homepage3(driver);

                  hp3.hover_men();

                  hp3.click_t_shirts();

           }

          

           @Test

           public void TC04()

           {

                  homepage4 hp4 = new homepage4(driver);

                 

                  hp4.hover_electrnics();

                  hp4.click_cameras();

                  hp4.click_addtocart();

           }

    

     @AfterMethod

     public void endprogram() throws InterruptedException

     {

           Thread.sleep(5000);

           driver.close();

     }



}

