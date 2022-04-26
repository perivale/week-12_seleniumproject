package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utiliti.Utility;

public class ForgotPasswordTest extends Utility {

    String baseurl = "https://opensource-demo.orangehrmlive.com/index.php/dashboard";

    @Before
    public void setup() {
        openBrowser(baseurl);

    }

    @Test
    public void userShouldNavigatetoForgotPasswordPageSuccessfully() {
        //find the element to forgotpassword and click on link
        clickelement(By.linkText("Forgot your password?"));

        String expectedforgotpassword = "Forgot your password?";
        String actualforgotpassword = gettextfrom(By.linkText("Forgot your password?"));
        //validate actual and expected message
        Assert.assertEquals("this is the message", expectedforgotpassword, actualforgotpassword);


    }
    @After
    public void tearDown() {
        //    closeBrowser();
    }
}