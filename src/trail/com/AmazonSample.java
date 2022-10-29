package trail.com;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Selenium class\\Webdriver\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile less than 20000");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.RETURN);		
		//driver.manage().window().maximize();
		List<WebElement> count = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		int s = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).size();
		System.out.println("***************Number of count:" +s);
		//List<WebElement> count = driver.findElements(By.xpath("//*[@data-component-type='s-search-result']"));
		Thread.sleep(2000);
		for (WebElement sam : count) {
			System.out.println(sam.getText());
		}
		
		for (int i = 0; i < count.size(); i++) {
			if(count.get(i).getText().equals("OnePlus Nord CE 2 Lite 5G (Black Dusk, 6GB RAM, 128GB Storage)")) {
				System.out.println("*************************");
				System.out.println(count.get(i).getText());
			}
			
		}
		
	}

}
