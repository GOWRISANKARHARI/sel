package expleo.expleo_sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class leafgroud_14 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://leafground.com/frame.xhtml");
        WebElement one=driver.findElement(By.xpath("//iframe[@src=\"default.xhtml\"]"));
        driver.switchTo().frame(one);
        WebElement a=driver.findElement(By.xpath("//button[@style=\"color:#ffffff;background: linear-gradient(240deg, #ff7295 0%, #fe875d 100%);border: 0 none;width:15%;height:40%\"]"));
        a.click();
        String t=a.getText();
        System.out.println("text click1:"+t);
        driver.switchTo().defaultContent();
        WebElement bottom=driver.findElement(By.id("j_idt96"));
        System.out.println("main:"+bottom.getText());
        WebElement two=driver.findElement(By.xpath("//iframe[@src=\"nested.xhtml\"]"));
        driver.switchTo().frame(2);
        

        

	}

}