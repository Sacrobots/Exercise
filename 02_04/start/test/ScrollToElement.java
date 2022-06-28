import org.apache.xpath.operations.String;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/Users/siddhu/Downloads/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");

        WebElement name = driver.findElement(By.id("name"));

        // for scrolling down to full name
        Actions actions = new Actions(driver);
        actions.moveToElement(name);
        name.sendKeys("Sai Siddharth");

        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("22/12/2032");

        driver.quit();
    }
}
