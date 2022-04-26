package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utiliti.Utility;

public class RegisterTest extends Utility {
    String baseurl = "https://parabank.parasoft.com/parabank/index.htm";

    @Before
    public void setup() {
        openbrowser(baseurl);

    }

    @Test
    public void verifyThatSigningUpPageDisplay() {
        //find element to regester filed and clickon
        clickelement(By.linkText("Register"));

        //verify the text
        String expectedtext = "Signing up is easy!";
        String actualtext = gettextfrom(By.xpath("//h1[@class='title']"));
        //validate actual and expected
        Assert.assertEquals(expectedtext, actualtext);

    }

    @Test
    public void userShouldRegisterAccountSuccessfully() {
        //find element to register filed and click on it
        clickelement(By.linkText("Register"));


        //find element to firstname and sending element to filed
        sendTextToElement(By.id("customer.firstName"),"Shilpa");

        //find element to lastname and sending element to filed
        sendTextToElement(By.xpath("//input[@name='customer.lastName']"),"Patel");

        //find element to add and sending element to filed
        sendTextToElement(By.id("customer.address.street"),"11 Eden close");

        //find element to city and sending element to filed
        sendTextToElement(By.xpath("//input[@class='input' and @name='customer.address.city']"),"London");

        //find elementto state and sending element to filed
        sendTextToElement(By.name("customer.address.state"),"London");

        //find element to zipcode and sending element to filed
        sendTextToElement(By.id("customer.address.zipCode"),"NW4 1DD");

        //find element to phonenumber and sending element to filed
       sendTextToElement(By.name("customer.phoneNumber"),"07867567865");

        //find element to ssn number and sending element to filed
        sendTextToElement(By.xpath("//input[@id='customer.ssn']"),"721-07-1426");

        //find element to username and sending element to filed
        sendTextToElement(By.xpath("//input[@id='customer.username']"),"shilpa2@gmail.com");

        //find password to password filed and sending element to filed
        sendTextToElement(By.xpath("//input[@id='customer.password']"),"1234556");

        //find element to confirm passoerd and sending element to conform passwordfiled
        sendTextToElement(By.xpath("//input[@id='repeatedPassword']"),"1234556");

        //find element to register butooton and click on it
        clickelement(By.tagName("input"));

        //find
        String expectedresults="Your account was created successfully. You are now logged in.";
        String actualresults=gettextfrom(By.xpath("//p[(text(),'Your account was created successfully. You are now logged in.')]"));
        //validate actual and expected text
        Assert.assertEquals(expectedresults,actualresults);
    }@After
    public void closeBrowser() {

        driver.quit();
    }
}
