package assignments;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import java.time.Duration;
import java.util.List;

public class mart {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://www.relianceretail.com/reliance-market.html");
        WebElement element1_1 = driver.findElement(By.xpath("//ul [@class=\"brand-list\"]//a[text()='JioMart']"));
        //WebElement element1_2=driver.findElement(By.cssSelector("ul[class=\"brand-list\"] li:nth-of-type(5) a"));
        //WebElement element1_3=driver.findElement(By.cssSelector("//ul[@class=\"brand-list\"]//a[ends-with(text(), 'JioMart')]\r\n"));
        element1_1.click();
        
        WebElement element2=driver.findElement(By.cssSelector("a[href=\"http://www.jiomart.com\"]"));
        element2.click();
        
        WebElement element3=driver.findElement(By.className("class=\"artdeco-icon lazy-loaded\""));
        element3.clear();
        
        WebElement element4=driver.findElement(By.id("btn_pin_code_delivery"));
        element4.clear();
       
        
}
}