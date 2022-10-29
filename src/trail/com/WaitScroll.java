package trail.com;

import java.sql.Time;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitScroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		
WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		driver.findElement(By.xpath("(//div[@class='top10'])[1]")).click();
		
		//WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//wait w=new FluentWait(driver).withTimeout(Duration.ofSeconds(12)).pollingEvery(Duration.ofSeconds(15));
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(10,300)");
		
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(10,-300)");
		
	}

}
