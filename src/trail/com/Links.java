package trail.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium class\\Eclipse\\eclipse projects\\MavenProject_8PM\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
driver.get("https://demo.guru99.com/test/newtours/index.php");
Thread.sleep(2000);
List<WebElement> list= driver.findElements(By.tagName("a"));
int l=list.size();
System.out.println(l);

	}

}
