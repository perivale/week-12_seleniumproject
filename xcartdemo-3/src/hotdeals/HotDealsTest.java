package hotdeals;

import org.checkerframework.checker.units.qual.A;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utiliti.Utility;

public class HotDealsTest extends Utility {

    public String baseurl = "https://mobile.x-cart.com/";

    @Before
    public void setup() {
        openbrowser(baseurl);
    }

    @Test
    public void verifySaleProductsArrangeAlphabetically() {
        Actions actions = new Actions(driver);
        WebElement hotdeal = driver.findElement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/span[1]"));
        WebElement sale = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]/span[1]"));
        actions.moveToElement(hotdeal).moveToElement(sale).click().build().perform();
        //find element to sale link and click on it
        clickelement(By.id("page-title"));
        //mouse hover on sort by menu and select a-z
        WebElement sortby = driver.findElement(By.xpath("//span[@class='sort-by-value']"));
        //and select element
        WebElement atoz = driver.findElement(By.xpath("//span[contains(text(),'Name A - Z')]"));
        Select select = new Select(atoz);
        //verify the product arrange alphabetically
        String expectedtext = "Avengers: Fabrikations Plush";
        String actualtext = gettextfrom(By.xpath("//img[@width='160'and@height='105']"));
        //verify both result
        Assert.assertEquals(expectedtext, actualtext);


    }

    @Test
    public void verifySaleProductsPriceArrangeLowToHigh() {
        Actions actions = new Actions(driver);
        WebElement hotdeal = driver.findElement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/span[1]"));
        WebElement sale = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]/span[1]"));
        actions.moveToElement(hotdeal).moveToElement(sale).click().build().perform();
        //find element to sale link and click on it
        clickelement(By.id("page-title"));
        //mouse hover on sort by menu and select low to high
        WebElement sortby = driver.findElement(By.xpath("//span[@class='sort-by-value']"));
        //and select element to low to high
        WebElement lowtohigh = driver.findElement(By.xpath("//a[@data-sort-by='p.price']/parent::li[@class='list-type-grid  selected']"));
        Select select = new Select(lowtohigh);
        //verify the product arrange alphabetically
        String expectedtext = "Avengers: Fabrikations Plush";
        String actualtext = gettextfrom(By.xpath("//img[@width='160'and@height='105']"));
        //verify both result
        Assert.assertEquals(expectedtext, actualtext);
    }

    @Test
    public void verifySaleProductsArrangeByRates() {
        Actions actions = new Actions(driver);
        WebElement hotdeal = driver.findElement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/span[1]"));
        WebElement sale = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]/span[1]"));
        actions.moveToElement(hotdeal).moveToElement(sale).click().build().perform();
        //find element to sale link and click on it
        clickelement(By.id("page-title"));
        //mouse hover on sort by menu and select sort by
        WebElement sortby = driver.findElement(By.xpath("//span[@class='sort-by-value']"));
        //and select element to rates
        WebElement rates = driver.findElement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[7]/a[1]"));
        Select select = new Select(rates);
        //verify the product arrange rates
        String expectedtext = "Avengers: Fabrikations Plush";
        String actualtext = gettextfrom(By.xpath("//img[@width='160'and@height='105']"));
        //verify both result
        Assert.assertEquals(expectedtext, actualtext);
    }

    @Test
    public void verifyBestSellersProductsArrangeByZToA() {
        Actions actions = new Actions(driver);
        WebElement hotdeal = driver.findElement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/span[1]"));
        WebElement sale = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]/span[1]"));
        actions.moveToElement(hotdeal).moveToElement(sale).click().build().perform();
        //find element to sale link and click on it
        clickelement(By.id("page-title"));
        //mouse hover on sort by menu and select sort by
        WebElement sortby = driver.findElement(By.xpath("//span[@class='sort-by-value']"));
        //and select element to ztoa
        WebElement ztoa = driver.findElement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[6]/a[1]"));
        Select select = new Select(ztoa);
        //verify the product arrange ztoa
        String expectedtext = "Avengers: Fabrikations Plush";
        String actualtext = gettextfrom(By.xpath("//img[@width='160'and@height='105']"));
        //verify both result
        Assert.assertEquals(expectedtext, actualtext);
    }

    @Test
    public void verifyBestSellersProductsPriceArrangeHighToLow() {
        Actions actions = new Actions(driver);
        WebElement hotdeal = driver.findElement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/span[1]"));
        WebElement sale = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]/span[1]"));
        actions.moveToElement(hotdeal).moveToElement(sale).click().build().perform();
        //find element to sale link and click on it
        clickelement(By.id("page-title"));
        //mouse hover on sort by menu and select sort by
        WebElement sortby = driver.findElement(By.xpath("//span[@class='sort-by-value']"));
        //and select element to high to low
        WebElement hightolow = driver.findElement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]"));
        Select select = new Select(hightolow);
        //verify the product arrange hightolow
        String expectedtext = "Avengers: Fabrikations Plush";
        String actualtext = gettextfrom(By.xpath("//img[@width='160'and@height='105']"));
        //verify both result
        Assert.assertEquals(expectedtext, actualtext);
    }

    @After
    public void tearDown() {
        //    closeBrowser();
    }

}
