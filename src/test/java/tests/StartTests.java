package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StartTests {
    @Test
    public void firstTEst(){
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://telranedu.web.app/home");

        System.out.println("   hhhhh");

    }


}
