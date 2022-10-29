package trail.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Selenium class\\Webdriver\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("email_create")).sendKeys("Arasaaanh1@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='radio']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("kavi");
		driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("hello");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("kaviarasan");
		WebElement day = driver.findElement(By.id("days"));
		Select n=new Select(day);
		n.selectByValue("17");
		WebElement months = driver.findElement(By.id("months"));
		Select m=new Select(months);
		m.selectByValue("7");
		WebElement years = driver.findElement(By.id("years"));
		Select l=new Select(years);
		l.selectByValue("2022");
		driver.findElement(By.xpath("//input[@name='newsletter']")).click();
		driver.findElement(By.xpath("//input[@name='optin']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("company")).sendKeys("ABCD");
		driver.findElement(By.id("address1")).sendKeys("Anna Nagar");		
		driver.findElement(By.cssSelector("input#address2")).sendKeys("GT");
		driver.findElement(By.id("city")).sendKeys("chennai");
		WebElement state = driver.findElement(By.id("id_state"));
		Select ok=new Select(state);
		ok.selectByValue("14");
		Thread.sleep(2000);
		driver.findElement(By.id("postcode")).sendKeys("600040");
		driver.findElement(By.xpath("//textarea[@name='other']")).sendKeys("2345");
		driver.findElement(By.xpath("//input[@name='phone_mobile']")).sendKeys("3456788");
		driver.findElement(By.cssSelector("input#alias")).sendKeys("Bang");
		driver.findElement(By.xpath("//span[text()='Register']")).click();
		System.out.println("########## Registered Successfully########");
		//driver.close();
		
	}

}
