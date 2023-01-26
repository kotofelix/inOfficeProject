package testG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WikipediaSearch {
    public static void main(String[] args) {
        // Set up the web driver
        System.setProperty("webdriver.chrome.driver", "D:\\Webdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Open Wikipedia
        driver.get("https://www.wikipedia.org/");

        // Find the search bar and search button
        driver.findElement(By.name("search")).sendKeys("World War 2");
        driver.findElement(By.name("go")).click();

        // Close the browser
        driver.quit();
    }
}