package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenGoogleWithFirefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Testing Folder\\Youtube\\geckodriver-v0.36.0-win64\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("agni"+Keys.ENTER);
	
		
//		driver.quit();
	}

}
