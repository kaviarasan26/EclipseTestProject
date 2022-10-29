package trail.com;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes",Keys.ENTER);
		driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[2]")).click();
		String parent = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		
//		List<String> list=new ArrayList<String>(windowHandles); //list created
//		driver.switchTo().window(list.get(3));
		
	for (String string : windowHandles) {
			if(!parent.equals(string))
			driver.switchTo().window(string);
			System.out.println(driver.getTitle());
		}
	List<String> list=new ArrayList<String>(windowHandles); //list created
	driver.switchTo().window(list.get(0));
	driver.close();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.quit();
	
	}

}
