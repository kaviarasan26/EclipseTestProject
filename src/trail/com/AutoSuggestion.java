package trail.com;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		WebElement fram = driver.findElement(By.xpath("//div[@class='gb_Re']//following::div[1]//iframe"));
		driver.switchTo().frame(fram);
		WebElement Click = driver.findElement(By.xpath("//button[@aria-label='No thanks']"));
		Click.click();
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("selenium");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		List<WebElement> List = driver.findElements(By.xpath("//li[@class='sbct']//div[@role='option']//div[1]//span"));
	for (WebElement webElement : List) {
		if(webElement.getText().contains("selenium tutorial")) {
			webElement.click();
			System.out.println(driver.getTitle());
			break;
		}
		
		
	}
	}

}
