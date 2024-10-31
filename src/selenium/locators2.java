package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

/**
 * This class demonstrates the use of Selenium WebDriver to automate interactions with a web page.
 */
public class locators2 {

    /**
     * The main method serves as the entry point for the application.
     * It sets up the WebDriver, navigates to a web page, and interacts with various elements on the page.
     *
     * @param args Command line arguments
     * @throws InterruptedException if the thread is interrupted while sleeping
     */
    public static void main(String[] args) throws InterruptedException {

        // Define a username to be used in the login process
        String name = "Rahul";

        // Set the system property for the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuruddin Kawsar\\Documents\\chromedriver-win64\\chromedriver.exe");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Configure WebDriver to wait implicitly for 5 seconds for elements to appear
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        // Retrieve the password using the getPassword method
        String password = getPassword(driver);

        // Open a website
        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        // Find the username input field by its ID and enter text
        driver.findElement(By.id("inputUsername")).sendKeys(name);

        // Find the password input field by its name and enter text
        driver.findElement(By.name("inputPassword")).sendKeys(password);

        // Find the sign-in button by its class name and click it
        driver.findElement(By.className("signInBtn")).click();

        // Pause execution for 2 seconds to allow for page load
        Thread.sleep(2000);

        // Retrieve and print the success message text identified by a tag name
        System.out.println(driver.findElement(By.tagName("p")).getText());

        // Assert that the success message is as expected
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
        Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");

        // Find the log out button by its text and click it
        driver.findElement(By.xpath("//*[text()='Log Out']")).click();

        // Close the browser
        driver.close();
    }

    /**
     * This method retrieves the password from the "Forgot your password?" workflow.
     * It navigates to the password reset page, retrieves the temporary password, and returns it.
     *
     * @param driver The WebDriver instance used to interact with the web page
     * @return The temporary password retrieved from the web page
     * @throws InterruptedException if the thread is interrupted while sleeping
     */
    public static String getPassword(WebDriver driver) throws InterruptedException {

        // Navigate to the password reset page
        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        // Click on the "Forgot your password?" link
        driver.findElement(By.linkText("Forgot your password?")).click();

        // Pause execution for 1 second to allow for page load
        Thread.sleep(1000);

        // Click on the reset password button
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

        // Retrieve the password text from the page
        String passwordText = driver.findElement(By.cssSelector("form p")).getText();

        // Extract the password from the retrieved text
        String[] passwordArray = passwordText.split("'");
        String password = passwordArray[1].split("'")[0];

        // Return the extracted password
        return password;
    }
}