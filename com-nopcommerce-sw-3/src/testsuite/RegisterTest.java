package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utiliti.Utility;

public class RegisterTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {

        //find element to register element
        clickelement(By.xpath("//a[@class='ico-register']"));

        String expectedlink = "Register";
        String actuallink = gettextfrom(By.xpath("//a[contains(text(),'Register')]"));
        //validate actual and expected element
        Assert.assertEquals(actuallink, expectedlink);

    }

    @Test
    public void userSholdRegisterAccountSuccessfully() {
        //find element on register element
        clickelement(By.xpath("//a[@class='ico-register']"));

        //find element to gender radio button
        clickelement(By.name("Gender"));

        //find filed in frist name filed and sending text to filed
        sendTextToElement(By.id("FirstName"), "shilpa");

        //find element to lastnamefiled
        sendTextToElement(By.name("LastName"), "patel");

        //sending element to date of birthday and sending text to filed
        sendTextToElement(By.name("DateOfBirthDay"), "2");


        //sending element to month filed and seding text to filed
        sendTextToElement(By.name("DateOfBirthMonth"), "april");

        //find element to birth year element
        sendTextToElement(By.name("DateOfBirthYear"), "1998");


        //find element to email filed
        sendTextToElement(By.id("Email"), "shilpa2@gmail.com");


        //find element to password filed
        sendTextToElement(By.id("Password"), "shilpa");

        //find element to confirmpassword filed
        sendTextToElement(By.id("ConfirmPassword"), "shilpa");

        //find element to registerbutton filed

        clickelement(By.id("register-button"));

        //verify rigtertext filed
        String expectedtext = "Your registration completed";
        String actualtext = gettextfrom(By.cssSelector("div.result"));
        //validate expected and actual text
        Assert.assertEquals(actualtext, expectedtext);

    }


    @After
    public void closebrowser() {

        //driver.close();
    }
}



