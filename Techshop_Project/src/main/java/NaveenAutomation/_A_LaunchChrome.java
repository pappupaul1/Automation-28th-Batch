	package NaveenAutomation;
	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	
	import io.github.bonigarcia.wdm.WebDriverManager;
	
	public class _A_LaunchChrome {
		
	 void LaunchChrome() {
	
	 // Launch the Chrome 
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver= new ChromeDriver ();
	 driver.get("https://www.google.com/");
	 driver.manage().window().maximize();

	 
	 // Print The Title in Console
	 String s = driver.getTitle();
	 System.out.println(" Name of the Website title is : "+s);
	 
	 // Check if the goole tiltle is reing or not
	 if(s.equals("Google")) {
		 System.out.println(" Title is correct");
	 } 
	 else {
		 System.out.println(" Title is Incorrect");
		
	 // Print the currentTitle
		 System.out.println(driver.getCurrentUrl()); 
		 
	//	Print get page source
		 System.out.println(driver.getPageSource());
		 
		 
		driver.close();
		driver.quit();
		 
		 
		 
		 
	 }
	 }
		public static void main(String[] args) {
			
			_A_LaunchChrome obj = new _A_LaunchChrome ();
			obj.LaunchChrome();	
			
		}
			
	}
