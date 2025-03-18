package expleo.expleo_sample;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;

public class javaScript_sample {
	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("alert('welcome')");
        js.executeScript("document.getElementById('alert1').click()");
        //System.out.println(js.getClass());
        
        
	}
}
