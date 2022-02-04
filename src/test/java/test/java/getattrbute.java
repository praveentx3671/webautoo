package test.java;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.awt.geom.AreaOp;

public class getattrbute {
    public static void main(String args[])
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.opencart.com/index.php?route=account/login");
        driver.findElement(By.name("email")).sendKeys("praveen");
        String ActualValue=driver.findElement(By.name("email")).getAttribute("value");
        if(ActualValue.equals("praveen"))
        {
            System.out.println("pased");
        }
        else
        {
            System.out.println("fail");
        }
    }
}
