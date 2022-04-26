package shopping;

import com.beust.ah.A;
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

public class ShoppingTest extends Utility {

    public String baseurl = "https://mobile.x-cart.com/";

    @Before
    public void setup() {
        openbrowser(baseurl);
    }

    @Test
    public void verifyThatUserShouldPlaceOrderSuccessfullyForOllieTheAppControlledRobot() {
        Actions actions = new Actions(driver);
        WebElement hotdeal = driver.findElement(By.xpath("//span[contains(text(),'primary-title')]"));
        WebElement bestsellar = driver.findElement(By.xpath("//h1[@id='page-title']"));
        actions.moveToElement(hotdeal).moveToElement(bestsellar).click().build().perform();
        //verify the bestseller text
        String expectedtext = "Bestsellers";
        String actualtext = gettextfrom(By.xpath("//h1[@id='page-title']"));
        Assert.assertEquals(expectedtext, actualtext);
        //mouse hover on sort by menu and select a-z
        WebElement sortby = driver.findElement(By.xpath("//span[@class='sort-by-value']"));
        //and select element
        WebElement atoz = driver.findElement(By.xpath("//span[contains(text(),'Name A - Z')]"));
        Select select = new Select(atoz);
        //click on add to cart element
        clickelement(By.xpath("//li[@class='product-price-base'and@xpath='1']"));
        //verify the message
        String expectedmessage = "Product has been added to your cart";
        String actualmessage = gettextfrom(By.xpath("//li[contains(text(),'Product has been added to your cart')]"));
        Assert.assertEquals(actualmessage, expectedmessage);
        //click on close button to close message
        clickelement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]"));
        //click on cart icon and view cart
        clickelement(By.xpath("//div[@title='Your cart']"));
        clickelement(By.xpath("//a[@class='regular-button cart']"));
        //verify that your shoping cart -1
        String expectedmessage1 = "Your shopping cart - 1 items";
        String actualmessage1 = gettextfrom(By.cssSelector("#page-title"));
        //velidate results
        Assert.assertEquals(actualmessage1, expectedmessage1);
        //verify that subtotal
        String expectedresult="Subtotal:$1596.00";
        String actualresult=gettextfrom(By.xpath("//li[@class='subtotal'and@xpath='1']"));
        Assert.assertEquals(expectedresult,actualresult);
        //verify that totalamount);
        String expectedresult1="$1629.43";
        String actualresult1=gettextfrom(By.xpath("//span[contains(text(),'1629')]"));
        Assert.assertEquals(expectedresult,actualresult);
        //click on checkout button
        clickelement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[5]/button[1]"));
        //verify the text log in your acc
        String expectedresult2="Log in to your account";
        String actualresult2=gettextfrom(By.xpath("//h3[contains(text(),'Log in to your account')]"));
        Assert.assertEquals(expectedresult2,actualresult2);
        //find element to email and sending element
        sendTextToElement(By.xpath("//input[@id='login-email']"),"shilpa2@gmail.com");
        //findelement and click on it
        clickelement(By.xpath("//button[@type='submit' and@class='btn  regular-button anonymous-continue-button submit']"));
        //verify the text log in Securtiy checkout
        String expectedresult3="Secure Checkout";
        String actualresult3=gettextfrom(By.tagName("h1"));
        Assert.assertEquals(expectedresult3,actualresult3);
        //fill the mendetori filed
        sendTextToElement(By.xpath("//input[@id='shippingaddress-firstname']"),"shilpa");
        //find the latname fild element
        sendTextToElement(By.xpath("//input[@id='shippingaddress-lastname']"),"patel");
        //find element to add filed
        sendTextToElement(By.xpath("//input[@id='shippingaddress-street']"),"11 eden close");
        //find element to city filed
        sendTextToElement(By.xpath("//input[@id='shippingaddress-city']"),"London");
        //find element to country  filed
        sendTextToElement(By.xpath("//select[@id='shippingaddress-country-code']"),"india");
        //find element to state filed
        sendTextToElement(By.xpath("//input[@id='shippingaddress-custom-state']"),"gujrat");
        //find element to zipcode filed
        sendTextToElement(By.xpath("//input[@id='shippingaddress-zipcode']"),"395004");
        //find element to ph.num filed
        sendTextToElement(By.xpath("//input[@id='shippingaddress-phone']"),"9787876789");
        //find element to email and sending element
        sendTextToElement(By.xpath("//input[@id='login-email']"),"shilpa2@gmail.com");
        //check the check box by clecking on it
        clickelement(By.xpath("//input[@id='create_profile']"));
        //find element to password filed and sending password on it
        sendTextToElement(By.xpath("//input[@id='password']"),"Rushika234");
        //finding element to diliverymethod and click on it
        clickelement(By.id("method128"));
        //finding element to cod payment
        clickelement(By.id("pmethod6"));
        //verify the total amount
        String expectedamount="1596.43";
        String actualamount=gettextfrom(By.xpath("//span[contains(text(),'1596.43')]"));
        Assert.assertEquals(expectedamount,actualamount);
        //find element placeoder and click on it
        clickelement(By.xpath("//span[contains(text(),'Place order: $1632.03')]"));
        //find element to text and click on it
        String expectedtext1="";
        String actualtext1=gettextfrom(By.xpath("//h1[@id='page-title']"));
        Assert.assertEquals(expectedtext1,actualtext1);

    }

    @Test
    public void verifyThatUserShouldClearShoppingCartSuccessfully() {
        Actions actions = new Actions(driver);
        WebElement hotdeal = driver.findElement(By.xpath("//span[contains(text(),'primary-title')]"));
        WebElement bestsellar = driver.findElement(By.xpath("//h1[@id='page-title']"));
        actions.moveToElement(hotdeal).moveToElement(bestsellar).click().build().perform();
        //verify the bestseller text
        String expectedtext = "Bestsellers";
        String actualtext = gettextfrom(By.xpath("//h1[@id='page-title']"));
        Assert.assertEquals(expectedtext, actualtext);
        //mouse hover on sort by menu and select a-z
        WebElement sortby = driver.findElement(By.xpath("//span[@class='sort-by-value']"));
        //and select element
        WebElement atoz = driver.findElement(By.xpath("//span[contains(text(),'Name A - Z')]"));
        Select select = new Select(atoz);
        //click on add to cart button
        clickelement(By.xpath("//div[@ class='minicart-items-number' and @xpath='1']"));
        //verify the message
        String expectedmessage = "Product has been added to your cart";
        String actualmessage = gettextfrom(By.xpath("//li[contains(text(),'Product has been added to your cart')]"));
        Assert.assertEquals(actualmessage, expectedmessage);
        //click on close button to close message
        clickelement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]"));
        //click on cart icon and view cart
        clickelement(By.xpath("//div[@title='Your cart']"));
        clickelement(By.xpath("//a[@class='regular-button cart']"));
        //verify that your shoping cart -1
        String expectedmessage1 = "Your shopping cart - 1 items";
        String actualmessage1 = gettextfrom(By.cssSelector("#page-title"));
        //velidate results
        Assert.assertEquals(actualmessage1, expectedmessage1);
        //click on empty cart link
        clickelement(By.linkText("Empty your cart"));
        //hendle popup window and click on it
        //verify that text
        String expectedtext1 = "Are you sure you want to clear your cart?";
        String actualtext1 = gettextfrom(By.linkText("Are you sure you want to clear your cart?"));
        //velidate both results
        Assert.assertEquals(expectedtext1, actualtext1);
        clickelement(By.name(""));
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        //find element to text and click on it
        clickelement(By.xpath("//li[contains(text(),'Item(s) deleted from your cart')]"));
        //
        String expectedmessage3 = "Your cart is empty";
        String actualmessage3 = gettextfrom(By.xpath("//h1[@id='page-title'and@class='title']"));
        //velidate both result
        Assert.assertEquals(expectedmessage3, actualmessage3);


    }

    @After
    public void closebrowser() {

        closebrowser();
    }
}


