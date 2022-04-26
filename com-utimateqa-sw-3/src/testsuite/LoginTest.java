package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utiliti.Utility;

public class LoginTest extends Utility {
    String baseurl="https://courses.ultimateqa.com/";
    @Before
    public void setup(){
        openBrowser(baseurl);
    }
    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){
        //find element to singin link element and click on it
        clickelement(By.xpath("//header/div[1]/div[1]/section[1]/ul[1]/li[1]/a[1]"));


        String expectedresultes="Welcome Back!";
        String actualresultes=gettextfrom(By.xpath("//h1[contains(text(),'Welcome Back!')]"));
        //validate expectedresult and actualresult
        Assert.assertEquals(expectedresultes,actualresultes);

    }
    @Test
    public void verifyTheErrorMessage(){
        //find element to singin link element and click on it
        clickelement(By.xpath("//header/div[1]/div[1]/section[1]/ul[1]/li[1]/a[1]"));

        //find element to username filed and sending element
        sendTextToElement(By.id("user[email]"),"shilpa2_2010@yahoo.in");

        //find element to password filed and sending element
        sendTextToElement(By.name("user[password]"),"shh12345");

        //find element to login field and click onit
        clickelement(By.xpath("//input[@value='Sign in']"));

        //valid results
        String expectedresult="Invalid email or password.";
        String actualresult=gettextfrom(By.xpath("//li[@class='form-error__list-item']"));
        //compare actual and expected
        Assert.assertEquals(expectedresult,actualresult);
        //    System.out.println(actualresult);






    }

    @After
    public void tearDown() {
        //    closeBrowser();
    }
}


