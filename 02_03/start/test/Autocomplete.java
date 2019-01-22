import org.openqa.selenium.chrome.ChromeDriver; //inport all necesary packages on lines 1-4
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:/Users/Jesus/Downloads/chromedriver_win32/chromedriver.exe");  //Sets the property of the locatoin of the chrome dirver

        WebDriver driver = new ChromeDriver(); //new instance of the chromedriver is created

        driver.get("https://formy-project.herokuapp.com/autocomplete"); //the driver navigates to the autocomple page of the test application

        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("1555 Park Road Northwest, Washington, DC, USA");
        Thread.sleep(1000);

        WebElement autocompleteResult = driver.findElement(By.className("pac-item"));
        autocompleteResult.click();

        driver.quit(); //the driver quits the test application

    }
}
