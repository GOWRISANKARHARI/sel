package expleo.expleo_sample;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import javax.imageio.ImageIO;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

import io.github.bonigarcia.wdm.WebDriverManager;
public class web1 {
	public static void main(String args[]) throws AWTException, IOException
	{
		
		 WebDriver dvr=new org.openqa.selenium.chrome.ChromeDriver();
		  dvr.manage().window().maximize();
		  
		  dvr.get("https://www.leafground.com/input.xhtml;jsessionid=node017kbx8g10uek312lj9j032vo7z8843122.node0"); 
		  		 
		 /* WebElement one=driver1.findElement(By.xpath(
		 * "//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div/div/div[2]/div[1]/div/div[1]/div/div/div/div/div[1]/a[2]"
		 * )); String text=one.getText(); System.out.println(text); String
		 * color=one.getCssValue("color"); System.out.println(color); String link1 =
		 * one.getDomAttribute("href"); System.out.println("Href: " + link1); String
		 * text1 = one.getText(); System.out.println("Text: " + text1); String role =
		 * one.getDomAttribute("aria-label"); System.out.println("lable: " + role);
		 * WebElement one1=driver1.findElement(By.xpath(
		 * "//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div/div/div[2]/div[1]/div/div[1]/div/div/div/div/div[1]/a[2]"
		 * )); one1.sendKeys(Keys.ENTER); WebElement one2=driver1.findElement(By.xpath(
		 * "//*[@id=\"container\"]/div/div[3]/div[3]/div[1]/div/section[3]/div[2]/div[1]/div[2]/div/label/div[1]"
		 * )); boolean check = one2.isDisplayed(); System.out.println(check); boolean en
		 * = one2.isEnabled(); System.out.println(en); WebElement one3 =
		 * driver1.findElement(By.cssSelector("div.XqNaEv")); one3.click(); boolean sel
		 * = one3.isSelected(); System.out.println(sel); WebElement
		 * one5=driver1.findElement(By.xpath("//*[@class='zDPmFV']"));
		 * one5.sendKeys("safari bag"+Keys.ENTER); Robot robot = new Robot(); Dimension
		 * scr_size = Toolkit.getDefaultToolkit(). getScreenSize(); Rectangle rect = new
		 * Rectangle(scr_size); BufferedImage img = robot.createScreenCapture(rect); try
		 * { Thread.sleep(5000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); } File Dest = new
		 * File("screenshot5.png"); ImageIO.write(img, "png", Dest);
		 */
//			 + checkbox.isEnabled()       System.out.println("Checkbox selected: " + checkbox.isSelected());
//	        System.out.println("Checkbox selected: " + checkbox.isSelected());
//	        System.out.println("Opera selected: " + opera.isSelected());

		 // WebElement opera = dvr.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/div/input[3]"));
		  WebElement checkbox = dvr.findElement(By.name("j_idt88:name"));
		        checkbox.sendKeys("GOWRISANKAR" );
		        checkbox.click();
		        WebElement checkbox1 = dvr.findElement(By.id("j_idt88:j_idt91"));
				        checkbox1.sendKeys(" ,India" );
				        WebElement checkbox2 = dvr.findElement(By.xpath("//*[@id=\"j_idt88\"]/div[3]/div"));
				System.out.println("Disabled : " + checkbox2.isEnabled());
				WebElement checkbox3 = dvr.findElement(By.name("j_idt88:j_idt95"));
				checkbox3.clear();
				WebElement checkbox4 = dvr.findElement(By.id("j_idt88:j_idt97"));
				System.out.println(checkbox4.getAttribute("value"));
				WebElement typ = dvr.findElement(By.id("j_idt88:j_idt99"));
				typ.sendKeys("2k21ece032@kiot.ac.in");
				typ.sendKeys(Keys.TAB+"My name is gowrisankar i am from salem tamilnadu");
				WebElement checkbox5 = dvr.findElement(By.id("j_idt106:thisform:age"));
				checkbox5.sendKeys(Keys.ENTER);
				WebElement checkbox6 = dvr.findElement(By.id("j_idt106:float-input"));
				checkbox6.sendKeys("hari"+Keys.ENTER);
				
				WebElement checkbox8 = dvr.findElement(By.xpath("//*[@id=\"j_idt106:auto-complete\"]/button"));
				checkbox8.sendKeys(Keys.ENTER);				
				WebElement checkbox7 = dvr.findElement(By.xpath("//*[@id=\"j_idt106:auto-complete_panel\"]/ul/li[4]"));
				checkbox7.click();
				
			
	}
}