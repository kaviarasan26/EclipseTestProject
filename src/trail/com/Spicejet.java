package trail.com;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.DoubleClickAction;

import net.bytebuddy.asm.Advice.AllArguments;

public class Spicejet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Selenium class\\Webdriver\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
//		driver.get("https://twitter.com/?login");
//		driver.manage().window().maximize();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//a[@data-testid='loginButton']")).click();
//		Thread.sleep(8000);
//		driver.findElement(By.xpath("//input[@autocomplete='username']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@autocapitalize='sentences']")).sendKeys("12345");
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//span[text()='Next']")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//input[@autocomplete='current-password']")).sendKeys("12345");
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//span[text()='Log in']")).click();
//		System.out.println("Login successful");
		
		driver.get("https://www.w3schools.com/java/");
		
//driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

JavascriptExecutor js =(JavascriptExecutor)driver;
js.executeScript("arguments[0].scrollIntoView()", 
		driver.findElement(By.xpath("//div[@class='top10']")));
	List<WebElement> Links = driver.findElements(By.xpath("//h5[text()='Top Tutorials']//parent::*//a"));

for (WebElement Element : Links) {
		Element.sendKeys(Keys.CONTROL, Keys.ENTER);
}
List<WebElement> text = driver.findElements(By.xpath("(//div[@class='top10'])[1]"));
for(int i=0; i<text.size(); i++) {
		System.out.println(text.get(i).getText());
		
		break;
	}
		
	}

}
