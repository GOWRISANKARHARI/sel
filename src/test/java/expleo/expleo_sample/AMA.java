package expleo.expleo_sample;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AMA {

	public static void main(String[] args) throws AWTException, IOException{
//		WebDriver driver1=new org.openqa.selenium.chrome.ChromeDriver();
//		driver1.manage().window().maximize();
//		driver1.get("https://www.amazon.com/");
//		WebElement amz=driver1.findElement(By.name("field-keywords"));
//		System.out.println(amz.getDomAttribute("name"));
//		System.out.println(amz.getDomAttribute("class"));
//		System.out.println(amz.getDomAttribute("tabindex"));
//		System.out.println(amz.getDomAttribute("type"));
//		System.out.println(amz.getDomAttribute("id"));
//		
//		System.out.println(amz.getAttribute("test"));
		
		WebDriver driver1=new org.openqa.selenium.chrome.ChromeDriver();
		driver1.get("https://opensource-demo.orangehrmlive.com");
		driver1.manage().window().maximize();
		//String PartialLinkText_Text = driver1.findElement(By.partialLinkText("orange")).getText();
		//System.out.println("the location is-> "+PartialLinkText_Text);
		driver1.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
		driver1.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
		
		List<WebElement> linkName = driver1.findElements(By.tagName("a"));
		int linkcount = linkName.size();
		System.out.println("LIST OF LINK");
		System.out.println("TOTAL LIST: "+linkcount);
		for(WebElement link : linkName)
		{
			System.out.println(link.getText()+" - "+link.getDomAttribute("href"));
		}
		driver1.close();

	}

}