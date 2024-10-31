package selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class intro {

    public static void main(String[] args) {
            //Invoking Browser
            //Chrome - ChromeDriver exten->Methods close get
            //Firefox- FirefoxDriver ->methods close get
            // WebDriver  close  get
            //WebDriver methods + class methods
            // Chrome

            // Ensure the path to ChromeDriver is correct
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuruddin Kawsar\\Documents\\chromedriver-win64\\chromedriver.exe");

            // Initialize WebDriver
            WebDriver driver = new ChromeDriver();

            // Open a website
            driver.get("https://rahulshettyacademy.com");

            // Print the title and current URL
            System.out.println(driver.getTitle());
            System.out.println(driver.getCurrentUrl());
            driver.close();

            // Quit the driver
            driver.quit();
            // Firefox
            // System.setProperty("webdriver.gecko.driver", "/Users/rahulshetty/Documents/geckodriver")
            // WebDriver driver1 = new FirefoxDriver();
            // Microsoft Edge
            //  System.setProperty("webdriver.edge.driver", "/Users/rahulshetty/Documents/msedgedriver");
            //  WebDriver driver2 = new EdgeDriver();
            //  driver.get("https://rahulshettyacademy.com");

    }
}