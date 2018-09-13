import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpeningBrowser {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\nagini\\chromedriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumhq.org/download/");
		
		
		
	}

}
