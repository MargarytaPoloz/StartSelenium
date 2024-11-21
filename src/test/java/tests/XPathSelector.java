package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XPathSelector {
    WebDriver driver = new ChromeDriver();

    @Test

    public void methodXPath()
    {
      driver.get("https://telranedu.web.app/login");
        WebElement inputEmail = driver.findElement(By.xpath("//form/input[1]"));
inputEmail.sendKeys("123456@mail.com");
WebElement inputPassvord = driver.findElement(By.xpath("//input[@name='password']"));
        inputPassvord.sendKeys("Password1!");
        WebElement btnRegistration = driver.findElement(By.xpath("//form/button[last()]"));
        btnRegistration.click();
    }
}
