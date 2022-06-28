import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/Users/siddhu/Downloads/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        // to open New tab in switch-window
        WebElement newtab = driver.findElement(By.id("new-tab-button"));
        newtab.click();

        String OriginalHandle = driver.getWindowHandle();

        // to switch between two tabs
        for(String change : driver.getWindowHandles()){
            driver.switchTo().window(change); // It switches to 2nd tab
        }
        Thread.sleep(1000);
        // Switch tab to original tab
        driver.switchTo().window(OriginalHandle);

        driver.quit();
    }
}
