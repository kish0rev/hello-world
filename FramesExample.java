package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
// import org.openqa.selenium.support.ui.WebDriverWait;

public class FramesExample {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", 
            "C:\\Program Files\\Testing Folder\\Youtube\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://leafground.com/frame.xhtml");
    }

    @Test(priority = 1)
    public void clickButtonInFirstFrame() {
        driver.switchTo().frame(0);
        WebElement ClickMe = driver.findElement(By.id("Click"));
        ClickMe.click();
        String text = ClickMe.getText();
        System.out.println("Text after click in first frame: " + text);
        driver.switchTo().defaultContent();
    }

    @Test(priority = 2)
    public void clickButtonInNestedFrame() {
        driver.switchTo().frame(2); // outer frame
        driver.switchTo().frame("frame2"); // nested inner frame
        WebElement ButtonInside = driver.findElement(By.id("Click"));
        ButtonInside.click();
        System.out.println("Clicked button inside nested frame.");
        driver.switchTo().defaultContent();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
