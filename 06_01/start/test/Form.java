import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:/Users/Jesus/Downloads/chromedriver_win32/chromedriver.exe");//Setsthelocationofthechromedirver

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        driver.findElement(By.id("first-name")).sendKeys("Jesus");

        driver.findElement(By.id("last-name")).sendKeys("Mata");

        driver.findElement(By.id("job-title")).sendKeys("QA Engineer");

        driver.findElement(By.id("radio-button-2")).click();

        driver.findElement(By.id("checkbox-1")).click();

        driver.findElement(By.id("select-menu")).click();

        //driver.findElement(By.cssSelector("#list option:nth-child(4)")).click();

        driver.findElement(By.cssSelector("option[value='4']")).click();

        //driver.findElement(By.class(".datepicker datepicker-dropdown dropdown-menu datepicker-orient-left datepicker-orient-top"))

        //driver.findElement(By.cssSelector("div[class*='datepicker-dropdown']"));

        driver.findElement(By.id("datepicker")).sendKeys("05/29/2020");

        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);

        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();

        driver.quit();
    }
}
