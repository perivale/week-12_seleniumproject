package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utiliti.Utility;

public class LoginTest  extends Utility {
    String baseurl="http://the-internet.herokuapp.com/login";
    @Before
    public void setup(){

        openBrowser(baseurl);
    }

    @Test
    public void userShouldLoginInSuccessfullyWithValidCrentals(){
        //find the username filed element
        gettexttoelement(By.id("username"),"tomsmith");

        //find the password filed element

        gettexttoelement(By.name("password"),"SuperSecretPassword");

        //find elementin login button and click on login button
        clickonelement(By.xpath("//i[contains(text(),'Login')]"));


        String expectedrusult="Secure Area.";
        //find the element text element and get the text
       String actualresult= gettextfromelement(By.xpath("//h4[@class='subheader']"));
        //validate actual and expected results
        Assert.assertEquals(expectedrusult,actualresult);


    }

    @Test
    public void verifyTheUsernameErrorMessage(){
        //find the username filed element
        gettexttoelement(By.id("username"),"tomsmith1");

        //find the password filed element
        gettexttoelement(By.name("password"),"SuperSecretPassword!");

        //find elementin login button and click on login button
        clickonelement(By.xpath("//i[contains(text(),'Login')]"));
       //validate both result
        String expectedresult="Your password is invalid!";
        String actualresult=gettextfromelement(By.xpath("//div[@id='flash']"));
        Assert.assertEquals(expectedresult,actualresult);

    }
    @Test
    public void verifyThePasswordErrorMessage(){
        //find the username filed element
        gettexttoelement(By.id("username"),"tomsmith");

        //find the password filed element
        gettexttoelement(By.name("password"),"SuperSecretPassword!");

        //find elementin login button and click on login button
        clickonelement(By.xpath("//i[@class='fa fa-2x fa-sign-in']"));

        String expectedresults="You logged into a secure area!";
        String actualresults=gettextfromelement(By.className("flash"));
        //validate actual and expected message
        Assert.assertEquals(expectedresults,actualresults);

    }
    @After
    public void closebrowser(){

        //driver.close();
    }
}

