package expleo.expleo_sample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame_pro {
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/frames");
		WebElement iframeElement = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(iframeElement);
		String Frame_1 = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println("Switch by locator: "+Frame_1);
		driver.switchTo().defaultContent();
		WebElement Frame_2=driver.findElement(By.xpath("//h1[@class=\"text-center\"]"));
		System.out.println("MAIN :"+Frame_2.getText());
		driver.switchTo().frame(3);
		String Frame_3 = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println("Switch by locator2: " + Frame_3);
		driver.quit();
	}
}
