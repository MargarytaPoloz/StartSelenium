package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

public class elementsHeaderIlCarro {
    WebDriver driver = new ChromeDriver();
    @Test
    public void testIlCarro(){

        driver.navigate().to("https://ilcarro.web.app/search");


    }
}
