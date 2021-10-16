package testNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class B2 extends B1 {
    @Test
    public static void VerifyRegister() {
        WebElement w = driver.findElement(By.xpath("//*[@style= 'margin-left:20px;']/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));
        w.click();

        List<WebElement> childElements = driver.findElements(By.xpath("//*[@style='font-family:Arial, Helvetica;font-size:13px;color:#000;padding:5px;']/input"));
        for(int i = 0; i<childElements.size();i++) {
            childElements.get(0).sendKeys("Phuc");
            childElements.get(1).sendKeys("Pham");
            childElements.get(2).sendKeys("1234456789");
            childElements.get(3).sendKeys("phamquachvinhphuc@gmail.com");

            childElements.get(4).sendKeys("380/46/20/19B LeVanLuong");
            childElements.get(5).sendKeys("TP HCM");
            childElements.get(6).sendKeys("Phuong TanHung");
            childElements.get(7).sendKeys("113457178347");

            childElements.get(8).sendKeys("phuc123");
            childElements.get(9).sendKeys("phuc321");
            childElements.get(10).sendKeys("phuc321");
            break;
        }

        WebElement submit = driver.findElement(By.xpath("//*[@name='submit']"));
        submit.click();

        System.out.print("Tạo thành công!");
    }
}