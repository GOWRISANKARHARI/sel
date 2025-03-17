package expleo.expleo_sample;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;
public class Handling_mul_windows {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    Actions action = new Actions(driver);
	    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("http://demoqa.com/browser-windows");
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".class")));
	    //util(ExpectedCondition.Visiblityof ElementLocated(By.cssSelector(".class")));
	    
	    String parent = driver.getWindowHandle();
	    System.out.println("Parents: "+parent);
	    Set<String>allWindowHandles = driver.getWindowHandles();
	    System.out.println("Coutn of windows :"+allWindowHandles.size());
	    driver.findElement(By.id("windowButton")).click();
	    Set<String>newallWindowHandles = driver.getWindowHandles();
	    System.out.println("new Coutn of windows :"+newallWindowHandles.size());
	    String parent1 = driver.getWindowHandle();
	    System.out.println("parent window :"+parent1);
	    Iterator<String> iterator = newallWindowHandles.iterator();
	    String mainwindow = iterator.next();
	    String childwindow = iterator.next();
	    System.out.println("parents windows: "+mainwindow);
	    System.out.println("child windows: "+childwindow);
	    driver.quit();
	    
	   
	    
	}
}
