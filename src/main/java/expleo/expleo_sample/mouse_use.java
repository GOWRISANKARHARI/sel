package expleo.expleo_sample;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class mouse_use {
	public static void main(String []args)
	{
		ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
        WebElement block = driver.findElement(By.id("blogsmenu"));
        Actions action = new Actions(driver);
        action.moveToElement(block).perform();
        WebElement option2 = driver.findElement(By.xpath("//spaan[text()='SeleniumByArun'"));
        action.moveToElement(option2).click().build().perform();
        
	}

}
