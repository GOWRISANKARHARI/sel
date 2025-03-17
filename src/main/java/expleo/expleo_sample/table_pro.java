package expleo.expleo_sample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
public class table_pro {

	private static final WebElement WebElement = null;

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
        List<WebElement> a = driver.findElements(By.xpath("//table[@id='table1']//thead//tr//th"));
        System.out.println("Size: "+a.size());
        for(WebElement options:a)
        {
        	System.out.println(" head: "+options.getText());
        }
        List<WebElement> b = driver.findElements(By.xpath("//table[@id='table1']//tbody"));
        System.out.println("Size: "+b.size());
        for(WebElement options:b)
        {
        	System.out.println(" body: "+options.getText());
        }
        List<WebElement> c = driver.findElements(By.xpath("//table[@id='table1']//tbody//tr[1]"));
        System.out.println("Size: "+c.size());
        System.out.println("\n1.1 table value");
        for(WebElement options1:c)
        {
        	System.out.println(options1.getText());
        }
        List<WebElement> d = driver.findElements(By.xpath("//table[@id='table1']//tbody//tr[2]"));
        System.out.println("Size: "+d.size());
        System.out.println("n/1.2 table value");
        for(WebElement options1:d)
        {
        	System.out.println(options1.getText());
        }
        List<WebElement> e = driver.findElements(By.xpath("//table[@id='table1']//tbody//tr[2]//td[1]"));
        System.out.println("Size: "+e.size());
        System.out.println("n/2.1 table value");
        for(WebElement options1:e)
        {
        	System.out.println(options1.getText());
        }
        
        List<WebElement> f = driver.findElements(By.xpath("//table[@id='table1']//tbody//tr//td[1]"));
        System.out.println("Size: "+f.size());
        System.out.println("/nperticulare row or column");
        for(WebElement options1:f)
        {
        	System.out.println(options1.getText());
        }
        
        List<WebElement> g = driver.findElements(By.xpath("//table[@id='table1']//tbody//tr//td[3]"));
        System.out.println("Size: "+g.size());
        System.out.println("/nperticulare row or column");
        for(WebElement options1:g)
        {
        	System.out.println(options1.getText());
        }
        
        System.out.println("_______________________________________________________________________________________________");
        List<WebElement> a1 = driver.findElements(By.xpath("//table[@id='table1']//th"));
        System.out.println("row: "+a1.size());
        List<WebElement> a2 = driver.findElements(By.xpath("//table[@id='table1']//tbody//tr"));
        System.out.println("column: "+a2.size());
        System.out.println();
        for (WebElement header : a1) {
            System.out.print(header.getText() + "\t\t");
        }
        for (int i = 0; i <= a2.size(); i++) {
            List<WebElement> columns = driver.findElements(By.xpath("//table[@id='table1']//tbody//tr[" + i + "]//td"));
            for (WebElement cell : columns) {
                System.out.print(cell.getText() + "\t\t");
            }
            System.out.println();
        }
     
        
        
        
        
	}
}
