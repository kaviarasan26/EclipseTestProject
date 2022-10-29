package trail.com;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Calendar.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("datepicker")).click();
		
		while (!driver.findElement(By.className("ui-datepicker-title")).getText().contains("October")) {
			driver.findElement(By.xpath("//span[text()='Next']")).click();
		}
		
		List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody"));
		int size = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody")).size();
		for (int i = 0; i < size; i++) {
			String Datetext = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody")).get(i).getText();
			System.out.println(Datetext);
			if(Datetext.contains("15")) {
				Thread.sleep(2000);
				System.out.println("Hello");
				driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody")).get(i).click();	
				break;
			}
			
		}
		

	}
}
