package testsuite;

import browserfactory.BestTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utiliti.Utility;

public class TopMenuTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public  void userShouldNavigateToComputerPageSuccessfully(){
        clickelement(By.linkText("Computers"));
        //this is from requrment
        String expectedresult="Computers";
        String actualresults=gettextfrom(By.linkText("Computers"));
        Assert.assertEquals(expectedresult,actualresults);
    }
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
        clickelement(By.linkText("Electronics"));
        //this is from requrment
        String expectedresult="Electronics";
        String actualresults=gettextfrom(By.linkText("Electronics"));
        Assert.assertEquals(expectedresult,actualresults);
    }
    @Test
    public  void userShouldNavigateToApparelPageSuccessfully(){
        clickelement(By.linkText("Apparel"));
        //this is from requrment
        String expectedresult="Apparel";
        String actualresults=gettextfrom(By.linkText("Apparel"));
        Assert.assertEquals(expectedresult,actualresults);
    }
    @Test
    public  void userShouldNavigateToDigitalDownloadsSuccessfully(){
        clickelement(By.linkText("Digital downloads"));
        //this is from requrment
        String expectedresult="Digital downloads";
        String actualresults=gettextfrom(By.linkText("Digital downloads"));
        Assert.assertEquals(expectedresult,actualresults);
    }
    @Test
    public  void userShouldNavigateToBookspageSuccessfully() {
        clickelement(By.linkText("Books"));
        //this is from requrment
        String expectedresult = "Books";
        String actualresults = gettextfrom(By.linkText("Books"));
        Assert.assertEquals(expectedresult, actualresults);
    }
    @Test
    public  void userShouldNavigateToJewelrypageSuccessfully() {
        clickelement(By.linkText("Jewelry"));
        //this is from requrment
        String expectedresult = "Jewelry";
        String actualresults = gettextfrom(By.linkText("Jewelry"));
        Assert.assertEquals(expectedresult, actualresults);
    }
    @Test
    public  void userShouldNavigateToGiftCardspageSuccessfully() {
        clickelement(By.linkText("Gift Cards"));
        //this is from requrment
        String expectedresult = "Gift Cards";
        String actualresults = gettextfrom(By.linkText("Gift Cards"));
        Assert.assertEquals(expectedresult, actualresults);
    }
    @After
    public void closebrowser() {

        //driver.close();
    }







}
