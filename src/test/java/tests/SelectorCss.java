package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SelectorCss {
    WebDriver driver = new ChromeDriver();
    @Test
    public void elementsHeaderIlCarro(){
        driver.get("https://ilcarro.web.app/search");
        driver.manage().window().maximize();
        WebElement btnSerch = driver.findElement(By.cssSelector("a[id='0']"));
        System.out.println(btnSerch.getText());
        WebElement btnLet = driver.findElement(By.cssSelector("a[ng-reflect-router-link='let-car-work']"));
        System.out.println(btnLet.getText());
        WebElement btnTermsOfUse = driver.findElement(By.cssSelector("a[href='/terms-of-use']"));
        System.out.println(btnTermsOfUse.getText());
        WebElement btnRegistration = driver.findElement(By.cssSelector("*[ng-reflect-router-link='registration']"));
        System.out.println(btnRegistration.getText());
        btnRegistration.click();
        driver.quit();
       // driver.close();
    }
}
