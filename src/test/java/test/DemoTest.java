package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import basepkg.BasePage;
import pages.HomePage;


public class DemoTest extends BaseTest {
	
	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\java\\source\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		
		HomePage hpage = new HomePage(driver);
		hpage.searchBox();
	}
}
