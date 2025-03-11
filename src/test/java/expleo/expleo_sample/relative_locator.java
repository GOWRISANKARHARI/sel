package expleo.expleo_sample;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import static org.openqa.selenium.support.locators.RelativeLocator.with;
public class relative_locator {
public static void main(String[] args) throws InterruptedException {
        
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://omayo.blogspot.com/");
//        WebElement loginbtn = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
//        String loginbtntxt = loginbtn.getText();
//        WebElement submitbut = driver.findElement(with(By.tagName("button")).toLeftOf(loginbtn));
//        String ele_2 = submitbut.getText();
//        WebElement rigbut = driver.findElement(with(By.tagName("button")).toRightOf(loginbtn));
//        String ele_3 = rigbut.getText();
//        
//        System.out.println(loginbtntxt);
//        System.out.println(ele_2);
//        System.out.println(ele_3);
	
	/*WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(3000);
	WebElement username=driver.findElement(By.xpath("//div[@class=\"oxd-input-group__label-wrapper\"]//child::label[contains(text(),\"Username\")]//parent::div"));
	System.out.println(username.getText());
	WebElement fielduser=driver.findElement(with(By.tagName("input")).near(username));
	fielduser.sendKeys("Admin"+Keys.ENTER);
	Thread.sleep(3000);
	WebElement username1=driver.findElement(By.xpath("//div[@class=\"oxd-input-group__label-wrapper\"]//child::label[contains(text(),\"Password\")]//parent::div"));
	System.out.println(username1.getText());
	WebElement fielduser1=driver.findElement(with(By.tagName("input")).near(username1));
	fielduser1.sendKeys("admin123");
	
	WebElement frg = driver.findElement(By.cssSelector("div.orangehrm-login-forgot"));
    WebElement fr = driver.findElement(with(By.tagName("button")).above(frg));
    fr.sendKeys(Keys.ENTER);
    Thread.sleep(2000);
    WebElement logout =driver.findElement(By.xpath("//p [@class='oxd-userdropdown-name']"));
    logout.click();
    Thread.sleep(5000);
    WebElement logout1 = driver.findElement(By.xpath("//a [@class='oxd-userdropdown-link'][contains(text(),'Logout')]"));
    logout1.click();
    */
	
	/*WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://omayo.blogspot.com/");
	WebElement username=driver.findElement(By.xpath("//*[@class='dropbtn']"));
	WebElement username1=driver.findElement(By.xpath("//a[@href='http://gmail.com/']"));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	username1.click();
    */
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
	WebElement box=driver.findElement(By.xpath("//input[@id=\"adder\"]"));
	box.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement red=driver.findElement(By.xpath("//div[@id=\"box0\"]"));
	
	WebElement color=driver.findElement(By.xpath("//div[@class='redbox']"));
	System.out.println(color.getDomAttribute("class"));
	
	
	
	
	
	
	
	
}

}
