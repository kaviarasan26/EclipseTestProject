package trail.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertSample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Selenium class\\Webdriver\\chromedriver\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		Thread.sleep(6000);
		driver.findElement(By.xpath("(//a[contains(text(),'Alert with OK ')])[1]")).click();
		driver.findElement(By.cssSelector("button[onclick='alertbox()']")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		System.out.println("****Simple Alert****");
		System.out.println("Action successful");

		System.out.println("*****Confirm Alert****");
		driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();
		driver.findElement(By.cssSelector("button[onclick='confirmbox()']")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		WebElement k = driver.findElement(By.id("demo"));
		System.out.println(k.getText());
		
		driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();
		driver.findElement(By.cssSelector("button[onclick='confirmbox()']")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();
		WebElement n = driver.findElement(By.id("demo"));
		System.out.println(n.getText());
		
		System.out.println("****Prompt Alert****");
		driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox ')]")).click();
		driver.findElement(By.cssSelector("button[onclick='promptbox()']")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().sendKeys("Selenium");
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		WebElement m = driver.findElement(By.id("demo1"));
		System.out.println(m.getText());
		
		
		
		
	}

}
