package testsuite;

import browserfactory.BestTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utiliti.Utility;

public class LoginTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){
        clickelement(By.linkText("Log in"));

        String expectedMessage = "Welcome, Please Sign In!";

        // Find the welcome text element and get the text

        String actualMessage = gettextfrom(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));

        Assert.assertEquals("not navigate to login page",expectedMessage,actualMessage);

    }
    @Test
    public  void userShouldLoginSuccessfullyWithValidCredentials(){
        clickelement(By.linkText("Log in"));

        sendTextToElement(By.id("Email"),"shilpa2_2010@gmail.com");
        sendTextToElement(By.id("Password"),"shhhh123");
        clickelement(By.linkText("Log in"));
        //find the text element and get the text
        String expectedmessage="Log out";
        String actualmessage=gettextfrom(By.linkText("Log out"));
        Assert.assertEquals(actualmessage,expectedmessage);


    }
    @Test
    public void verifyTheErrorMessage(){
      //  click on login link
        clickelement(By.linkText("Log in"));
        sendTextToElement(By.id("Email"),"shilpa2_2010@gmail.com");
        sendTextToElement(By.id("Password"),"shh123");
        clickelement(By.xpath("//button[contains(text(),'Log in')]"));
        String expectedmessage="Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualmessage=gettextfrom(By.xpath("//div[@class='message-error validation-summary-errors']"));
        //validate actualmessage and expectedmessage
        Assert.assertEquals(actualmessage,expectedmessage);




    }
    @After
    public void closebrowser() {

        //driver.close();
    }


    }


