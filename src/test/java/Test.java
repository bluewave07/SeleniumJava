import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        WebDriver driver  = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();

        String webtitle = driver.getTitle();

        System.out.println(webtitle);

        System.out.println(driver.getCurrentUrl());
        driver.getPageSource();

        WebElement dropDown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

        Select select = new Select(dropDown);
        select.selectByIndex(3);
        System.out.println(select.getFirstSelectedOption().getText());
        select.selectByValue("AED");
        System.out.println(select.getFirstSelectedOption().getText());
        select.selectByVisibleText("USD");
        System.out.println(select.getFirstSelectedOption().getText());



        // close current window  quit -> close all the windows
        driver.quit();


    }
}
