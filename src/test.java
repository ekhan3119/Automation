

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/evakhan/Documents/driver/chromedriver");

		// Launch browser
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// dynamic wait

		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// get url
		driver.get("https://www.cheapflights.com/");
		WebElement p = driver.findElement(By.xpath("//input[@id='c7ioM-origin']"));
		p.sendKeys("ATL");
		

	}
}