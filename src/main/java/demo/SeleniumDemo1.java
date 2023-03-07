package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo1 {
    public static void main(String[] args) {

        // Set Web-driver Property
        System.setProperty("webdriver.chrome.driver","Webdriver\\chromedriver.exe");

        // Open the browser
        WebDriver driver = new ChromeDriver();

        // Maximize the window
        driver.manage().window().maximize();

        // Go to the application url
        driver.get("https://selenium.dev");

        // Title of the current page
        System.out.println("Title of the current page is '" + driver.getTitle() + "'.");

        // Application URL
        System.out.println("The Application URL is '" + driver.getCurrentUrl() + "'");

        //Close the browser
        driver.quit();

    }
}
