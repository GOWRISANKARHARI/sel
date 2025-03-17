package expleo.expleo_sample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
public class calender_pro {
	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
        WebElement bro = driver.findElement(By.xpath("//input[@id=\"datepicker\"]"));
        bro.click();
        bro.sendKeys("08/25/2045");
        //WebElement year = driver.findElement(By.id("ui-datepicker-year"));
        //System.out.println("Year: "+year.getText());
        
        
	}
	

}
