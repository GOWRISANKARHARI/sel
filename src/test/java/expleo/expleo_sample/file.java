package expleo.expleo_sample;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class file {
    public static WebDriver driver;

    public static void main(String[] args) {
        Properties prop = new Properties();

        // Load properties file using ClassLoader
        try (InputStream input = file.class.getClassLoader().getResourceAsStream("filename.properties")) {
            if (input == null) {
                System.out.println("Sorry, unable to find filename.properties");
                return;
            }
            prop.load(input);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        // Get browser property
        String browser1 = prop.getProperty("browser1");
        System.out.println("Browser selected: " + browser1);

        // Initialize WebDriver based on property
        if (browser1.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browser1.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Invalid browser specified. Please use 'chrome' or 'edge'.");
            return;
        }

        // Open GitHub
        driver.manage().window().maximize();
        driver.get("https://github.com/");

        // Close the browser after 5 seconds (for demo purposes)
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}
