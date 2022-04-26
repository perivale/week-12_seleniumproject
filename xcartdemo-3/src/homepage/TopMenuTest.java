package homepage;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utiliti.Utility;

public class TopMenuTest extends Utility {


    public String baseurl = "https://mobile.x-cart.com/";

    @Before
    public void setup() {
        openbrowser(baseurl);
    }

    @Test
    public void verifyUserShouldNavigateToShippingPageSuccessfully() {
        //find element to shiping link and click on it
        clickelement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[3]"));
        //verify shiping link
        String expectedtext = "Shipping";
        String actualtext = gettextfrom(By.id("page-title"));
        //valide both text
        Assert.assertEquals(expectedtext, actualtext);

    }

    @Test
    public void verifyUserShouldNavigateToNewPageSuccessfully() {
        //find element to new inlk and cleck on it
        clickelement(By.xpath("//span[contains(text(),'New!')]/following::li[class='leaf']"));
        //verify new link
        String expectedtext = "New arrivals";
        String actualtext = gettextfrom(By.id("page-title"));
        //validate both text
        Assert.assertEquals(expectedtext, actualtext);
    }

    @Test
    public void verifyUserShouldNavigateToComingsoonPageSuccessfully() {
        //find element to coming soon link and click on it
        clickelement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[5]/a[1]/span[1]"));
        //verify results
        String expectedtext = "Coming soon";
        String actualtext = gettextfrom(By.id("//h1[@id='page-title']"));
        Assert.assertEquals(expectedtext, actualtext);
    }

    @Test
    public void verifyUserShouldNavigateToContactUsPageSuccessfully() {
        //find element on contect us text
        clickelement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[6]/a[1]/span[1]"));
        //verify results
        String expectedrusult = "Contact us";
        String actualresult = gettextfrom(By.xpath(""));
        Assert.assertEquals(expectedrusult, actualresult);

    }

    @After
    public void tearDown() {
        //    closeBrowser();
    }
}
