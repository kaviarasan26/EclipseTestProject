package trail.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium class\\Webdriver\\chromedriver\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		//driver.get("https://www.facebook.com/login.php");
		//System.setProperty("webdriver.edge.driver", "D:\\Selenium class\\Webdriver\\edgedriver_win64\\msedgedriver.exe");
		//EdgeDriver driver = new EdgeDriver();
		//Thread.sleep(4000);
//		driver.get("https://www.amazon.in/");
//		driver.manage().window().maximize();
//		
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
//		driver.navigate().back();
//		Thread.sleep(4000);
//		driver.navigate().forward();
//		Thread.sleep(3000);
//		driver.navigate().refresh();
//		Thread.sleep(10000);
//		driver.manage().window().minimize();
//		Thread.sleep(8000);
//				driver.close();
		driver.get("https://demo.anhtester.com/basic-select-dropdown-demo.html");
		Thread.sleep(3000);
		WebElement multi = driver.findElement(By.id("multi-select"));
		Select m=new Select(multi);
		if(m.isMultiple()) {
			m.selectByValue("Florida");
			m.selectByValue("New York");
			m.selectByValue("Pennsylvania");
			
		}
		
		
	}

}
