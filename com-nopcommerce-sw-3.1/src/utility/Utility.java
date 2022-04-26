package utility;

import basetest.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utility extends BaseTest {
        //this methos is for click on element
    public void clickonelement(By by) {
        WebElement element = driver.findElement(by);
      element.click();

    }
    //this method will get text from element
    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();

    }
    public void selectByVisibleTextFromDropDown(By by,String text) {
        WebElement dropDown = driver.findElement(by);
        Select select = new Select(dropDown);
        select.selectByVisibleText(text);
    }
    public void mousehooveronelement(By by){
        WebElement mousehover=driver.findElement(by);
        Select select=new Select(mousehover);
        select.getOptions();
    }
    public void mousehooveronelement1(By by,String name){
        WebElement mousehover1=driver.findElement(by);
        Select select=new Select(mousehover1);
        select.getOptions();}

    //this method will send 2 elements
    public void sendTextToElement(By by, String text) {

        driver.findElement(by).sendKeys(text);
    }}

