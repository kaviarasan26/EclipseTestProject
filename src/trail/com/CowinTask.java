package trail.com;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CowinTask {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cowin.gov.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		//Thread.sleep(2000);
		JavascriptExecutor jsp=(JavascriptExecutor)driver;
		//jsp.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("(//div[@class=\"row align-items-center\"])[2]")));	
		jsp.executeScript("window.scrollBy(0,1000)");
		//driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//div[@role='tab'])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='Select Your State']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()=' Tamil Nadu ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Select District']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()=' Chennai ']")).click();
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		jsp.executeScript("window.scrollBy(0,200)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='c1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='cdoes1']")).click();
		driver.findElement(By.xpath("//input[@id='c6']")).click();
		driver.findElement(By.xpath("//label[text()='Covishield']")).click();
		
		List<WebElement> count = driver.findElements(By.xpath("//div[@class='row-disp']"));
		List<WebElement> Hosp = driver.findElements(By.xpath("//div[@class='row-disp']//h5"));
		
		System.out.println("********List of Hospital***********");
		for (WebElement s : Hosp) {
		System.out.println(s.getText()); 
		
		}
		
		for (int i = 0; i < count.size(); i++) {
			
		}
		System.out.println("*********No of Hospital*********");
		System.out.println(count.size());
		List<WebElement> ch = driver.findElements(By.xpath("(//div[@class='row-disp']//h5//following::*)[1]"));
	for (int i = 0; i < ch.size(); i++) {
		 System.out.println(ch.get(i).getText());
	}
		String text=((WebElement) ch).getText();
		String k="Chennai";
		if(text.equals(k)) {
			System.out.println("Chennai displayed in list");		
		}else {
			System.out.println("Chennai is not displayed in list");
		}
		
	}

}
