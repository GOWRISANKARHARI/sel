package expleo.expleo_sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nweweb {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://thinking-tester-contact-list.herokuapp.com/");
        WebElement emailInput = driver.findElement(By.id("email"));
        emailInput.sendKeys("hari123@gmail.com");     
        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys("Hari123");
        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 
        	List<WebElement> contacts = driver.findElements(By.xpath("//tr[@class='contactTableBodyRow']/td"));
        System.out.println("Size of list: " + contacts.size());     
        for (WebElement contact : contacts) {
            System.out.println("->" + contact.getText());
        }
        	String expectedName = "Gowrisankar S";
        for (WebElement name : contacts) {
            if (name.getText().equals(expectedName)) {
                List<WebElement> details = driver.findElements(By.xpath("//tr[@class='contactTableBodyRow']/td"));
                System.out.println("Details of " + expectedName + ":");
                for (WebElement detail : contacts) {
                    System.out.print(detail.getText());
                }
            }
        }
        
       
        driver.quit();
    }
}
