package trail.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FacebookLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium class\\Webdriver\\Geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.facebook.com/login.php");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("9043113746");
		driver.findElement(By.id("pass")).sendKeys("Manju@2126");
		driver.findElement(By.name("login")).click();
		System.out.println("Logged in successfully");
	}

}
