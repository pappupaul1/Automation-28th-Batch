package NaveenAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _B_DifferentLocators {
	
	public void find() {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.mycontactform.com/index.php");
		
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sample Forms")).click();
		
		driver.findElement(By.name("subject")).sendKeys("math");
		driver.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[1]/td/div/input[1]")).click();
		
		// 
		Select s = new Select (driver.findElement(By.name("q3")));
		s.selectByVisibleText("Second Option");		
		
	}
	
	
	public static void main(String[] args) {
		_B_DifferentLocators obj= new _B_DifferentLocators();
		obj.find();
		
		
	}

}
