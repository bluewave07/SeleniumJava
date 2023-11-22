import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        WebDriver driver  = new ChromeDriver();

        driver.get("https://www.rahulshettyacademy.com");

        String webtitle = driver.getTitle();

        System.out.println(webtitle);

        System.out.println(driver.getCurrentUrl());
        driver.getPageSource();

        // close current window  quit -> close all the windows
        driver.quit();


    }
}
