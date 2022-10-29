package trail.com;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MiniProject3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://psyarxiv.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		driver.manage().window().maximize();
		JavascriptExecutor jsp=(JavascriptExecutor)driver;
		jsp.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//input[@id='searchBox']")));
		driver.findElement(By.xpath("//input[@id='searchBox']")).sendKeys("psychology",Keys.ENTER);
		driver.findElement(By.id("sortBy")).click();
		 driver.findElement(By.xpath("//button[text()='Modified Date (newest to oldest)']")).click();
		// jsp.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//div[@id='ember1502']")));
		 Thread.sleep(2000);
		 jsp.executeScript("window.scrollBy(10,400)");
		 driver.findElement(By.partialLinkText("Was She Wearing Red")).click();
		 Thread.sleep(3000);
		 jsp.executeScript("window.scrollBy(10,400)");
		 driver.findElement(By.xpath("//button[@class='btn-link']")).click();
		 List<WebElement> text = driver.findElements(By.xpath("//div[@class='p-t-xs'][2]"));
		for (WebElement t : text) {
		System.out.println(t.getText());	
		}
	}

}
