package trail.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionSample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Selenium class\\Webdriver\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		WebElement Mouseover = driver.findElement(By.xpath("//span[text()='Hello, Sign in']"));
		act.moveToElement(Mouseover).build().perform();
		act.doubleClick(driver.findElement(By.xpath("//div[@id='nav-xshop']//child::*[3]"))).build().perform();
		act.moveToElement(driver.findElement(By.xpath("//div[@id='nav-subnav']//child::*[4]"))).build().perform();
		//act.contextClick(driver.findElement(By.xpath("//ul[@class='mm-category-list']//child::*//a[1]"))).build().perform();
		
		
	}

}
