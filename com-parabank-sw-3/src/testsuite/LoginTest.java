package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utiliti.Utility;

public class LoginTest extends Utility {
    String url = "https://parabank.parasoft.com/parabank/index.htm";

    @Before
    public void setup() {
        openbrowser(url);

    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {

        //find the element usename and sending element to usename
        sendTextToElement(By.xpath("//input[@type='text' and @name='username']"),"nailart@gmail.com");

        //find the element password filed and sending data to password filed
        sendTextToElement(By.xpath("//input[@type='password' and @class='input']"),"123456");

        //find element on login button and click on it
        clickelement(By.xpath("//input[@type='submit' and @class='button']"));

        //find element text and gettext to element
        String excpectedtext = "Accounts Overview";
        String actualtext = gettextfrom(By.xpath("//h1[@class='title']"));
        //validate both results
        Assert.assertEquals(excpectedtext, actualtext);
    }

    @Test
    public void verifyTheErrorMessage() {
        //find the element usename and sending element to usename
        sendTextToElement(By.xpath("//input[@type='text' and @name='username']"),"abcdesr");

        //find the element password filed and sending data to password filed
        sendTextToElement(By.xpath("//input[@type='password' and @name='password']"),"123");

        //find element on login button and click on it
        clickelement(By.xpath("//input[@type='submit' and @class='button']"));

        //find element and get  the text
        String expectedtext = "Please enter a username and password.";
        String actualtext = gettextfrom(By.linkText("Please enter a username and password."));
        //validate both expected and results
        Assert.assertEquals(actualtext, expectedtext);

    }

    @Test
    public void userShouldLogOutSuccessfully() {
        //find the element usename and sending element to usename
        sendTextToElement(By.xpath("//input[@type='text' and @name='username']"),"nailart@gmail.com");

        //find the element password filed and sending data to password filed
        sendTextToElement(By.xpath("//input[@type='password' and @class='input']"),"123456");

        //find element on login button and click on it
        clickelement(By.xpath("//input[@type='submit' and @class='button']"));

        //find element text and gettext to element
        clickelement(By.linkText("Log Out"));

        String expectedtext = "Customer Login";
        String actualtext = gettextfrom(By.xpath("//h2[text()='Customer Login']"));
        //validate actual and expectedtext
        Assert.assertEquals(actualtext, expectedtext);
    }

@After
    public void closeBrowser() {
        driver.quit();
    }
}

