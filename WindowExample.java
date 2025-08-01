package selenium;

//import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WindowExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Testing Folder\\Youtube\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://leafground.com/dashboard.xhtml");
		
				
//		WebElement menu = driver.findElement(By.xpath("//*[@id=\"menu-button\"]/i"));
//		menu.click();
		WebElement BrowserDropdown = driver.findElement(By.xpath("//*[@id=\"menuform:j_idt39\"]/a/i[1]"));
		BrowserDropdown.click();
		
		WebElement WindowsOption = driver.findElement(By.xpath("//*[@id=\"menuform:m_window\"]/a"));
		WindowsOption.click();
		
		String OldWindow = driver.getWindowHandle();
		
		WebElement OpenWindow = driver.findElement(By.id("j_idt88:new"));
		OpenWindow.click();
		
		Set<String>handles = driver.getWindowHandles();
		
		for (String NewWindow : handles) {
			
			driver.switchTo().window(NewWindow);
			
			
		}
		
		driver.switchTo().window(OldWindow);
		
		WebElement OpenMultiWindows = driver.findElement(By.id("j_idt88:j_idt91"));
			
		OpenMultiWindows.click();
		
		int NoOfWindows = driver.getWindowHandles().size();
		System.out.println("no of windows opened is"+ NoOfWindows);
		
		Set<String> NewWindowsOpened = driver.getWindowHandles();
		
		for (String allWindows : NewWindowsOpened) {
			
			
			if(allWindows.equals(OldWindow)) {
				driver.switchTo().window(allWindows);
				driver.close();			}
			
		}
		
		driver.quit();
		}
	
	

		
	
	}
	
	


