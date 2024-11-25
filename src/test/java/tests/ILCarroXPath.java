package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class ILCarroXPath {
    WebDriver driver = new ChromeDriver();

    @Test

    public void typeRegForm() {
        driver.get("https://ilcarro.web.app/registration?url=%2Fsearch");
        driver.manage().window().maximize();
        WebElement inputName = driver.findElement(By.xpath("//input[@id='name']"));
        inputName.sendKeys("Margaryta");
        WebElement inputLastName = driver.findElement(By.xpath("//input[@id='lastName']"));
        inputLastName.sendKeys("Poloz");
        WebElement inputEmail = driver.findElement(By.xpath("//input[@formcontrolname='email']"));
        inputEmail.sendKeys("margarytapoloz@gmail.com");
        WebElement inputPassword = driver.findElement(By.xpath("//input[@formcontrolname='password']"));
        inputPassword.sendKeys("123456Margo!");
        driver.findElement(By.xpath("//label[@for='terms-of-use']")).click();

        //WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        //checkBox.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement btnSubmit = driver.findElement(By.xpath("//button[@type='submit']"));
        btnSubmit.click();
    }
}
