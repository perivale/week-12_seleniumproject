package utility;

import browserfactory.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utility extends BaseTest {
    //this method will click on element
    public void clickelement(By by) {
        WebElement element = driver.findElement(by);
        element.click();
    }

    ///this method send text on element
    public void sendTextToElement(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    public String gettextfrom(By by){
        return  driver.findElement(by).getText();
    }
    public void getAllSize(By by,int a){
        WebElement size=driver.findElement(by);
        Select select=new Select(size);
        select.selectByValue("6");
    }

}
