package first;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class first {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/selenium/web/formPage.html");
		WebElement ele_1 = driver.findElement(By.name("multi"));
        Select select_obj = new Select(ele_1);
        List<WebElement> list1 = select_obj.getOptions();
        for (WebElement option : list1) {
            System.out.println("option: " + option.getText());
        }
        boolean multiple = select_obj.isMultiple();
        System.out.println("Is multiple selections allowed: " + multiple);
        select_obj.deselectAll();
        select_obj.selectByIndex(0);
        select_obj.selectByValue("onion gravy");
        List<WebElement> name = select_obj.getAllSelectedOptions();
        for(WebElement x:name)
        {
        	System.out.println("selected opection: "+x.getText());
        }
        select_obj.deselectByIndex(0);
        List<WebElement> name1 = select_obj.getAllSelectedOptions();
        for(WebElement x:name1)
        {
        	System.out.println("after deselected opection: "+x.getText());
        }
        select_obj.deselectAll();
        driver.quit();
        
	}
}
