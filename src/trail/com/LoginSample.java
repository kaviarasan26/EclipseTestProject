package trail.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Selenium class\\Webdriver\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login.php");
		driver.manage().window().maximize();
//		WebElement findElement = driver.findElement(By.id("email"));
//		findElement.sendKeys("9043113746");
//		Thread.sleep(4000);
//		WebElement findElement2 = driver.findElement(By.id("pass"));
//		findElement2.sendKeys("Manju@2126");
//		Thread.sleep(4000);
//		WebElement findElement3 = driver.findElement(By.name("login"));
//		findElement3.click();
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9043113746");
//		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Manju@2126");
//		driver.findElement(By.xpath("//button[@name='login']")).click();
		driver.findElement(By.xpath("//input[contains(@id, 'email')]")).sendKeys("9043113746");
		driver.findElement(By.xpath("//input[contains(@id, 'pass')]")).sendKeys("Manju@2126");
		System.out.println("Logged in successfully");
		driver.findElement(By.xpath("//button[contains(@name, 'login')]")).click();
		driver.findElement(By.xpath("//div[@aria-label='Your profile']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='Log Out']")).click();
	
		System.out.println("Logged out successfully");
		//driver.close();
	}

}
//input[@id='email']