package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.Utility;

import java.util.List;

public class LoginTest extends Utility {
    String baseurl="https://www.saucedemo.com/";

    @Before
    public void setup(){
        openBrowser(baseurl);
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        //find the element to userfiled and sending to element filed
        sendTextToElement(By.id("user-name"),"standard_user");

        //find the element to password filed and sending data to element filed
        sendTextToElement(By.name("password"),"secret_sauce");

        //find element login filed
        clickelement(By.name("login-button"));

        //find the element to prouduct element
        clickelement(By.className("title"));



    }
    @Test
    public  void verifyThatSixProductsAreDisplayedOnPage(){
        //find the element to userfiled and sending text to userfiled
        sendTextToElement(By.id("user-name"),"standard_user");

        //find the element to password filed and sendnig text to password filed
        sendTextToElement(By.name("password"),"secret_sauce");

        //find elementto login filed
        clickelement(By.name("login-button"));

        //find the element for multiple element
        List<WebElement> value1=gettextfrom();
     //   int size=value.size();
        System.out.println(value1);

        int expectedvalue=6;
        int actualvalue=value1;
        //validate expected and actual value
        Assert.assertEquals(expectedvalue,actualvalue);
    }
    @After
    public void tearDown(){
        //close browser
        closeBrowser();
    }


}
