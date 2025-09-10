package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
@Test
public class DragExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Testing Folder\\Youtube\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://leafground.com/drag.xhtml");
		System.out.println("done");
		
		
		
//		WebElement From = driver.findElement(By.id("form:drag_content"));
//		WebElement To = driver.findElement(By.id("form:drop_header"));
//		
//		
//		Actions actions = new Actions(driver);
//		actions.clickAndHold(From).moveToElement(To).build().perform();
//		
		
		
		WebElement From = driver.findElement(By.xpath("//*[@id=\"form:j_idt94:j_idt95\"]/span"));
		WebElement To = driver.findElement(By.xpath("//*[@id=\"form:j_idt94:j_idt99\"]/span"));
		
		
		// Actions actions = new Actions(driver);
		// actions.clickAndHold(From).moveToElement(To).release(To).build().perform();
		
		// actions.dragAndDrop(From, To).build().perform();
		
	}	

}





