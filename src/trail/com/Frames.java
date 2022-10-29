package trail.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Selenium class\\Webdriver\\chromedriver\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		Thread.sleep(5000);
		WebElement fram=driver.findElement(By.xpath("//div[@id='wrapframe']//iframe"));
		driver.switchTo().frame(fram);
		WebElement CLC=driver.findElement(By.id("Click"));
		CLC.click();
		System.out.println("Single frame---"+ CLC.getText());
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		WebElement fram1=driver.findElement(By.xpath("(//div[@id='wrapframe'])[2]/iframe"));
		driver.switchTo().frame(fram1);
		Thread.sleep(2000);
		driver.switchTo().frame("frame2");
		WebElement Nest = driver.findElement(By.id("Click1"));
		Nest.click();
		System.out.println("Nested frame---"+ Nest.getText());
		
		driver.switchTo().defaultContent();
		List<WebElement> num = driver.findElements(By.tagName("iframe"));
		System.out.println("No of frame---"+ num.size());
	}

}
