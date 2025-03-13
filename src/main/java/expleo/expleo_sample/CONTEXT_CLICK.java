package expleo.expleo_sample;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class CONTEXT_CLICK {
	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
        Actions action = new Actions(driver);
        WebElement block = driver.findElement(By.className("gsc-input"));
        action.contextClick(block).perform();
        
	}
}
