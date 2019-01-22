import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:/Users/Jesus/Downloads/chromedriver_win32/chromedriver.exe"); //Sets the location of the chromedirver

        WebDriver driver = new ChromeDriver();// creating the new instance of the chrome driver

        driver.get("https://formy-project.herokuapp.com/scroll"); //navigating the driver to the scroll test pege

        WebElement name =driver.findElement(By.id("name"));
        Actions actions = new Actions(driver);
        actions.moveToElement(name);
        name.sendKeys("Jesus Perez");

        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("01/18/2019");

        driver.quit();// quiting the driver

    }
}
