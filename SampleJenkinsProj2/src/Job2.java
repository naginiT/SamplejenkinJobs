import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Job2 {
	@Test
	public void invoke()

	{
		System.setProperty("webdriver.chromee.driver", "D:\\nagini\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.google.co.in/");
	
	
	}
}
