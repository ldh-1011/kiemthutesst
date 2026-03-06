import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAcePortal {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement menu = driver.findElement(By.cssSelector("#menuToggle input"));
        menu.click();
        Thread.sleep(2000);
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/SignIn.html");
        Thread.sleep(2000);
        driver.findElement(By.id("usr")).sendKeys("sa");
        driver.findElement(By.id("pwd")).sendKeys("sa");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        Thread.sleep(3000);
        driver.quit();
    }
}