package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

/**
 * This class demonstrates the use of Selenium WebDriver to automate interactions with a web page.
 */
public class locators {

    /**
     * The main method serves as the entry point for the application.
     * It sets up the WebDriver, navigates to a web page, and interacts with various elements on the page.
     *
     * @param args Command line arguments
     * @throws InterruptedException if the thread is interrupted while sleeping
     */
    public static void main(String[] args) throws InterruptedException {
        // Set the system property for the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuruddin Kawsar\\Documents\\chromedriver-win64\\chromedriver.exe");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Configure WebDriver to wait implicitly for 5 seconds for elements to appear
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        // Open a website
        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        // Find the username input field by its ID and enter text
        driver.findElement(By.id("inputUsername")).sendKeys("rahul");

        // Find the password input field by its name and enter text
        driver.findElement(By.name("inputPassword")).sendKeys("shetty123");

        // Find the sign-in button by its class name and click it
        driver.findElement(By.className("signInBtn")).click();

        // Retrieve and print the error message text identified by a CSS selector
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());

        // Click the "Forgot your password?" link
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(2000);

        // Find the name input field by its XPath and enter text
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("john");

        // Find the email input field by its CSS selector and enter text
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");

        // Clear the second text input field identified by its XPath
        driver.findElement(By.xpath("//input[@type='text'][2]")).clear();

        // Find the third text input field by its CSS selector and enter text
        driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");

        // Find the phone number input field by its XPath and enter text
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("9834534534");

        // Click the reset password button identified by its CSS class
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

        // Retrieve and print the reset password message text identified by a CSS selector
        System.out.println(driver.findElement(By.cssSelector("form p")).getText());

        // Click the "Go to Log in" button identified by its XPath
        driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
        Thread.sleep(1000);

        // Find the username input field by its CSS selector and enter text
        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");

        // Find the password input field by its CSS selector and enter text
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");

        // Click the "Remember me" checkbox identified by its ID
        driver.findElement(By.id("chkboxOne")).click();

        // Click the submit button identified by its XPath
        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
    }
}