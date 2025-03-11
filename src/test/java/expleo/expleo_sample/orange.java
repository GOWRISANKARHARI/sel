package expleo.expleo_sample;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
public class orange {

    public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        try { Thread.sleep(3000); } catch (InterruptedException e) { }
      try {
            String partialText = driver.findElement(By.partialLinkText("OrangeHRM")).getText();
            System.out.println("Partial Link Text: " + partialText);
        } catch (NoSuchElementException e) {
            System.out.println("Partial link text not found.");
        }
      Thread.sleep(1000);
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        List<WebElement> linkName = driver.findElements(By.tagName("a"));
        int linkcount = linkName.size();
        Thread.sleep(1000);
        System.out.println("LIST OF LINKS");
        System.out.println("TOTAL LINKS: " + linkcount);
        for (WebElement link : linkName) {
            System.out.println(link.getText() + " - " + link.getDomAttribute("href"));
        }
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
        
        WebElement lo = driver.findElement(By.xpath("/html/body"));
        Thread.sleep(1000);
        List<WebElement> linkName1 = driver.findElements(By.tagName("a"));
        int linkcount1 = linkName1.size();
        System.out.println("LIST OF LINKS");
        System.out.println("TOTAL LINKS: " + linkcount1);
        for (WebElement link1 : linkName1) {
            System.out.println(link1.getText() + " - " + link1.getDomAttribute("href"));
        }
        WebElement lout1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li"));
        WebElement lout2 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span"));
        
        
        
    }
}
