package Test.java;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsefulMethods {
    public static void main(String args[]) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/index.php?route=account/login");
        driver.findElement(By.name("email")).sendKeys("Ishan");
        String ActualValue = driver.findElement(By.name("email")).getAttribute("value");
        if (ActualValue.equals("Ishan")) {
            System.out.println("Testcase is Passed");
        } else {
            System.out.println("Test case not passed");}}}