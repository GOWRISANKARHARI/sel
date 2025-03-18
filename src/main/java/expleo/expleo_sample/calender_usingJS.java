package expleo.expleo_sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
public class calender_usingJS {

		public static void main(String[] args)
		{
			 ChromeDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		        WebElement cal = driver.findElement(By.id("datepicker"));
		        javaScriptClick(driver, cal,"08/25/2045");
		}
		public static void javaScriptClick(WebDriver driver, WebElement element, String day) {
		    JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("arguments[0].style.backgroundColor='2px solid red';", element);
		    try {
		        Thread.sleep(500);
		    } catch (InterruptedException e) {
		        e.printStackTrace();
		    }
		    js.executeScript("arguments[0].value=arguments[1];", element, day);
		    js.executeScript("arguments[0].style.border='';", element);
		    
		    element.sendKeys(Keys.ENTER);
		}

}
