package expleo.expleo_sample;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;
public class allauto {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
        WebElement mail=driver.findElement(By.xpath("//input[@name=\"email\"]"));
        mail.sendKeys("svgfamily1234@gmail.com");
        WebElement name=driver.findElement(By.xpath("//div[@class='col-sm-10']//child::input[@name=\"firstname\"]"));
        name.sendKeys("hari");
        WebElement laname=driver.findElement(By.xpath("//div[@class='col-sm-10']//child::input[@name=\"lastname\"]"));
        laname.sendKeys("s");
        WebElement tel = driver.findElement(with(By.tagName("input")).below(mail));
        tel.sendKeys("8778167498");
        WebElement pass=driver.findElement(By.xpath("//input[@name=\"password\"]"));
        pass.sendKeys("2503.Hari*");
        WebElement con=driver.findElement(By.xpath("//input[@name=\"confirm\"]"));
        con.sendKeys("2503.Hari*");
        driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click();
        driver.findElement(By.xpath("//input[@class=\"btn btn-primary\"]")).click();
        driver.findElement(By.xpath("//a[@class=\"btn btn-primary\"]")).click();
	}

	private static By With(By xpath) {
		// TODO Auto-generated method stub
		return null;
	}
}
