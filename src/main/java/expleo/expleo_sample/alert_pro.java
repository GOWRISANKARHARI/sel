package expleo.expleo_sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class alert_pro {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
        WebElement first = driver.findElement(By.cssSelector("#alert1"));
        first.click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        WebElement second = driver.findElement(By.cssSelector("#prompt"));
        second.click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().sendKeys("Hari");
        driver.switchTo().alert().accept();
        WebElement thired = driver.findElement(By.cssSelector("#confirm"));
        thired.click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();
        thired.click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
	}
}
