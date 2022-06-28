import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Form {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/Users/siddhu/Downloads/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");


        Thread.sleep(1000);
        submitForm(driver);

        WebElement submit = driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary"));
        submit.click();

        WebDriverWait wait = new WebDriverWait(driver, 30);
        WebElement alert = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert")));
        Thread.sleep(1000);
        String alertText = alert.getText();
        System.out.println(alertText);


        driver.quit();
    }

    public static void submitForm(WebDriver driver) throws InterruptedException {
        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.sendKeys("James");
        Thread.sleep(1000);

        WebElement lastName = driver.findElement(By.id("last-name"));
        lastName.sendKeys("Macron");
        Thread.sleep(1000);

        WebElement jobTitle = driver.findElement(By.id("job-title"));
        jobTitle.sendKeys("Software Test Engineer");
        Thread.sleep(1000);

        WebElement selectOption = driver.findElement(By.id("radio-button-2"));
        selectOption.click();
        Thread.sleep(1000);

        WebElement genderSelector = driver.findElement(By.id("checkbox-3"));
        genderSelector.click();
        Thread.sleep(1000);

        WebElement select = driver.findElement(By.id("select-menu"));
        select.click();
        Thread.sleep(1000);
        WebElement options = driver.findElement(By.cssSelector("option[value='3']"));
        options.click();
        Thread.sleep(1000);


        WebElement datePicker = driver.findElement(By.id("datepicker"));
        Thread.sleep(1000);
        datePicker.sendKeys("19/09/3023");
        Thread.sleep(1000);
        datePicker.sendKeys(Keys.RETURN);
        Thread.sleep(1000);

    }
}
