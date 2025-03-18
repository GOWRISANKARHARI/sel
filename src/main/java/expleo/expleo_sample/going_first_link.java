package expleo.expleo_sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;

public class going_first_link {
    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        WebElement searchBox = driver.findElement(By.xpath("//input[@class=\"form-control input-lg\"]"));
        javaScriptClick(driver, searchBox);
        jse.executeScript("window.scrollBy(500,500)");
    }

    public static void javaScriptClick(WebDriver driver, WebElement element) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,200)");
        jse.executeScript("arguments[0].value='hp';", element);
        element.sendKeys(Keys.ENTER);
    }
}
