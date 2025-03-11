package expleo.expleo_sample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WEB {
    ChromeDriver driver;

    public void launchBrowser() {
        WebDriverManager.chromedriver().setup(); 
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        WebElement search_box = driver.findElement(By.name("q"));
		search_box.sendKeys("safari bag"+Keys.ENTER);
        
    }

}
