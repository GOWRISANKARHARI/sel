package expleo.expleo_sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class basic_pro_duckduck {
	public static void main (String[] args)
	{
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://duckduckgo.com/");
        
	}
}
