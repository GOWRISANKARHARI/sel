package expleo.expleo_sample;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class App {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        
        	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
        
        WebElement ele_1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#reveal")));
        ele_1.click();
        
        	WebElement ele_2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#revealed")));
        ele_2.sendKeys("Gowrisankar");
       
        	System.out.println(ele_2.getDomProperty("value"));
        System.out.println("The output: " + ele_1.isDisplayed());

       
    }
}
