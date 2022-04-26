package basetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {
  public  static WebDriver driver;

    public  void openbrowser(String baseurl){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //set obj
        driver.get(baseurl);
        //manage window
        driver.manage().window().maximize();
        //get the implicit time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


    }
    public void closebrowser()
    {
        driver.close();
    }
}
