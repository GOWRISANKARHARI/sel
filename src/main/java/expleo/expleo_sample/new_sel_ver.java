package expleo.expleo_sample;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class new_sel_ver {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/dashboard.xhtml");
		String parent = driver.getWindowHandle();
		System.out.println("Parent title "+driver.getTitle());
		System.out.println("Parent window : " +parent);
		Set<String> window = driver.getWindowHandles();
		System.out.println("count of window : "+window.size());
		Actions action = new Actions(driver);
		WebElement dropdown = driver.findElement(By.id("menuform:j_idt39"));
		action.moveToElement(dropdown).click().build().perform();
		WebElement alert = driver.findElement(By.xpath("//span[contains(text(),\"Window\")]"));
		alert.click();
		System.out.println("Alert title "+driver.getTitle());
		WebElement newwindow = driver.findElement(By.xpath("//button[@id=\"j_idt88:new\"]//span[contains(text(),\"Open\")]"));
		action.moveToElement(newwindow).click().build().perform();
		System.out.println("newwindow title "+driver.getTitle());
		Set<String> window1 = driver.getWindowHandles();
		System.out.println("Child window : "+window1);
		System.out.println("count of new window : "+window1.size());
		Iterator<String> it = window1.iterator();
		driver.switchTo().window(it.next());
		System.out.println("switched to Child window");
		WebElement newtab = driver.findElement(By.xpath("//span[contains(text(),\"Open Multiple\")]"));
		action.moveToElement(newtab).click().perform();
		System.out.println("newtab title "+driver.getTitle());
		driver.switchTo().window(parent);
		driver.close();
		Set<String> tab = driver.getWindowHandles();
		System.out.println("New tab opened: "+tab);
		System.out.println("count of new tab : "+tab.size());
		
		
	}

}