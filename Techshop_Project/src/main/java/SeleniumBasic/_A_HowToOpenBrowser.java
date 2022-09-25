package SeleniumBasic;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _A_HowToOpenBrowser {

	public static void abc() {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions opting = new ChromeOptions();
		opting.addArguments("--incognito");
		WebDriver driver = new ChromeDriver (opting);
	
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		
		Actions action = new Actions (driver);
		
		action.moveToElement(driver.findElement(By.cssSelector("#nav-link-accountList"))).build().perform();
		
		driver.findElement(By.linkText("Account")).click();
		
	     
	 }
	
	public static void main(String[] args) {
		
		_A_HowToOpenBrowser s = new _A_HowToOpenBrowser ();
		 s.abc(); 
		
	}

	

}
