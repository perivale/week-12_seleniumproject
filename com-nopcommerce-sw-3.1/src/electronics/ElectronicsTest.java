package electronics;

import org.checkerframework.checker.units.qual.A;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ButtonReleaseAction;
import utility.Utility;

public class ElectronicsTest extends Utility {
    String baseurl = "https://demo.nopcommerce.com/";

    @Before
    public void openbrowser() {
        openbrowser(baseurl);
    }

    @Test
    public void textverified() {
         //find text to electric filed
         mousehooveronelement(By.linkText("Electronics"));
         //find element tofiled and click on it
        mousehooveronelement(By.linkText("Cell phones"));
        //verify text cell phone filed
        String expecttext="Cell phones";
        String actualtext=getTextFromElement(By.xpath("//h1[contains(text(),'Cell phones')]"));
        //velidate both result
        Assert.assertEquals(expecttext,actualtext);

    }
    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully(){
        //find text to electric filed
        mousehooveronelement(By.linkText("Electronics"));
        //find element tofiled and click on it
        mousehooveronelement(By.linkText("Cell phones"));
        //verify text cell phone filed
        String expecttext="Cell phones";
        String actualtext=getTextFromElement(By.xpath("//h1[contains(text(),'Cell phones')]"));
        //velidate both result
        Assert.assertEquals(expecttext,actualtext);
        //find element on gid view list
        clickonelement(By.xpath("//a[contains(text(),'List')]"));
        //find element on mobile filed and cleck on it
        clickonelement(By.xpath("//a[contains(text(),'Nokia Lumia 1020')]"));
        //verify text filed element
        String expectedresult="Nokia Lumia 1020";
        String actualresult=getTextFromElement(By.xpath("//a[contains(text(),'Nokia Lumia 1020')]"));
        //verify both result
        Assert.assertEquals(expectedresult,actualresult);
        //verify the price
        String expectedprice="$349.00";
        String actualprice=getTextFromElement(By.xpath("//span[contains(text(),'$349.00')]"));
        //velidate text
        Assert.assertEquals(expectedprice,actualprice);
        //find element to filed
        clickonelement(By.xpath("//button[@onclick='return AjaxCart.addproducttocart_catalog/addproducttocart/catalog/20/1/1),!1']"));
        //find element totext filed
        String expectedbarmessage="The product has been added to your shopping cart";
        String actualbarmessge=getTextFromElement(By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]"));
        //velidate both meeasge
        Assert.assertEquals(expectedbarmessage,actualbarmessge);
        //find element to filed and cick on it
        clickonelement(By.xpath("//div[@id='bar-notification']"));
        //mousehover and click on it
        Actions actions=new Actions(driver);
        //shoping cart and mouse hoveer ing find elementand click
        WebElement shopingcart=driver.findElement(By.xpath("//span[contains(text(),'Shopping cart')]"));

        actions.moveToElement(shopingcart).click().build().perform();
        clickonelement(By.xpath("//button[@contains(text(),'Go to cart')]"));
        //find element to shoping cart
        String expectedmessage="Shopping cart";
        String actualmessage=getTextFromElement(By.xpath("//h1[contains(text(),'Shopping cart')]"));
        //velidate the message
        Assert.assertEquals(expectedmessage,actualmessage);
        //find element toprize is 2 and
        String expectedprize="2";
        String actualprize=getTextFromElement(By.xpath("//input[@id='itemquantity11282']"));
        //velidate both prize
        Assert.assertEquals(expectedprize,actualprize);
        //verify cose and find element
        String  expectedcost="$698.00";
        String actualcost=getTextFromElement(By.xpath("//span[@class='product-subtotal']"));
        //velidate both cost and find element
        Assert.assertEquals(expectedcost,actualcost);
        //find element on check term of service and cleck on it
        clickonelement(By.xpath("//input[@id='termsofservice']"));
        //find element on checkout and click on it
        clickonelement(By.xpath("//button[@id='checkout']"));///
        //verify the the text filed
        String expectedtext="Welcome, Please Sign In!";
        String actualtext0=getTextFromElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
        //velidate both results
        Assert.assertEquals(expectedtext,actualtext0);
        //find element on register button and cick onit
        clickonelement(By.xpath("//button[contains(text(),'Register')]"));
        //find element on registerbutton and velidate text
        String expectedbutton="Register";
        String actualbutton=getTextFromElement(By.xpath("//h1[contains(text(),'Register')]"));
        //velidate both results
        Assert.assertEquals(expectedbutton,actualbutton);
        //find element on fristname and sending elementon it
        sendTextToElement(By.xpath("//input[@id='FirstName' and @name='FirstName']"),"shilpa");
        //find element on lastname and sendinfg text on it
        sendTextToElement(By.xpath("//input[@id='LastName']"),"patel");
        //find element on email and sending text on it
        sendTextToElement(By.xpath("//input[@id='Email']"),"shilpa2_2010@yahoo.com");
        //find element onpassword and sending text on it
        sendTextToElement(By.xpath("//input[@id='Password']"),"shh12345");
        //find element on confrompassword and sendnig text on it
        sendTextToElement(By.xpath("//input[@id='ConfirmPassword']"),"shh12345");
        //find element on register button and cleck on it
        clickonelement(By.cssSelector("#register-button"));
        //verify the text and validate text
        String expectedmessage2="Your registration completed";
        String actualmessage2=getTextFromElement(By.xpath("//div[contains(text(),'Your registration completed')]"));
        //velidate both result
        Assert.assertEquals(actualmessage2,expectedmessage2);
        String expectamount3="Shopping cart";
        String actualamount3=getTextFromElement(By.xpath("//tbody/tr[1]/td[6]/span[1]"));
        //validate the results
        Assert.assertEquals(expectamount3,actualamount3);
        //find element to checkout button and click on it
        clickonelement(By.xpath("//button[@id='checkout']"));
        //find textfiled and sending text filed
        sendTextToElement(By.xpath("//input[@id='BillingNewAddress_FirstName']"),"shilpa");
        //find text element to last name text filed
        sendTextToElement(By.xpath("//input[@id='BillingNewAddress_LastName']"),"patel");
        //find text email id filed and sending text filed
        sendTextToElement(By.xpath("//input[@id='BillingNewAddress_Email']"),"shilpa2@gmail.com");
        //find text to country filed and sending test to filed
        sendTextToElement(By.xpath("//input[@id='BillingNewAddress_country']"),"UK");
        //find text to city filed and sendnig city filed AND ADD FILED
        sendTextToElement(By.xpath("//input[@id='BillingNewAddress_city']"),"london");
        sendTextToElement(By.xpath("//input[@id='BillingNewAddress_Address1']"),"11,eden close");
        //find element to postcode and sending text to filed
        sendTextToElement(By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']"),"HA0 1DB");
        sendTextToElement(By.xpath("//input[@id='BillingNewAddress_PhoneNumber']"),"087878987800");
        //find element on continue button
        clickonelement(By.xpath("//button[text()='Go to cart']"));
        //find element on radio button and click on it
        clickonelement(By.xpath("//input[@id='shippingoption_2']"));
        //click on contunuw button
        clickonelement(By.xpath("//button[text()='Continue']//parent::div[@id='billing-buttons-container']"));
        //  ************************
        //select radio button and click on it
        clickonelement(By.xpath("//input[@id='paymentmethod_1']"));
        //find element on continue button and click on it
        clickonelement(By.xpath("//button[text()='Continue']//parent::div[@id='payment-method-buttons-container']"));
        //*********************
        //find element toselect visa filed and select by drop menu button
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='CreditCardType']"),"Master card");
        //find element to cardholdername and and sending text
        sendTextToElement(By.xpath("//input[@id='CardholderName']"),"s k patel");
        //find elemet to card num filed and sending text
        sendTextToElement(By.xpath("//input[@id='CardNumber']"),"1234 5678 9898 5678");
        //find element to month filed by drop menu
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='ExpireMonth']"),"07");
        //find element to year filed by drop menu filed
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='ExpireYear']"),"2022");
        //find element to 3digit num of element and sending text
        sendTextToElement(By.xpath("//input[@id='CardCode']"),"234");
        //find element to continue button and click on it
        clickonelement(By.xpath("//button[text()='Continue']//parent::div[@id='billing-buttons-container'"));
        ////find element to text
        String expectedtext2="Shopping cart";
        String actualtext2=getTextFromElement(By.xpath("//h1[contains(text(),'Shopping cart')]"));
        //validate the results
        Assert.assertEquals(expectedtext2,actualtext2);
        //verify payment method
        String expectedmethod="Payment method";
        String actualmethod=getTextFromElement(By.xpath("//input[@id='paymentmethod_1']"));
        Assert.assertEquals(expectedmethod,actualmethod);
        //verify shilpping method and velidate text
        String expectedtext1="Shipping method";
        String actualtext1=getTextFromElement(By.xpath("//h2[contains(text(),'Shipping method')]"));
        Assert.assertEquals(expectedtext1,actualtext1);
        //verify totaal and velidate text
        String  expectedcost2="$698.00";
        String actualcost2=getTextFromElement(By.xpath("//span[@class='product-subtotal']"));
        //velidate both cost and find element
        Assert.assertEquals(expectedcost2,actualcost2);/////
        //find element on thank you and velidate the text
        String expectedthankyou="Thank you";
        String actualthankyou=getTextFromElement(By.xpath("//h1[contains(text(),'Thank you')]"));
        Assert.assertEquals(actualthankyou,expectedthankyou);
        //find element on text and velidate text
        String expectedmessage3="Your order has been successfully processed!";
        String actualmessage3=getTextFromElement(By.xpath("Your order has been successfully processed!"));
        Assert.assertEquals(expectedmessage3,actualmessage3);
        //find element on continue and cleck on it
        clickonelement(By.xpath("//button[contains(text(),'Continue')]"));
        //verify text both messge
        String expectedtext£="Welcome to our store";
        String actualtext£=getTextFromElement(By.xpath("//h2[contains(text(),'Welcome to our store')]"));
        //vealidate both message
        Assert.assertEquals(expectedtext£,actualtext£);
        //find element on log out link
        clickonelement(By.linkText("Log out"));
        //verify the url and find text on it
        String expectedurl="https://demo.nopcommerce.com/";
        String actualurl=baseurl;
        Assert.assertEquals("verify url:"+expectedurl,actualurl);


    }
    @After
    public void closebrowser(){
        closebrowser();
    }














    }





