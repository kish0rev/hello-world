package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.api.trace.Span;

@Test
public class TextBox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Testing Folder\\Youtube\\geckodriver-v0.36.0-win64\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://leafground.com/input.xhtml");
		
		WebElement TypeName=driver.findElement(By.id("j_idt88:name"));
		TypeName.click();
		TypeName.sendKeys("Helloworld");
		
		WebElement Appending = driver.findElement(By.id("j_idt88:j_idt91"));
		Appending.sendKeys("text");
		
		WebElement Disabling = driver.findElement(By.id("j_idt88:j_idt93"));
//		String disabled = Disabling.getAttribute("disabled");
//		System.out.println(disabled);
//	boolean disable =	Disabling.isEnabled();
//		System.out.println(disable);
//		
//		
//		WebElement clearing  = driver.findElement(By.id("j_idt88:j_idt95"));
//		clearing.clear();
//		clearing.sendKeys("Cleared and rewritten");
//		
//		WebElement Retrieving = driver.findElement(By.id("j_idt88:j_idt97"));
//		
//		String RetrevedValue = Retreving.getAttribute("value");
//		
//		System.out.println(RetrevedValue);
//		
//		WebElement AboutMe = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt101\"]"));
//		AboutMe.sendKeys("my name is kishore");
//		
//		WebElement TextEditorBold = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt103_toolbar\"]/span[2]/button[1]"));
//		TextEditorBold.click();
//		
//		WebElement TextEditorType = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt103_editor\"]/div[1]"));
//		TextEditorType.sendKeys("typed");
//		
//		WebElement TypeEnter = driver.findElement(By.id("j_idt106:thisform:age"));
//		TypeEnter.click();
		
		
	
		WebElement Dropdown = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt103_toolbar\"]/span[1]/span[1]/span[1]"));
		Dropdown.click();
		
		WebElement Option = driver.findElement(By.xpath("//*[@id=\"ql-picker-options-0\"]/span[3]"));
		Option.click();
		
	
//		WebElement PositionChange = driver.findElement(By.id("j_idt106:float-input"));
//		
//	PositionChange.click();
	}

}
