package expleo.expleo_sample;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OPEN_CHROME {
    ChromeDriver driver;

    public void launchBrowser() {
        WebDriverManager.chromedriver().setup(); 
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        WebElement search_box = driver.findElement(By.name("q"));
		search_box.sendKeys("safari bag"+Keys.ENTER);
        
    }

}

/*
 * import org.openqa.selenium.By; import org.openqa.selenium.Keys; import
 * org.openqa.selenium.WebDriver; import org.openqa.selenium.WebElement; import
 * org.openqa.selenium.chrome.ChromeDriver; import
 * org.openqa.selenium.chrome.ChromeOptions; import io.github.bonigarcia.wdm.*;
 * public class OPEN_CHROME {
 * 
 * public static void main(String[] args) { // TODO Auto-generated method stub
 * //WebDriverManager.edgedriver().setup();
 * 
 * // WebDriver driver = new EdgeDriver(); //
 * driver.manage().window().maximize(); // driver.get(
 * "https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=2786602076250247848&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9180578&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1"
 * ); // WebElement search_box = driver.findElement(By.name("field-keywords"));
 * // search_box.sendKeys("safari bag"+Keys.ENTER); // String url
 * =driver.getCurrentUrl(); // String title = driver.getTitle(); // String
 * source= driver.getPageSource(); // System.out.println("URL: "+url); //
 * System.out.println("TITLE: "+title); // System.out.println("\n\n\n\n\n\n");
 * // System.out.println("SOURCE: "+source);
 * 
 * WebDriver driver = new EdgeDriver(); driver.manage().window().maximize();
 * driver.get("https://www.saucedemo.com");
 * 
 * driver.navigate().to("https://www.saucedemo.com"); //driver.navigate().to("")
 * WebElement search_box = driver.findElement(By.name("user-name"));
 * search_box.sendKeys("standard_user"+Keys.ENTER); WebElement search_box1 =
 * driver.findElement(By.name("password"));
 * search_box1.sendKeys("secret_sauce"+Keys.ENTER); WebElement search_box2 =
 * driver.findElement(By.name("login-button"));
 * search_box2.sendKeys(Keys.ENTER); try { Thread.sleep(2000); } catch
 * (InterruptedException e) { // TODO Auto-generated catch block
 * e.printStackTrace(); } WebElement search_box3 =
 * driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
 * search_box3.sendKeys(Keys.ENTER); try { Thread.sleep(3000); } catch
 * (InterruptedException e) { // TODO Auto-generated catch block
 * e.printStackTrace(); } WebElement viewcart =
 * driver.findElement(By.id("shopping_cart_container")); viewcart.click(); try {
 * Thread.sleep(5000); } catch (InterruptedException e) { // TODO Auto-generated
 * catch block e.printStackTrace(); } //WebElement
 * search_box5.sendKeys(Keys.ENTER); WebElement s earch_box4 =
 * driver.findElement(By.name("checkout")); search_box4.sendKeys(Keys.ENTER);
 * try { Thread.sleep(5000); } catch (InterruptedException e) { // TODO
 * Auto-generated catch block e.printStackTrace(); } WebElement search_box6 =
 * driver.findElement(By.id("first-name")); search_box6.sendKeys("hari"); try {
 * Thread.sleep(5000); } catch (InterruptedException e) { // TODO Auto-generated
 * catch block e.printStackTrace(); } WebElement search_box7 =
 * driver.findElement(By.id("last-name")); search_box7.sendKeys("sankar"); try {
 * Thread.sleep(5000); } catch (InterruptedException e) { // TODO Auto-generated
 * catch block e.printStackTrace(); } WebElement search_box8 =
 * driver.findElement(By.id("postal-code"));
 * search_box8.sendKeys("636003"+Keys.ENTER); WebElement z =
 * driver.findElement(By.id("https://www.saucedemo.com/checkout-step-two.html"))
 * ; z.click(); try { Thread.sleep(5000); } catch (InterruptedException e) { //
 * TODO Auto-generated catch block e.printStackTrace(); }
 * 
 * 
 * ChromeOptions option = new ChromeOptions();
 * option.addArguments("--headless"); WebDriver dvr = new ChromeDriver(option);
 * dvr.manage().window().maximize(); dvr.get("https://www.google.co.in");
 * WebElement search_box = dvr.findElement(By.name("q"));
 * search_box.sendKeys("Java Selenium" + Keys.ENTER); String url =
 * dvr.getCurrentUrl(); String title = dvr.getTitle();
 * System.out.println("URL : "+url); System.out.println("TITLE : "+title);
 * 
 * 
 * }
 * 
 * }
 */