package testNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginRegister extends B1 {
    @Test
    public static void VerifyRegister() {
    	WebElement login = driver.findElement(By.xpath("//*[@face='Arial, Helvetica, sans-serif']/a"));
        login.click();
        List<WebElement> childElements1 = driver.findElements(By.xpath("//*[@style='font-family:Arial, Helvetica;font-size:13px;color:#000;padding:5px;']/input"));
        for(int i = 0; i<childElements1.size();i++) {
            childElements1.get(0).sendKeys("phuc123");
            childElements1.get(1).sendKeys("phuc321");
            break;
        }

        WebElement submitlogin = driver.findElement(By.xpath("//*[@name='submit']"));
        submitlogin.click();
    }
}