package trail.com;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Project1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	
		boolean displayed = driver.findElement(By.id("radio-btn-example")).isEnabled();
		System.out.println(displayed);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@value='radio1']")).click();
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("al");
		List<WebElement> list = driver.findElements(By.xpath("//li[@class='ui-menu-item']//div"));
		for (WebElement Suggest : list) {
			if(Suggest.getText().contains("Algeria")) {
				Suggest.click();
			}
		}
		WebElement Droplist = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
	Select Drop=new Select(Droplist);
	Drop.selectByIndex(2);

	
	}

}
