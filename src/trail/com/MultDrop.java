package trail.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Selenium class\\Webdriver\\chromedriver\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.anhtester.com/basic-select-dropdown-demo.html");
		Thread.sleep(3000);
		WebElement multi = driver.findElement(By.id("multi-select"));
		Select m=new Select(multi);
		System.out.println("***********************");
		if(m.isMultiple()) {
			m.selectByValue("Florida");
			m.selectByValue("New York");
			m.selectByValue("Pennsylvania");
		}
		driver.findElement(By.id("printAll")).click();
		List<WebElement> tot = m.getAllSelectedOptions();
		for(int i=0; i<tot.size(); i++) {
			System.out.println(tot.get(i).getText());
		}
		m.deselectAll();
		WebElement mul = driver.findElement(By.id("multi-select"));
		Select mom=new Select(mul);
		System.out.println("***********************");
		mom.selectByIndex(2);
		driver.findElement(By.id("printMe")).click();
		List<WebElement> test = mom.getAllSelectedOptions();
		for (WebElement webElement : test) {
			System.out.println(webElement.getText());
			
		}
				}

}
