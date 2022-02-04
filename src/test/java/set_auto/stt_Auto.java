package set_auto;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class stt_Auto {
    public WebDriver driver;
    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        System.out.println("setup completed");
    }
    @AfterMethod
    public void teardown(){
        driver.quit();
        System.out.println("teardown completed");
    }


    @Test

    public void textverify(){
       // System.setProperty("Webdriver.chrome.driver",System.getProperty("user.dir")+"/src/test/resources/chromedriver.exe");
        //System.out.println(System.getProperty("user.dir"));


        String val = driver.findElement(By.xpath("//a[normalize-space()='Your Store']")).getText();
        Assert.assertEquals(val,"Your Store");
        System.out.println("textVerify Test Case Passed");

    }
    @Test
    public void Login(){
        // System.setProperty("Webdriver.chrome.driver",System.getProperty("user.dir")+"/src/test/resources/chromedriver.exe");
        //System.out.println(System.getProperty("user.dir"));



        driver.findElement(By.xpath("//span[@class='caret']")).click();
        driver.findElement(By.linkText("Login")).click();
        System.out.println("Login Test Case Passed");


    }
}
