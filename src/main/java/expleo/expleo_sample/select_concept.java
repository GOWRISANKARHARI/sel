package expleo.expleo_sample;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class select_concept {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.leafground.com/select.xhtml");
        driver.manage().window().maximize();
        	WebElement ele_1 = driver.findElement(By.className("ui-selectonemenu"));
        Select select_obj = new Select(ele_1);
        List<WebElement> list1 = select_obj.getOptions();
        System.out.println("options size: " + list1.size());
        for (WebElement option : list1) {
            System.out.println("option: " + option.getText());
        }
        boolean multiple = select_obj.isMultiple();
        System.out.println("Is multiple selections allowed: " + multiple);
        select_obj.selectByIndex(1);
        select_obj.selectByVisibleText("Playwright");
        driver.quit();
        
    }
}
