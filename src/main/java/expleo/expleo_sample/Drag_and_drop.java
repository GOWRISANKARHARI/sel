package expleo.expleo_sample;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class Drag_and_drop {
	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Actions action = new Actions(driver);
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        WebElement box1 = driver.findElement(By.id("box1"));
        String colorbox1 = box1.getCssValue("background-color");
        System.out.println("Before: " + colorbox1);
        WebElement box2 = driver.findElement(By.id("box101"));
        action.clickAndHold(box1).moveToElement(box2).release().build().perform();
        String colorbox11 = box1.getCssValue("background-color");
        System.out.println("after: " + colorbox11);
        String conform = "rgba(0, 255, 0, 1)";
        if(colorbox11.equals(conform))
        {
        	System.out.println("it is conform");
        }
        else
        {
        	System.out.println("it is not conofrm");
        }
        WebElement box3 = driver.findElement(By.id("box6"));
        WebElement box4 = driver.findElement(By.id("box106"));
        action.dragAndDrop(box3, box4).release().build().perform();
        String colorbox3 = box3.getCssValue("background-color");
        System.out.println("After: " + colorbox3);
        if(colorbox3.equals(conform))
        {
        	System.out.println("it is conform");
        }
        else
        {
        	System.out.println("it is not conofrm");
        }
        
//        WebElement block = driver.findElement(By.xpath("//button[@ondblclick=\"dblclickAlert()\"]"));
//        action.doubleClick(block).perform();

        
	}

}
