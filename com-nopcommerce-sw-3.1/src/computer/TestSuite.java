package computer;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import utility.Utility;

public class TestSuite extends Utility {
    String baseurl="https://demo.nopcommerce.com/";
    @Before
    public void openbrowser(){
        openbrowser(baseurl);
    }
    @Test
    public void Testname(){
   // find element to computer menu and cleck on it
        clickonelement(By.linkText("Computers"));
    //find element to desktop and cleck on it
        clickonelement(By.linkText("Desktops"));
        //select element to low to high
        selectByVisibleTextFromDropDown(By.id("products-orderby"),"Low To High");
        //validate text
        String expectedresult="";
        String actualtext=getTextFromElement(By.cssSelector(".page-body"));
        Assert.assertEquals(actualtext,expectedresult);
    }
    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        // find element to computer menu and cleck on it
        clickonelement(By.linkText("Computers"));
        //find element to desktop and cleck on it
        clickonelement(By.linkText("Desktops"));
        //select element to a to z
        clickonelement(By.id("products-orderby"));
        //find element on add to cart
        clickonelement(By.xpath("//button[@type='button' and@xpath='1']"));
        //verify the text element
        String expectedresults="Build your own computer";
        String actualresults=getTextFromElement(By.xpath("//h1[contains(text(),'Build your own computer')]"));
        Assert.assertEquals(expectedresults,actualresults);
        //select element to fild and sending element to Processor filed
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='product_attribute_1']"),"2.2 GHz Intel Pentium Dual-Core E2200");
        //select element to fild and sending element to RAM filed
        selectByVisibleTextFromDropDown(By.id("product_attribute_2"),"8GB [+$60.00]");
        //select element to HDD filed and sending elemnt to filed
        selectByVisibleTextFromDropDown(By.id("product_attribute_3_7"),"400 GB [+$100.00");
        //select element to OSfiled ans and click on it
        selectByVisibleTextFromDropDown(By.xpath("//input[@id='product_attribute_4_9']"),"Vista Premium [+$60.00]");
      //  Thread.sleep(3000);
        //click to box and cleck on it
        clickonelement(By.xpath("//input[@id='product_attribute_5_10']"));
        //find element box on it
        clickonelement(By.xpath("product_attribute_5_12"));
        //verify the price filed element
        String expetedtext="$1,435.00";
        String actualtext=getTextFromElement(By.xpath("//span[@id='price-value-1']"));
        Assert.assertEquals(expetedtext,actualtext);
        //find element on add to cart button
        clickonelement(By.xpath("//button[@id='add-to-cart-button-1']"));
        //verify the text on bar
        String expectedtext1="The product has been added to your shopping cart";
        String actualtext1=getTextFromElement(By.xpath("//a[contains(text(),'shopping cart')]"));
        //validate both result
        Assert.assertEquals(expectedtext1,actualtext1);
        //find element on X button
        clickonelement(By.cssSelector(".close"));
        //find element on shopping cart and cick on it
        mousehooveronelement(By.xpath("//span[contains(text(),'Shopping cart')]"));
        //find element on go to cart and click on it
        clickonelement(By.xpath("//button[contains(text(),'Go to cart')]"));
        //find element to text
        String expectedtext2="Shopping cart";
        String actualtext2=getTextFromElement(By.xpath("//h1[contains(text(),'Shopping cart')]"));
        //validate the results
        Assert.assertEquals(expectedtext2,actualtext2);
        getTextFromElement(By.xpath("//input[@id='itemquantity11216']"));
        //find element on update your cart and click on it
        clickonelement(By.xpath("//button[@id='updatecart']"));
        //verify the total amount text
        String expectamount3="Shopping cart";
        String actualamount3=getTextFromElement(By.xpath("//tbody/tr[1]/td[6]/span[1]"));
        //validate the results
        Assert.assertEquals(expectamount3,actualamount3);
        //find element on check box ans click on it
        clickonelement(By.xpath("//input[@id='termsofservice']"));
        //find element on checkout filed and click on it
        clickonelement(By.xpath("//button[@id='checkout']"));
        //verify the the text filed
        String expectedtext="Welcome, Please Sign In!";
        String actualtext0=getTextFromElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
        //velidate both results
        Assert.assertEquals(expectedtext,actualtext0);
        //filed element on text filed and click on it
        clickonelement(By.xpath("//button[contains(text(),'Checkout as Guest')]"));
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
        //find element on continur button
        Thread.sleep(3000);
        clickonelement(By.cssSelector(".button-1 shipping-method-next-step-button"));
        clickonelement(By.xpath("//input[@id='shippingoption_1']"));
        //find element on continue button
        clickonelement(By.xpath("//button[@class='button-1 payment-method-next-step-button']"));
        clickonelement(By.xpath("//input[@id='paymentmethod_1']"));
        //find element to payment method
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='CreditCardType']"),"master card");
        //find element to  card holdrer filed
        sendTextToElement(By.xpath("//input[@id='CardholderName']"),"s k patel");
        //find element to  card num filed
        sendTextToElement(By.xpath("//input[@id='CardNumber']"),"5676 7890 9876 6767");
        //find element to  card month filed
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='ExpireMonth']"),"07");
        //find element to  card ex. year filed
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='ExpireYear']"),"2022");
        //find element to  card back of 3 digit filed
        sendTextToElement(By.xpath("//input[@id='CardCode']"),"456");
        //fined element on continur button
        clickonelement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/button[1]"));
       // Thread.sleep(3000);

        //verify shiping method
        String expectedmethod="Shipping method";
        String actualmethod=getTextFromElement(By.xpath("//h2[contains(text(),'Shipping method')]"));
        Assert.assertEquals(expectedmethod,actualmethod);
        //
        String expectedthankyou="Thank you";
        String actualthankyou=getTextFromElement(By.xpath("//h1[contains(text(),'Thank you')]"));
        Assert.assertEquals(actualthankyou,expectedthankyou);
        //
        String expectedmessage="Your order has been successfully processed!";
        String actualmessage=getTextFromElement(By.xpath("Your order has been successfully processed!"));
        Assert.assertEquals(expectedmessage,actualmessage);
        //find element on continue and cleck on it
        clickonelement(By.xpath("//button[contains(text(),'Continue')]"));
        //verify text both messge
        String expectedtext£="Welcome to our store";
        String actualtext£=getTextFromElement(By.xpath("//h2[contains(text(),'Welcome to our store')]"));
        //vealidate both message
        Assert.assertEquals(expectedtext£,actualtext£);

    }
    @After
    public void closebrowser(){
        closebrowser();
    }


}