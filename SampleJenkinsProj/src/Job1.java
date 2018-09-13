import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Job1 {
	
	@Test
	public void invoke()

	{
		System.setProperty("webdriver.chrome.driver", "D:\\nagini\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.google.co.in/");
	
	
	}
}
