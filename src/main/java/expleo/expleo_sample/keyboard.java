package expleo.expleo_sample;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class keyboard {
	public static void main(String[]args) {
	ChromeDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    Actions action = new Actions(driver);
    driver.get("https://omayo.blogspot.com/");
    WebElement box1 = driver.findElement(By.xpath("//a[@href=\"http://jqueryui.com/\"]"));
    action.keyDown(Keys.CONTROL).moveToElement(box1).click().keyUp(Keys.CONTROL).build().perform();
    
	}	
}
