package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utiliti.Utility;

public class LoginTest extends Utility {
    String baseurl="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
    @Before
    public void setup(){
        openBrowser(baseurl);
    }
    @Test
    public void userShouldSuccessfullyWithValidCredentials() {
        //find the username filedelement and sending element to filed
        sendTextToElement(By.id("txtUsername"),"Admin");

        //find the password element to password filed and sending element to filed
        sendTextToElement(By.name("txtPassword"),"admin123");

        //fined element to login filed by clicking
        clickelement(By.xpath("//input[@name='Submit']"));


        //this is from requirment
        String expectedresult = "Welcome";
        //find the welcome text element and get the text
        String actualresults =gettextfrom(By.id("welcome","(0, 7)"));
        Assert.assertEquals("letter displayed",expectedresult,actualresults);

    }
    @After
    public void tearDown() {
        //    closeBrowser();
    }
    }
