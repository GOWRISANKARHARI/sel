package expleo.expleo_sample;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class pra {

    public static void main(String[] args) {
        ChromeDriver driver1 = new ChromeDriver();
        driver1.manage().window().maximize();
        driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver1.get("https://leafground.com/select.xhtml");
        WebElement drop = driver1.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
        Select select = new Select(drop);
        select.selectByIndex(2); 
        WebElement ele = driver1.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']"));
        ele.click();
        WebElement checkbox = driver1.findElement(By.xpath("//li[@id='menuform:m_checkbox']"));
        checkbox.click();
        WebElement sel_mul1 = driver1.findElement(By.xpath("//div[contains(@class, 'ui-selectcheckboxmenu')]"));
        sel_mul1.click();
        WebElement sel_mul = driver1.findElement(By.xpath("//ul[contains(@class, 'ui-selectcheckboxmenu-items')]"));
        Actions action = new Actions(driver1);
        action.moveToElement(sel_mul).click().perform();
        List<WebElement> list1 = sel_mul.findElements(By.tagName("li"));
        for (WebElement option : list1) {
            System.out.println("Option: " + option.getText());
        }
        checkbox.clear()
        				

        driver1.quit();
    }
}
