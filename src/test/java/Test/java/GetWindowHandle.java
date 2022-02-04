package Test.java;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class GetWindowHandle {
    public static void main(String args[]){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("E:\\SimpleAlert.html");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[text='Click on me")).click();
        Set<String> s=driver.getWindowHandles();
        Iterator<String> itr=s.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
    }


    }
}
